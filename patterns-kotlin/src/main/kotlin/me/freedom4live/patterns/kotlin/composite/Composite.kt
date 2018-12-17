package me.freedom4live.patterns.kotlin.composite

interface Runner {
    fun run()
}

class CompositeRunner {
    private val runners = mutableListOf<Runner>()

    fun add(runner: Runner) = runners.add(runner)
    fun run() = runners.forEach { it.run() }
}

class Cat : Runner {
    override fun run() {
        println("Cat is running!")
    }
}

class Dog : Runner {
    override fun run() {
        println("Dog is running!")
    }
}
