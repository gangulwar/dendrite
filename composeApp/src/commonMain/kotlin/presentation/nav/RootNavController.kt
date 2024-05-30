package presentation.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import presentation.ui.MainChatView
import presentation.ui.views.RoomOptionsView

enum class Screens(val route: String) {
    Start("START_SCREEN"),
    Chat("CHAT_SCREEN")
}

@Composable
fun RootNavController(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Start.route
    ) {
        composable(route = Screens.Start.route) {
            RoomOptionsView(navController = navController)
        }

        composable(route = Screens.Chat.route) {
            MainChatView(navController = navController)
        }
    }

}

