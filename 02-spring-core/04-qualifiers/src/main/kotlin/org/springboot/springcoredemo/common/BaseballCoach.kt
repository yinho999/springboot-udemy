package org.springboot.springcoredemo.common

import org.springframework.stereotype.Component

@Component
class BaseballCoach : Coach {
    override fun getDailyWorkout(): String {
        return "Spend 30 minutes on batting practice"
    }
}