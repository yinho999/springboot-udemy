package org.springboot.mycoolapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MycoolappApplication

fun main(args: Array<String>) {
	runApplication<MycoolappApplication>(*args)
}
