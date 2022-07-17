package com.ginomarin.graphqlexample.repository

import com.ginomarin.graphqlexample.model.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository : JpaRepository<Address, Long> {
}

