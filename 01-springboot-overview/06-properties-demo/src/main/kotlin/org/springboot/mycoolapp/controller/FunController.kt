package org.springboot.mycoolapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FunController {
    // Using @Value annotation to inject values from application properties
    @Value("\${coach.name}")
    private lateinit var coachName: String

    @Value("\${team.name}")
    private lateinit var teamName: String


    @GetMapping("/")
    public fun sayHello(): String {
        return "Hello, world!"
    }


    // endpoint for workout
    @GetMapping("/workout")
    public fun getWorkout(): String {
        return "Run a hard 5k!"
    }
   
    // endpoint for coach name and team name
    @GetMapping("/teaminfo")
    public fun getTeamInfo(): String {
        return "Coach: $coachName, Team: $teamName"
    } 
}