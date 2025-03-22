package com.example.bankapp.models

data class Transactions(
    val id: Int,
    val store: String,
    val product: String,
    val money: Double,
    val hour: String
)

val TransactionsList = listOf(
    Transactions(
        id = 1,
        store = "Nike Store",
        product = "Ropa & Zapatos",
        money = 27.67,
        hour = "2:23 PM"
    ),
    Transactions(
        id = 2,
        store = "Pepsi",
        product = "Restaurants & Cafe",
        money = 34.92,
        hour = "10:00 AM"
    )
)