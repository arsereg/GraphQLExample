package com.ginomarin.graphqlexample.repository

import com.ginomarin.graphqlexample.model.Invoice
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceRepository : JpaRepository<Invoice, Long> {
}