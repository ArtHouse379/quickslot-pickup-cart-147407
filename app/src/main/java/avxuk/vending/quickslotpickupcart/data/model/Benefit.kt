package avxuk.vending.quickslotpickupcart.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Outlined.Verified,
        text = "Vending-ready quality",
    ),
    Benefit(
        icon = Icons.Outlined.VerifiedUser,
        text = "Purchase protection",
    ),
    Benefit(
        icon = Icons.Outlined.ShoppingBag,
        text = "Everyday essentials",
    ),
)
