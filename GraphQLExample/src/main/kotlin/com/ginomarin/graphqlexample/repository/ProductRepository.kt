package com.ginomarin.graphqlexample.repository

import com.ginomarin.graphqlexample.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}