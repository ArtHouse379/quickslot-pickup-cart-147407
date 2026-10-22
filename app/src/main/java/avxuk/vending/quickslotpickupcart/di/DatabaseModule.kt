package avxuk.vending.quickslotpickupcart.di

import androidx.room.Room
import avxuk.vending.quickslotpickupcart.data.database.SMFSAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "smfs_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = SMFSAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<SMFSAppDatabase>().cartItemDao() }

    single { get<SMFSAppDatabase>().orderDao() }
}