package me.freedom4live.patterns.kotlin.bridge

interface Engine {
    fun rotate(): Int
}

class ReactiveEngine : Engine {
    override fun rotate(): Int = 1000
}

class DieselEngine : Engine {
    override fun rotate(): Int = 500
}
