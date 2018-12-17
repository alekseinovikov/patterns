package me.freedom4live.patterns.java.composite;

import org.junit.jupiter.api.Test;

class RunnerCompositeTest {

    @Test
    void add_noRunners_noExceptions() {
        //arrange
        RunnerComposite composite = new RunnerComposite();

        //act
        composite.addRunner(new Cat());
        composite.addRunner(new Dog());
    }

    @Test
    void run_runners_noExceptions() {
        //arrange
        RunnerComposite composite = new RunnerComposite();
        composite.addRunner(new Cat());
        composite.addRunner(new Dog());

        //act
        composite.run();
    }

}
