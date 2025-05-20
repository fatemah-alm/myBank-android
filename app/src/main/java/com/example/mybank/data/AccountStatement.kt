package com.example.mybank.data

enum class TransactionType {
    Deposit, Withdraw
}

data class AccountStatement(
    val date: String,
    val accountNumber:String,
    val amount: Double,
    val type: TransactionType,
    val balance: Double,
    val currency: String
)