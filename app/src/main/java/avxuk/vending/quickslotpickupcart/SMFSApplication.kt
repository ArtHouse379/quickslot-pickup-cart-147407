package avxuk.vending.quickslotpickupcart

import android.app.Application
import avxuk.vending.quickslotpickupcart.di.dataModule
import avxuk.vending.quickslotpickupcart.di.dispatcherModule
import avxuk.vending.quickslotpickupcart.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SMFSApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@SMFSApplication)
            modules(appModules)
        }
    }
}
