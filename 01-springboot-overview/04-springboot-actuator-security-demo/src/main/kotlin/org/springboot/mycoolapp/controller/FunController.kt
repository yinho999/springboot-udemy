package org.springboot.mycoolapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FunController {

    @GetMapping("/")
    public fun sayHello(): String {
        return "Hello, world!"
    }


    // endpoint for workout
    @GetMapping("/workout")
    public fun getWorkout(): String {
        return "Run a hard 5k!"
    }
}