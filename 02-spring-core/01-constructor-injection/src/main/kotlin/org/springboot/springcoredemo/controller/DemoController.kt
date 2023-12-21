package org.springboot.springcoredemo.controller

import org.springboot.springcoredemo.component.Coach
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("")
// Injecting the CricketCoach bean into the DemoController class - Can use @Autowired annotation as well
class DemoController (private val coach: Coach){

        @GetMapping("/hello")
        fun helloWorld(): String {
            return "Hello, World!"
        }

        @GetMapping("/dailyworkout")
        fun getCoach(): String {
            return coach.getDailyWorkout()
        }
}