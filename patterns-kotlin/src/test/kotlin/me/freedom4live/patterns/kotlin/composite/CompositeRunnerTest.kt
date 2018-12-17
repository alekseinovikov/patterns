package me.freedom4live.patterns.kotlin.composite

import org.junit.jupiter.api.Test

internal class CompositeRunnerTest {

    @Test
    fun add_hasNoRunners_noException() {
        //arrange
        val composite = CompositeRunner()

        //act
        composite.add(Cat())
        composite.add(Dog())
    }

    @Test
    fun run_hasRunners_noException() {
        //arrange
        val composite = CompositeRunner().also {
            it.add(Cat())
            it.add(Dog())
        }

        //act
        composite.run()
    }

}
