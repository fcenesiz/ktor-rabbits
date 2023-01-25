package com.fcenesiz.plugins

import com.fcenesiz.routes.randomRabbit
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        randomRabbit()


        static {
            resources("static")
        }
    }
}
