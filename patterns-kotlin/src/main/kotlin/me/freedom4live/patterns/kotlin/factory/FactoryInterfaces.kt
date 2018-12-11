package me.freedom4live.patterns.kotlin.factory

interface Cat {
    fun meow(): String
}

interface CatFactory {
    fun randomCat(): Cat
    fun namedCat(name: String): Cat
}
