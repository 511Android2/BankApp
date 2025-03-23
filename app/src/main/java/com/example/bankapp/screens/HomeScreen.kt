package com.example.bankapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.components.NewTransaction
import com.example.bankapp.models.TransactionsList
import com.example.bankapp.ui.theme.BackgroundColor
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.CardBeige
import com.example.bankapp.ui.theme.CardGreen
import com.example.bankapp.ui.theme.CardPurple
import com.example.bankapp.utils.Account_circle
import com.example.bankapp.utils.PersonBoundingBox

@Composable
fun HomeScreen(innerPadding:PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(70.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(BackgroundColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Account_circle,
                    contentDescription = "Icono de perfil",
                    modifier = Modifier.size(30.dp),
                    tint = Color.Black
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text (
                    text = "Hola Carlos",
                    fontWeight = FontWeight.Bold
                )
                Text (
                    text = "Bienvenido!",
                    fontSize = 13.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Light
                )
            }
            Spacer(modifier = Modifier.width(185.dp))
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Icono de menu",
                modifier = Modifier
                    .size(30.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(24.dp))
                    .background(CardGreen),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = PersonBoundingBox,
                        contentDescription = "Icono de actividad",
                        modifier = Modifier
                            .size(30.dp),
                        tint = Color.Black
                    )
                    Text (
                        text = "Actividad",
                        fontWeight = FontWeight.Bold
                    )
                    Text (
                        text = "de la semana",
                        fontSize = 13.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Light
                    )
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(CardBeige),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text (
                            text = "Ventas",
                            fontSize = 13.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Light,
                        )
                        Text (
                            text = "$280.99",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(CardPurple),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text (
                            text = "Ganancias",
                            fontSize = 13.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Light
                        )
                        Text (
                            text = "$280.99",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            Text (
                text = "Transactions",
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(190.dp))
            Text (
                text = "See All",
                color = Color.Gray,
                fontWeight = FontWeight.Light
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(TransactionsList) {
                NewTransaction(transactions = it)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    BankAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}