package com.mist.example.controller

import com.mist.map.model.Map
import com.mist.map.service.HexagonMapBuilderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/map")
class MapController
@Autowired internal constructor(private val mapBuilderService: HexagonMapBuilderService) {

    @GetMapping
    fun greeting(): Map {
        return mapBuilderService.buildMap(10)
    }

}
