package com.zas.nfs.inventory.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zas.nfs.inventory.form.CarDetails
import com.zas.nfs.inventory.ui.theme.NFSInventoryTheme

@Composable
fun CarSubItem(modifier: Modifier = Modifier, carDetail: CarDetails = CarDetails.DEFAULT) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxWidth().height(200.dp)
    ) {
        items(carDetail.parts) { part ->
            PartView(modifier, part)
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CarSubItemPrev() {
    NFSInventoryTheme {
        CarSubItem()
    }
}