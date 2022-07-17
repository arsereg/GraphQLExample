package com.ginomarin.graphqlexample.dataFetcher

import com.ginomarin.graphqlexample.model.Address
import com.ginomarin.graphqlexample.repository.AddressRepository
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsData
import com.netflix.graphql.dgs.InputArgument
import org.springframework.beans.factory.annotation.Autowired

@DgsComponent
class AddressDataFetcher(@Autowired val addressRepository: AddressRepository){
    private val addresses = listOf(
        Address(id = 1, street = "5th Ave", city = "NY", zip = "123", country = "US"),
        Address(id = 1, street = "6th Ave", city = "NY", zip = "123", country = "US"),
        Address(id = 1, street = "7th Ave", city = "NY", zip = "123", country = "US")
    );

    @DgsData(parentType = "Query", field = "searchAddresses")
    fun addressses(@InputArgument city: String?): List<Address>{
        if(null == city){
            return this.addresses;
        }
        return this.addresses.filter { it.city.equals(city)}
    }

    @DgsData(parentType = "Mutation", field = "createAddress")
    fun createAddress(@InputArgument("addressRequest") address: Address): Address {
        return this.addressRepository.save(address);
    }

}