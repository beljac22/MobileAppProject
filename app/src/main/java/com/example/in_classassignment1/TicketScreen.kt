package com.example.in_classassignment1
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable

@Composable
fun TicketScreen(vm: TicketViewModel){
    var numTix by remember {mutableStateOf("")}
    val availableTicket by vm.availableTickets.collectAsState()
    // if (numTix.length == 0) canBuy = true
    // else canBuy = numTix.toInt() <= availableTicket
    Column {
        Text("Available ticket ${availableTicket}")
        OutlinedTextField(
            onValueChange = {numTix = it},
            value = numTix
        )
        Button(
            onClick = {
                vm.purchaseTickets(numTix.toInt())
            }
        ) {
            Text("Buy")
        }
    }
}