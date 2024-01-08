package org.springboot.springcoredemo

/*
 * @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 * @ComponentScan: Tells Spring to look for other components, configurations, and services in the org.springboot.springcoredemo package, letting it find the controllers.
 * @Configuration: Tags the class as a source of bean definitions for the application context.
 */
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
 * @SpringBootApplication(scanBasePackages = ["org.springboot.springcoredemo", "org.springboot.util"]): Tells Spring Boot to look for other components, configurations, and services in the org.springboot.springcoredemo package and also org.springboot.util package, letting it find the controllers.
 */
@SpringBootApplication(
//	scanBasePackages = ["org.springboot.springcoredemo","org.springboot.util"]
)
class SpringcoredemoApplication

fun main(args: Array<String>) {
	runApplication<SpringcoredemoApplication>(*args)
}
