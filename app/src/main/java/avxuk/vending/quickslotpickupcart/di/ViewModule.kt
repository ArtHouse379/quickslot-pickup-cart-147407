package avxuk.vending.quickslotpickupcart.di

import avxuk.vending.quickslotpickupcart.ui.viewmodel.AppViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.CartViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.CheckoutViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.OnboardingViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.OrderViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.ProductDetailsViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.ProductViewModel
import avxuk.vending.quickslotpickupcart.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}