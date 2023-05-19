package com.example.koboot

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class,MockitoExtension::class)
class KobootApplicationTests {

    @Autowired
    private lateinit var mockMvc : MockMvc

    @BeforeEach
    fun before(){
        println("SetUp")
    }

    @AfterEach
    fun after(){
        println("Test Tear Down")
    }

    @Test
    fun notFoundPage(){
        mockMvc.get("/notFoundPage").andExpect {
            status { isNotFound() }
        }
    }

}
