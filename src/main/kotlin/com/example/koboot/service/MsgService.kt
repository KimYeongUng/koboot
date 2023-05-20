package com.example.koboot.service

import com.example.koboot.entity.Msg
import com.example.koboot.repo.MsgRepository
import org.springframework.stereotype.Service

@Service
class MsgService {
    fun getAll(msgRepository: MsgRepository): List<Msg> {
        return msgRepository.findAll()
    }
}