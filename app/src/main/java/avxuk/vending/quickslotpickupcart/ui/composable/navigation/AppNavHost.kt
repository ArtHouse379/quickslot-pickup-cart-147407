package avxuk.vending.quickslotpickupcart.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import avxuk.vending.quickslotpickupcart.ui.composable.screen.cart.SMFSCartScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.checkout.SMFSCheckoutScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.home.SMFSHomeScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.onboarding.SMFSOnboardingScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.order.SMFSOrdersScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.productdetails.SMFSProductDetailsScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.settings.SMFSSettingsScreen
import avxuk.vending.quickslotpickupcart.ui.composable.screen.splash.SMFSSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            SMFSSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            SMFSOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            SMFSHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            SMFSProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            SMFSCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            SMFSCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            SMFSOrdersScreen()
        }

        composable<NavRoute.Settings> {
            SMFSSettingsScreen()
        }
    }
}