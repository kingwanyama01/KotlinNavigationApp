package com.wanyama.newnavapp.ui.theme.services



import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wanyama.newnavapp.navigation.ROUTE_SERVICES
import com.wanyama.newnavapp.navigation.ROUTE_SHOP

@Composable
fun ServicesScreen( navController: NavHostController) {

   Column() {


       Text(text = "this is the services screen")


       Text(
           modifier = Modifier
               .clickable {
                   /*navController.navigate(ROUTE_SIGNUP) {

                       popUpTo(ROUTE_SERVICES) { inclusive = true }
                   }*/
               },
           text = "Register",
           style = MaterialTheme.typography.bodyLarge,
           textAlign = TextAlign.Center,
           color = MaterialTheme.colorScheme.onSurface
       )


       Text(
           modifier = Modifier
               .clickable {
                   navController.navigate(ROUTE_SHOP) {

                       popUpTo(ROUTE_SERVICES) { inclusive = true }
                   }
               },
           text = "Shop now",
           style = MaterialTheme.typography.bodyLarge,
           textAlign = TextAlign.Center,
           color = MaterialTheme.colorScheme.onSurface
       )






   }



    
    
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ServiceScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}



