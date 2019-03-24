package com.mist.map.model

data class Hex(val x: Int, val y: Int) {
    val z: Int
        get() = -x - y
}
