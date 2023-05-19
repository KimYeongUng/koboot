package com.example.koboot.service

import com.example.koboot.data.Msg
import org.springframework.stereotype.Service

@Service
class MsgService {
    fun getAll(): List<Msg> {
        return listOf(Msg(1L,"msg1"),Msg(2L,"msg2"))
    }
}