package no.fintlabs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FintCoreConsumerKotlinApplication

fun main(args: Array<String>) {
	runApplication<FintCoreConsumerKotlinApplication>(*args)
}
