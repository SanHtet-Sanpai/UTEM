package com.example.utem

import android.os.Parcel
import android.os.Parcelable

class ChipModel (private var chip_name: String, private var chip_thumbnail: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

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

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(chip_name)
        parcel.writeInt(chip_thumbnail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ChipModel> {
        override fun createFromParcel(parcel: Parcel): ChipModel {
            return ChipModel(parcel)
        }

        override fun newArray(size: Int): Array<ChipModel?> {
            return arrayOfNulls(size)
        }
    }
}