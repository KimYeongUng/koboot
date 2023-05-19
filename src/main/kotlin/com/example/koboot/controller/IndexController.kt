package com.example.koboot.controller

import com.example.koboot.data.Msg
import com.example.koboot.service.MsgService
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class IndexController(private val msgService: MsgService) {
    val log:Logger = LoggerFactory.getLogger(IndexController::class.java)

    @GetMapping(path = ["/"])
    fun index():String {
        log.info("index")
        return "Hello"
    }

    @GetMapping("/api/getList")
    fun getMsg():List<Msg>{
        return msgService.getAll()
    }

}