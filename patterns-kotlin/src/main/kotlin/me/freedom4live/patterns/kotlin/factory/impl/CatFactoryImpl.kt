package me.freedom4live.patterns.kotlin.factory.impl

import me.freedom4live.patterns.kotlin.factory.Cat
import me.freedom4live.patterns.kotlin.factory.CatFactory
import java.util.*

class CatFactoryImpl : CatFactory {
    override fun randomCat(): Cat = object : Cat {
        private val name = UUID.randomUUID().toString()
        override fun meow(): String = name
    }

    override fun namedCat(name: String): Cat = object : Cat {
        override fun meow(): String = name
    }
}
