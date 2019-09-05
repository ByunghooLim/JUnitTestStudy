package com.example.junittest

import org.junit.Test

import org.junit.Assert.*
import java.lang.reflect.Array.set

class ScoreCollectionTest {

    @Test
    fun add() {
        //fail("not yet")
    }

    @Test
    fun arithmaticMean() {

        // 초기화
        val scoreCollection = ScoreCollection()

        scoreCollection.add(object : ScoreAble {
            override var score: Int = 5
        })

        scoreCollection.add(object : ScoreAble {
            override var score: Int = 7
        })

        //실행
        val result = scoreCollection.arithmaticMean()

        assertEquals(result, 6)
    }
}