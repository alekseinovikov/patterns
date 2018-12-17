package me.freedom4live.patterns.java.composite;

import java.util.ArrayList;
import java.util.List;

class RunnerComposite {

    private final List<Runner> runners = new ArrayList<>();


    void addRunner(Runner runner) {
        runners.add(runner);
    }

    void run() {
        runners.forEach(Runner::run);
    }

}
