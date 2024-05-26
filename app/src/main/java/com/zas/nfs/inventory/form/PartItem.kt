package com.zas.nfs.inventory.form

data class PartItem(val itemName: String) {
    var requiredQty: Int = 0
    var currentQty: Int = 0
    var itemCost: Int = 0
    var imageName: String = ""
}