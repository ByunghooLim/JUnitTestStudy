package com.example.junittest

fun main(args: Array<String>) {
    print("test")
}

interface ScoreAble {
    var score : Int
}

class ScoreCollection {
    private val score = ArrayList<ScoreAble>()

    fun add(scoreAble: ScoreAble) {
        score.add(scoreAble)
    }

    fun arithmaticMean(): Int {
        val total = score.map {
            it.score
        }.sum()

        return total / score.size
    }
}
