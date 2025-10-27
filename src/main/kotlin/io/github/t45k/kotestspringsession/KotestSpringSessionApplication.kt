package io.github.t45k.kotestspringsession

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.session.data.redis.config.annotation.web.server.EnableRedisWebSession

@SpringBootApplication
@EnableRedisWebSession
class KotestSpringSessionApplication

fun main(args: Array<String>) {
    runApplication<KotestSpringSessionApplication>(*args)
}
