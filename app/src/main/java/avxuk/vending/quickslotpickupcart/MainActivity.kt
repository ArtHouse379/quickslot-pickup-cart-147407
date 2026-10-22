package avxuk.vending.quickslotpickupcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import avxuk.vending.quickslotpickupcart.ui.composable.approot.AppRoot
import avxuk.vending.quickslotpickupcart.ui.theme.SMFSAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SMFSAppTheme {
                AppRoot()
            }
        }
    }
}
