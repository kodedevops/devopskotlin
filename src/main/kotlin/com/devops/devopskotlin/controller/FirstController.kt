package com.devops.devopskotlin.controller

import com.devops.devopskotlin.service.FirstService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController(val firstService: FirstService) {

    @GetMapping("/hello")
    fun sayHello(): String {
        return firstService.sayHello();
    }

    @GetMapping("/list")
    fun getList() : ResponseEntity<List<String>> {
        val list = firstService.getDemoList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/map")
    fun getMap() : ResponseEntity<Map<String, String>>{
        val map = firstService.getDemoMap();
        return ResponseEntity.ok(map)
    }


    @GetMapping("/health")
    fun healthCheck() : ResponseEntity<String> {
        return ResponseEntity.ok("OK");
    }
}