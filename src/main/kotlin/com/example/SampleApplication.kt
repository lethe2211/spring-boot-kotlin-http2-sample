package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SampleApplication

fun main(args: Array<String>) {
	runApplication<SampleApplication>(*args)
}

@RestController
class SampleController {
	@GetMapping("/ok")
	fun ok(): String {
		return "OK"
	}
}
