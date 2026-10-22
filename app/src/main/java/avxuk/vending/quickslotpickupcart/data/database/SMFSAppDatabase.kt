package avxuk.vending.quickslotpickupcart.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import avxuk.vending.quickslotpickupcart.data.database.dao.CartItemDao
import avxuk.vending.quickslotpickupcart.data.database.dao.OrderDao
import avxuk.vending.quickslotpickupcart.data.database.converter.Converters
import avxuk.vending.quickslotpickupcart.data.entity.CartItemEntity
import avxuk.vending.quickslotpickupcart.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class SMFSAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}