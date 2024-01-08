package org.springboot.springcoredemo.controller

import org.springboot.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("")
// Injecting the CricketCoach bean into the DemoController class - Can use @Autowired annotation as well
/*
 * Constructor Injection: Use when dependency is required
 * Setter Injection: Use when dependency is optional
 */
//class DemoController (private val coach: Coach){ // Constructor Injection
class DemoController {
        @set :Autowired // Setter Injection
        lateinit var coach: Coach

        // Field Injection - Don't use this, cause the code harder to test
        // @Autowired
        // lateinit var coach: Coach

        @GetMapping("/hello")
        fun helloWorld(): String {
            return "Hello, World!"
        }

        @GetMapping("/dailyworkout")
        fun getCoach(): String {
            return coach?.getDailyWorkout() ?: "No coach found"
        }
}