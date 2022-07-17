package com.ginomarin.graphqlexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Product(
    @Id
    @GeneratedValue
    var id: Long,
    var name: String,
    var description: String,
    var price: Double,
    var SKU: String
) {
}