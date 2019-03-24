package com.mist.map.service

import com.mist.map.model.Hex
import com.mist.map.model.Map
import org.springframework.stereotype.Service

@Service
class HexagonMapBuilderService {

    fun buildMap(radius: Int): Map {
        val map = Map()
        for (y in -radius..radius) {
            val minX = maxOf(-radius, -y - radius)
            val maxX = minOf(radius, -y + radius)
            val innerSet = mutableSetOf<Hex>()
            for (x in minX..maxX) {
                innerSet.add(Hex(x, y))
            }
            map.fields.add(innerSet)
        }
        return map
    }
}
