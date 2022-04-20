package com.example.designbuild

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designbuild.ui.theme.DesignBuildTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignBuildTheme {

                // A surface container using the 'background' color from the theme
               /* Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }*/
            }
        }
    }
}


@Preview
@Composable
fun LoginScreen() = DesignBuildTheme {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(horizontal = 0.dp)
        ){
            Icon(painter = painterResource(id = R.drawable.statusbar), contentDescription = null, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp) )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(200.dp)

        ) {
            Icon(
                painter = painterResource(id = R.drawable.findit_icon),
                contentDescription = null // decorative element

            )
            Text(text = "findit",
                modifier = Modifier.padding(16.dp))
        }
        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxSize(1f)
                ){
                IconButton(onClick = { /*TODO*/ }) {
                    Text(text = "LOGIN")
                }
        }
    }


}
        /*Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        ){
            Icon(
                painter = painterResource(id = R.drawable.union),
                contentDescription = null // decorative element
            )
            Text(text = "findit")
        }

    }*/

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DesignBuildTheme {
        Text(text = "findit")
    }*/

