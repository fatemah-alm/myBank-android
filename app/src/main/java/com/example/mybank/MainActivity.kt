package com.example.mybank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mybank.composables.AccountStatementList
import com.example.mybank.data.AccountStatement
import com.example.mybank.data.TransactionType
import com.example.mybank.ui.theme.MyBankTheme
val accounts = listOf(
    AccountStatement("2025-05-01", "123456789", 2000.0, TransactionType.Deposit, 2000.0 ,"USD"),
    AccountStatement("2025-05-03", "878292344", 150.0, TransactionType.Withdraw, 4850.0,"KWD"),
    AccountStatement("2025-05-04", "443440055", 600.0, TransactionType.Deposit, 5450.0,"GPB"),
    AccountStatement("2025-05-06", "220883994", 300.0, TransactionType.Withdraw, 5150.0,"KWD"),
    AccountStatement("2025-05-08", "122303449", 1200.0, TransactionType.Deposit, 6350.0,"KWD")
)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


                    AccountStatementList(accounts)

            }
        }
    }




