package com.example.mybank.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.example.mybank.data.AccountStatement
import com.example.mybank.data.TransactionType

@Composable
fun AccountStatementCard(account: AccountStatement, modifier: Modifier) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (account.type == TransactionType.Deposit)
                MaterialTheme.colorScheme.secondaryContainer
            else
                MaterialTheme.colorScheme.errorContainer
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = account.date,
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                text = "Account: ${account.accountNumber}",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = account.type.name,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = (if (account.type == TransactionType.Deposit) "+${account.currency}" else "-${account.currency}") + account.amount,
                style = MaterialTheme.typography.titleMedium,
                color = if (account.type == TransactionType.Deposit)
                    MaterialTheme.colorScheme.primary
                else
                    MaterialTheme.colorScheme.error
            )
            Text(
                text = "Balance: $${account.balance}",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
