package com.example.utem

class ChipModel (private var chip_name: String, private var chip_thumbnail: Int) {

    // Getter and Setter
    fun getChip_name(): String {
        return chip_name
    }

    fun setChip_name(chip_name: String) {
        this.chip_name = chip_name
    }

    fun getChip_thumbnail(): Int {
        return chip_thumbnail
    }

    fun setChip_thumbnail(chip_thumbnail: Int) {
        this.chip_thumbnail = chip_thumbnail
    }
}