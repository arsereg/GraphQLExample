package com.ginomarin.graphqlexample.model

import javax.persistence.*

@Entity
class Customer(
    @Id @GeneratedValue var id: String,
    var name: String,
    var email: String,
    var phone: String,
    @OneToOne var address: Address,
    @OneToMany var invoices: List<Invoice>
    ) {

}