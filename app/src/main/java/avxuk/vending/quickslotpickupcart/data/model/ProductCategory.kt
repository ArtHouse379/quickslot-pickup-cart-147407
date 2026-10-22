package avxuk.vending.quickslotpickupcart.data.model

import androidx.annotation.StringRes
import avxuk.vending.quickslotpickupcart.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    SAVORY_SNACKS(R.string.product_category_savory_snacks_title),
    SWEET_TREATS(R.string.product_category_sweet_treats_title),
    BOTTLED_WATER(R.string.product_category_bottled_water_title),
    BOTTLED_DRINKS(R.string.product_category_bottled_drinks_title),
    PERSONAL_CARE(R.string.product_category_personal_care_title),
}
