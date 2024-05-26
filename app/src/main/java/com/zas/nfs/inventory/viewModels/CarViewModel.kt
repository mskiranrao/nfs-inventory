package com.zas.nfs.inventory.viewModels

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.zas.nfs.inventory.CarListService
import com.zas.nfs.inventory.Scope
import com.zas.nfs.inventory.form.CarDetails

class CarViewModel: ViewModel() {
    private val _data = listOf<CarDetails>().toMutableStateList()

    fun getCarList(): SnapshotStateList<CarDetails> {
        val list = CarListService().getCarsList(Scope.ALL)
        _data.clear()
        _data.addAll(list)
        return _data
    }

}