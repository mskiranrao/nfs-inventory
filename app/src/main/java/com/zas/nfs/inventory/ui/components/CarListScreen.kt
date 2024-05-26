package com.zas.nfs.inventory.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zas.nfs.inventory.R
import com.zas.nfs.inventory.form.CarDetails
import com.zas.nfs.inventory.viewModels.CarViewModel

@Composable
fun CarListScreen(modifier: Modifier = Modifier,
                  carViewModel: CarViewModel = viewModel()
) {
    LazyColumn(modifier = modifier.padding(4.dp)) {
        items(items = carViewModel.getCarList()) { carDetails ->
            ListItem(carDetails, modifier)
        }
    }
}

@Composable
fun ListItem(data: CarDetails, modifier: Modifier = Modifier) {
    CarItem(data)
}

@Preview
@Composable
private fun ScreenPreview() {
    CarListScreen()
}