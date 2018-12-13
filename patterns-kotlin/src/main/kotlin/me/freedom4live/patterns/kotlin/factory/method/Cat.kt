package me.freedom4live.patterns.kotlin.factory.method

import java.util.*

interface Cat {
    fun meow(): String
}

data class NormalCat(private val name: String) : Cat {
    override fun meow(): String = name
}

class CrazyCat : Cat {
    override fun meow(): String = UUID.randomUUID().toString()
}
