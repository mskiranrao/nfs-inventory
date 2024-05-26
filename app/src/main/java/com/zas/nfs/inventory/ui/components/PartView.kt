package com.zas.nfs.inventory.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zas.nfs.inventory.form.PartType
import com.zas.nfs.inventory.ui.theme.NFSInventoryTheme

@Composable
fun PartView(modifier: Modifier = Modifier, partType: PartType = PartType.DEFAULT) {
    Column {
        Text(text = partType.type.type)
        Text(text = partType.currentStar.toString())
        Text(text = partType.maxStar.toString())
        Text(text = partType.upgradeCost.toString())
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CarSubItemPrev() {
    NFSInventoryTheme {
        PartView()
    }
}