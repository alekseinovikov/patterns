package me.freedom4live.patterns.kotlin.bridge

data class Car(private val engine: Engine) {
    fun drive(): Int = engine.rotate()
}
