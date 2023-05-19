package com.example.koboot.data

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "MESSAGE")
data class Msg(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    val msg:String
    )
