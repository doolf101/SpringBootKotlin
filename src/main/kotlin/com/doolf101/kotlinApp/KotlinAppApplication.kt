package com.doolf101.kotlinApp

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinAppApplication

	fun main(args: Array<String>) {
		runApplication<KotlinAppApplication>(*args) {
			setBannerMode(Banner.Mode.OFF)
		}
	}


