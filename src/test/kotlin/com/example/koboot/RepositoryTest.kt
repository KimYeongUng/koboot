package com.example.koboot

import com.example.koboot.entity.Msg
import com.example.koboot.repo.MsgRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class RepositoryTest(val msgRepository: MsgRepository) {

    @Test
    fun count(){
        val cnt = msgRepository.count()
        Assertions.assertThat(cnt).isEqualTo(0)
    }

    @Test
    fun save(){
        val msg = Msg()
        msg.id = 1L
        msg.msg = "msg"
        msgRepository.save(msg)
    }
}