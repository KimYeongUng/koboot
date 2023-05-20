package com.example.koboot.entity

import jakarta.persistence.*

@Entity
class Msg() {

    @Id
    var id: Long? = null
    var msg: String? = null
}