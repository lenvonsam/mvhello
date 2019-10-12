package sam.trial.mvhello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvhelloApplication

fun main(args: Array<String>) {
	runApplication<MvhelloApplication>(*args)
}
