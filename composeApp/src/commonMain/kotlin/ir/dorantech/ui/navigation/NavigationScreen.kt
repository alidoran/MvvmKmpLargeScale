package ir.dorantech.ui.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.dorantech.ui.model.FirstScreenButtons
import ir.dorantech.ui.screen.MainScreen

@Composable
fun NavigationScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {

        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = RouteApp.MainRoute
        ) {
            composable<RouteApp.MainRoute> {
                MainScreen(
                    onButtonClick = {clickedButton ->
                        when (clickedButton){
                            FirstScreenButtons.Retrofit ->
                                navController.navigate(RouteApp.RetrofitRoute)
                        }
                    },
                    modifier = modifier
                )
            }

            composable<RouteApp.RetrofitRoute> {

            }
        }
    }
}