package com.ginomarin.graphqlexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Address(
    @Id @GeneratedValue val id: Long,
    val street: String,
    val city: String,
    val zip: String,
    val country: String
) {
}