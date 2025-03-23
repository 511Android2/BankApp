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
    ),
    Transactions(
        id = 3,
        store = "Coca-Cola",
        product = "Potato Chips & Soda",
        money = 58.42,
        hour = "7:30 AM"
    ),
    Transactions(
        id = 4,
        store = "Liverpool",
        product = "Clothes & Shoes",
        money = 876.12,
        hour = "5:00 PM"
    ),
    Transactions(
        id = 5,
        store = "Domino's Pizza",
        product = "Pizza & Soda",
        money = 109.42,
        hour = "10:30 PM"
    ),
    Transactions(
        id = 2,
        store = "SubWay",
        product = "Sandwich & Cookie",
        money = 77.99,
        hour = "1:00 PM"
    )
)