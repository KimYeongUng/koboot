package com.example.koboot.controller

import com.example.koboot.data.Msg
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class IndexController {
    val log:Logger = LoggerFactory.getLogger(IndexController::class.java)

    @GetMapping(path = ["/"])
    fun index():String {
        log.info("index")
        return "Hello"
    }

    @GetMapping(path = ["/msgs"])
    fun lists() = listOf(Msg(1,"Msg1"),Msg(2,"Msg2"),Msg(3,"Msg3"))

}