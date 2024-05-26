package com.zas.nfs.inventory.form

data class PartType(
    val type: Type,
    var parts: List<PartItem> = listOf(),
    var upgradeCost: Int = 0,
    var currentStar: Int = 0,
    var maxStar: Int = 0
) {
    companion object {
        val DEFAULT: PartType = PartType(
            type = getDefaultType((0..5).random()),
            parts = getDefaultList(),
            upgradeCost = (1000..90000).random(),
            currentStar = (0..5).random(),
            maxStar = (5..8).random()
        )

        private fun getDefaultType(pos: Int): Type {
            return when (pos) {
                1 -> Type.TURBO
                2 -> Type.TRANSMISSION
                3 -> Type.WHEEL
                4 -> Type.ECU
                5 -> Type.NITRO
                else -> Type.MOTOR
            }
        }

        private fun getDefaultList(): List<PartItem> {
            val list = arrayListOf<PartItem>()
            for (i in 0..4) {
                var name = Char((65..90).random()).toString()
                for (j in 0..(4..9).random()) {
                    name += Char((97..122).random()).toString()
                }
                val item = PartItem(name)
                item.itemCost = (1000..99999).random()
                item.currentQty = (0..5).random()
                item.requiredQty = (item.currentQty..10).random()
                list.add(item)
            }
            return list
        }
    }
}

enum class Type(val type: String) {
    MOTOR("Motor"),
    TURBO("Turbo"),
    TRANSMISSION("Transmission"),
    WHEEL("Wheel"),
    ECU("ECU"),
    NITRO("Nitro"),
}