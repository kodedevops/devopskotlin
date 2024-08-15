package com.devops.devopskotlin.service

import org.springframework.stereotype.Service

@Service
class FirstService {

    fun sayHello(): String {
        return "Hello World";
    }

    fun getDemoList() : List<String> {
        return listOf("delhi", "calcutta", "chennai", "mumbai")
    }

    fun getDemoMap(): Map<String, String> {
        return mapOf("id" to "1", "email" to "abcd@abcd.com")
    }
}