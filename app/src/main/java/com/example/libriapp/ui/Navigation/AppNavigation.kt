package com.example.libriapp.ui.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.libriapp.ui.Screens.Action.actionB
import com.example.libriapp.ui.Screens.Adventure.adventure
import com.example.libriapp.ui.Screens.BookPage.pageContent
import com.example.libriapp.ui.Screens.Chat.ChatContent
import com.example.libriapp.ui.Screens.Horror.horror
import com.example.libriapp.ui.Screens.Login.LoginScreen
import com.example.libriapp.ui.Screens.Main.principal
import com.example.libriapp.ui.Screens.ProfileScreen.profile
import com.example.libriapp.ui.Screens.Romance.romance


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination= TabScreens.LoginScreen.route){
        composable(route = TabScreens.MainScreen.route){
            principal(navController)
        }
        composable(route = TabScreens.BookPageScreen.route){
            pageContent(navController)
        }
        composable(route = TabScreens.ChatScreen.route){
            ChatContent(navController)
        }
        composable(route = TabScreens.ProfileScreen.route){
            profile(navController)
        }
        composable(route = TabScreens.AdventureScreen.route){
            adventure(navController)
        }
        composable(route = TabScreens.ActionScreen.route){
            actionB(navController)
        }
        composable(route = TabScreens.HorrorScreen.route){
            horror(navController)
        }
        composable(route = TabScreens.RomanceScreen.route){
            romance(navController)
        }
        composable(route = TabScreens.LoginScreen.route){
            LoginScreen(navController)
        }
    }
}