package com.example.koboot.repo

import com.example.koboot.entity.Msg
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MsgRepository : JpaRepository<Msg,Long>{

}