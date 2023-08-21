package com.wanyama.newnavapp.ui.theme.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wanyama.newnavapp.ui.theme.spacing
import com.wanyama.newnavapp.R
import com.wanyama.newnavapp.navigation.ROUTE_ABOUT
import com.wanyama.newnavapp.navigation.ROUTE_HOME
import com.wanyama.newnavapp.navigation.ROUTE_SERVICES
import com.wanyama.newnavapp.navigation.ROUTE_SHOP

@Composable
fun HomeScreen( navController: NavHostController) {
    val spacing = MaterialTheme.spacing
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(spacing.medium)
            .padding(top = spacing.extraLarge),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Welcome, ",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface
        )

     /*   Text(
            text = viewModel?.currentUser?.displayName ?: "",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.onSurface
        )
*/
        Text(
            text = "Welcome to our App",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.onSurface
        )

        Image(
            painter = painterResource(id = R.drawable.airplane),
            contentDescription = stringResource(id = R.string.empty),
            modifier = Modifier.size(128.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(spacing.medium)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Text(
                    text = "Name: ",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.3f),
                    color = MaterialTheme.colorScheme.onSurface
                )

                Text(
                    text = "viewModel?.currentUser?.displayName ?:"+ "",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.7f),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Text(
                    text = "Email: ",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.3f),
                    color = MaterialTheme.colorScheme.onSurface
                )

                Text(
                    text = "viewModel?.currentUser?.email ?:"+ "",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.weight(0.7f),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                Button(
                    onClick = {
                        /*navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }*/
                        
                        // REMOVE THE POP FUNCTION TO ALLOW SOMEONE COME BACK
                        navController.navigate(ROUTE_ABOUT) 
                    },
                    modifier = Modifier
                        .padding(top = spacing.extraLarge)
                ) {
                    Text(text = "About")
                }

                Button(
                    onClick = {
                        navController.navigate(ROUTE_SERVICES) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                    modifier = Modifier
                        .padding(top = spacing.extraLarge)
                ) {
                    Text(text = "Service")
                }

                Button(
                    onClick = {
                        navController.navigate(ROUTE_SHOP) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                    modifier = Modifier
                        .padding(top = spacing.extraLarge)
                ) {
                    Text(text = "Shop")
                }
            }


        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    HomeScreen( rememberNavController())
}

