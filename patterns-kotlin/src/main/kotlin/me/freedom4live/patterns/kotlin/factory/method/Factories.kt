package me.freedom4live.patterns.kotlin.factory.method

import java.util.*

abstract class AbstractCatFactory {
    protected abstract fun createCatInternal(): Cat

    fun createCat(): Cat = createCatInternal()
}

class NormalCatFactory : AbstractCatFactory() {
    override fun createCatInternal(): Cat =
        NormalCat(UUID.randomUUID().toString())
}

class CrazyCatFactory : AbstractCatFactory() {
    override fun createCatInternal(): Cat =
        CrazyCat()
}
