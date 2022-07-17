package com.ginomarin.graphqlexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Invoice(
    @Id @GeneratedValue var id: Long,
    var currency: String,
    var customerId: Long,
    var invoiceDate: String,
    @OneToMany var productList: List<Product>
    ){
}