package avxuk.vending.quickslotpickupcart.data.repository

import avxuk.vending.quickslotpickupcart.data.model.Product
import avxuk.vending.quickslotpickupcart.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Potato Chips",
            description = "A single-serve bag of crisp, lightly salted potato chips. The familiar savory crunch makes it an easy break-time snack. Its sealed pack is sized for quick vending pickup.",
            category = ProductCategory.SAVORY_SNACKS,
            price = 1.25,
            imageUrl = "https://images.unsplash.com/photo-1641693148759-843d17ceac24",
        ),
        Product(
            id = 2,
            title = "Butter Popcorn",
            description = "Ready-to-eat popcorn with a mild buttery flavor and airy crunch. The portion works well for a quick snack at work or on the go. A sealed bag keeps the popcorn fresh until collection.",
            category = ProductCategory.SAVORY_SNACKS,
            price = 1.50,
            imageUrl = "https://images.unsplash.com/photo-1734039037235-57a72e65d630",
        ),
        Product(
            id = 3,
            title = "Oatmeal Cookie",
            description = "A chewy oatmeal cookie dotted with chocolate chips. It offers a balanced mix of toasted oats and gentle sweetness. The individual portion is convenient for an afternoon treat.",
            category = ProductCategory.SWEET_TREATS,
            price = 1.20,
            imageUrl = "https://images.unsplash.com/photo-1497051788611-2c64812349fa",
        ),
        Product(
            id = 4,
            title = "Chocolate Bar",
            description = "A smooth milk chocolate bar with a satisfying cocoa flavor. Snap off a piece or enjoy the whole bar as a compact treat. The wrapper helps protect it inside the vending machine.",
            category = ProductCategory.SWEET_TREATS,
            price = 1.40,
            imageUrl = "https://images.unsplash.com/photo-1620884463224-55e55b0ae83f",
        ),
        Product(
            id = 5,
            title = "Still Mineral Water",
            description = "A chilled bottle of still mineral water for simple everyday hydration. Its clean taste pairs easily with any snack. The secure cap makes it practical to carry after pickup.",
            category = ProductCategory.BOTTLED_WATER,
            price = 1.00,
            imageUrl = "https://images.unsplash.com/photo-1660201231830-1c1af85279ff",
        ),
        Product(
            id = 6,
            title = "Sparkling Water",
            description = "Refreshing bottled water with lively carbonation and no heavy flavor. It is a crisp alternative to a sweet soft drink. Serve it cold for the brightest fizz.",
            category = ProductCategory.BOTTLED_WATER,
            price = 1.20,
            imageUrl = "https://images.unsplash.com/photo-1637905351378-67232a5f0c9b",
        ),
        Product(
            id = 7,
            title = "Orange Juice",
            description = "A convenient bottle of orange juice with a bright citrus taste. It is refreshing alongside breakfast or a midday snack. Keep it chilled and shake gently before drinking.",
            category = ProductCategory.BOTTLED_DRINKS,
            price = 1.80,
            imageUrl = "https://images.unsplash.com/photo-1650547002496-e7ed9df4bf3c",
        ),
        Product(
            id = 8,
            title = "Coca-Cola",
            description = "A cold bottle of Coca-Cola with its classic caramel taste and lively bubbles. It pairs well with salty snacks from the machine. Twist the cap open and enjoy it chilled.",
            category = ProductCategory.BOTTLED_DRINKS,
            price = 1.70,
            imageUrl = "https://images.unsplash.com/photo-1627243969661-5733a115acc2",
        ),
        Product(
            id = 9,
            title = "Hand Sanitizer",
            description = "A compact bottle of hand sanitizer for cleaning hands when soap is unavailable. The portable size fits easily in a bag or desk drawer. Close the cap firmly after each use.",
            category = ProductCategory.PERSONAL_CARE,
            price = 2.50,
            imageUrl = "https://images.unsplash.com/photo-1583947581279-4eec08383c38",
        ),
        Product(
            id = 10,
            title = "Bamboo Toothbrush",
            description = "A practical bamboo toothbrush for daily oral care or unexpected overnight stays. Its compact shape makes it easy to keep in a travel kit. Use it with your preferred toothpaste and replace it regularly.",
            category = ProductCategory.PERSONAL_CARE,
            price = 2.00,
            imageUrl = "https://images.unsplash.com/photo-1676897288522-e8a081e71430",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
