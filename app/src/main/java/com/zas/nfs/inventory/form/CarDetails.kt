package com.zas.nfs.inventory.form

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

    var parts: List<PartType> = listOf()

    constructor(make: CarMake, model: String, special: String, year: Int) : this() {
        this.make = make
        this.model = model
        this.special = special
        this.year = year
        val partList = arrayListOf<PartType>()
        partList.add(PartType(type = Type.MOTOR, upgradeCost = 1234, currentStar = 3, maxStar = 4))
        partList.add(PartType(type = Type.TURBO, upgradeCost = 1234, currentStar = 3, maxStar = 4))
        partList.add(
            PartType(
                type = Type.TRANSMISSION,
                upgradeCost = 1234,
                currentStar = 3,
                maxStar = 4
            )
        )
        partList.add(PartType(type = Type.WHEEL, upgradeCost = 1234, currentStar = 3, maxStar = 4))
        partList.add(PartType(type = Type.ECU, upgradeCost = 1234, currentStar = 3, maxStar = 4))
        partList.add(PartType(type = Type.NITRO, upgradeCost = 1234, currentStar = 3, maxStar = 4))
    }

    constructor(
        make: CarMake,
        model: String,
        special: String,
        year: Int,
        parts: List<PartType>
    ) : this(make, model, special, year) {
        this.parts = parts
    }

    companion object {
        val DEFAULT: CarDetails = CarDetails(CarMake(Make.ALFA_ROMEO), "Test Car", "Spec", 3442, getDefaultParts())

        private fun getDefaultParts(): List<PartType> {
            val list = arrayListOf<PartType>()
            list.add(PartType.DEFAULT)
            list.add(PartType.DEFAULT)
            list.add(PartType.DEFAULT)
            list.add(PartType.DEFAULT)
            list.add(PartType.DEFAULT)
            list.add(PartType.DEFAULT)
            return list
        }
    }
}
