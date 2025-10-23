package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        // --- CARD 1 ---
        InfoCard(
            imageRes = R.drawable.logo_umy,
            name = stringResource(id = R.string.nama1),
            address = stringResource(id = R.string.alamat1),
            phone = stringResource(id = R.string.hp1)
        )

        // --- CARD 2 ---
        InfoCard(
            imageRes = R.drawable.logo_umy,
            name = stringResource(id = R.string.nama2),
            address = stringResource(id = R.string.alamat2),
            phone = stringResource(id = R.string.hp2)
        )

// --- CARD 3 ---
        InfoCard(
            imageRes = R.drawable.logo_umy,
            name = stringResource(id = R.string.nama3),
            address = stringResource(id = R.string.alamat3),
            phone = stringResource(id = R.string.hp3)
        )

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Composable
fun InfoCard(
    imageRes: Int,
    name: String,
    address: String,
    phone: String,
    backgroundColor: Color
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor) // ✅ gunakan warna dari parameter
    ){
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            val gambar = painterResource(id = imageRes)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(30.dp))
            Column {
                Text(
                    text = name,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White,
                    modifier = Modifier.padding(top = 15.dp)
                )

                Text(
                    text = address,
                    fontSize = 20.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 10.dp)
                )

                Text(
                    text = "HP: $phone",
                    fontSize = 18.sp,
                    color = Color.Cyan,
                    modifier = Modifier.padding(top = 6.dp)
                )
            }
        }
    }
}