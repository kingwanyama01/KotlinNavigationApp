package com.wanyama.newnavapp.ui.theme.shop



import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ShopScreen( navController: NavHostController) {

    
    Row() {
        
        Text(text = "shop page")
        
    }
    
    
    
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ShopScreenPreviewLight() {
    ShopScreen( rememberNavController())
}


