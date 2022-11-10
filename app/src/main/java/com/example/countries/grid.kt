package com.example.countries

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun listCountry() {
Surface(
    onClick = { /*TODO*/ },
    modifier = Modifier
        .padding(horizontal = 2.dp, vertical = 8.dp)
        .fillMaxWidth()
        .height(50.dp)
       ,
    color = Color.Transparent

) {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.ken),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(50.dp)
                .clip(RoundedCornerShape(corner = CornerSize(6.dp)))
        )

        Column() {
            Text(text =  "Kenya",color = Color.White)
            Text(text ="Nairobi",color = Color.White)
        }
    }
}
}

/*@Composable
fun GrindLis(){

    LazyColumn(

    ){
      items(

      )
    }
}*/