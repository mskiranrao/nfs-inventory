package com.zas.nfs.inventory.form

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class CarDetails() {
    fun getName(): String {
        return model +
                (if (special.isNotEmpty()) " ($special)" else "") +
                (if (year > 0) " $year" else "")
    }

    var make: CarMake = CarMake()
    var model: String = ""
    var special: String = ""
    var year: Int = 0

    constructor(make: CarMake, model: String, special: String, year: Int) : this() {
        this.make = make
        this.model = model
        this.special = special
        this.year = year
    }
}
