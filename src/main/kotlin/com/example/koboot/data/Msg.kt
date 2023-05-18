package com.example.koboot.data

import jakarta.persistence.Table

@Table(name = "MESSAGE")
data class Msg(val id:Long,val msg:String)
