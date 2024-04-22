package com.example.p5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageView() {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Image Description",
            modifier = Modifier.padding(16.dp)
        )
}
