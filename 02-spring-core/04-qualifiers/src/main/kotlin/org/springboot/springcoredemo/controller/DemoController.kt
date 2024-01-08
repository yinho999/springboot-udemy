package org.springboot.springcoredemo.controller

import org.springboot.springcoredemo.common.Coach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
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
// @Qualifier or @Primary is used to specify which bean to inject, @Qualifier should be use together with @Primary and @Qualifier has a higher priority than @Primary
class DemoController (@Qualifier("trackCoach") private val coach: Coach){ // Constructor Injection: @Qualifier is used to specify which bean to inject: "tennisCoach" for TennisCoach bean, "cricketCoach" for CricketCoach bean, "baseballCoach" for BaseballCoach bean
//class DemoController {
    // region Setter Injection - 1
    //    @set :Autowired
    //    lateinit var coach: Coach
    // endregion Setter Injection

    // region Setter Injection - 2
    //    var coach: Coach? = null
    //        @Autowired
    //        @Qualifier("baseballCoach")
    //        set(value) {
    //            field = value
    //        }
    // endregion Setter Injection


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