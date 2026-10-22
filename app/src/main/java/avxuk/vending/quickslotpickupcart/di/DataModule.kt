package avxuk.vending.quickslotpickupcart.di

import avxuk.vending.quickslotpickupcart.data.repository.CartRepository
import avxuk.vending.quickslotpickupcart.data.repository.OnboardingRepository
import avxuk.vending.quickslotpickupcart.data.repository.OrderRepository
import avxuk.vending.quickslotpickupcart.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}