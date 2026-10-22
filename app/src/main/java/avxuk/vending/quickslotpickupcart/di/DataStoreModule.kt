package avxuk.vending.quickslotpickupcart.di

import avxuk.vending.quickslotpickupcart.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}