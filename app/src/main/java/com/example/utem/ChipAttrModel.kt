package com.example.utem

class ChipAttrModel (private var attr: String, private var value: String) {

    // Getter and Setter
    fun getChipAttr(): String {
        return attr
    }

    fun setChipAttr(attr: String) {
        this.attr = attr
    }

    fun getChipVal(): String {
        return value
    }

    fun setChipVal(value: String) {
        this.value = value
    }
}