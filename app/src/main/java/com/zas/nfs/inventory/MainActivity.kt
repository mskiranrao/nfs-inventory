package com.zas.nfs.inventory

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.zas.nfs.inventory.ui.components.CarListScreen
import com.zas.nfs.inventory.ui.theme.NFSInventoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFSInventoryTheme {
                CarListScreen()
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Dark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true, widthDp = 320,
    name = "Light"
)
@Composable
fun ScreenPreview() {
    NFSInventoryTheme {
        CarListScreen()
    }
}
