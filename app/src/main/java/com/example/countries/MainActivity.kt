package com.example.countries

import android.os.Bundle
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.countries.ui.theme.Cabin
import com.example.countries.ui.theme.CountriesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountriesTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
   Scaffold (
       topBar = { TopBar()}
           ){
       HomeScreen()
   }
}

@Composable
fun HomeScreen() {
    Column(
        modifier= Modifier
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SearchBar()
        filter()
        listCountry()
              }
}

@Composable
fun TopBar(modifier: Modifier = Modifier,) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 15.dp)
            .height(50.dp)
            .background(color = MaterialTheme.colors.background),
        horizontalArrangement = Arrangement.SpaceBetween,
        ) {
        Icon(
            painter = painterResource(id = R.drawable.exlogo),
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier.size(100.dp)
        )

            IconButton(onClick = { /*TODO*/ }) {
            Icon(
               painter = painterResource(id = R.drawable.ic_twotone),
                contentDescription = "",
               tint = Color.White         )
        }

    }
}

// Step: Search bar - Modifiers
@Composable
fun SearchBar(

) {
    TextField(
        value = "",
        onValueChange = {},
           modifier = Modifier.fillMaxWidth(),

        textStyle = TextStyle(color = Color.White, fontSize = 18.sp),
        leadingIcon ={
            Icon(imageVector = Icons.Default.Search, tint = Color.White,
                contentDescription = null)
        },
        placeholder = {
            Text("Search Country", color = Color.White)
        },
        singleLine = true,
        shape = RoundedCornerShape(10.dp)
        , // The TextFiled has rounded corners top left and right by default
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.DarkGray
        ),
    )
}


@Composable
fun filter(){
  Row(modifier = Modifier
      .fillMaxWidth()
      .padding(start = 5.dp, top = 6.dp)
      .background(color = MaterialTheme.colors.background),
      horizontalArrangement = Arrangement.SpaceBetween,
  ) {
   Box(
       modifier = Modifier
           .background(color = MaterialTheme.colors.background)
           .border(0.1.dp, Color.White, RectangleShape)
           .padding(4.dp)
   ) {
     Row() {
        Icon(painter = painterResource(
            id = R.drawable.ic_anguage),
            contentDescription = "", tint = Color.White)
        Text(text = "EN", color = Color.White)
    }
}
      Box(modifier = Modifier
          .background(color = MaterialTheme.colors.background)
          .border(0.1.dp, Color.White, RectangleShape)
          .padding(3.dp)
      ) {
          Row() {
              Icon(painter = painterResource(
                  id = R.drawable.ic_filter),
                  contentDescription = "",tint = Color.White)
              Text(text = "Filter",color = Color.White)
          }
      }
  }
}