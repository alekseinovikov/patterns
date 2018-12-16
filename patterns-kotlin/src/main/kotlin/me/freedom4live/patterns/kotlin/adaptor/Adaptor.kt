package me.freedom4live.patterns.kotlin.adaptor

object AdapteeSqrt {
    fun sqrt(number: Double): Double = Math.sqrt(number)
}

object AdaptorSqrt {
    fun sqrt(number: Int): Int = AdapteeSqrt.sqrt(number.toDouble()).toInt()
}
