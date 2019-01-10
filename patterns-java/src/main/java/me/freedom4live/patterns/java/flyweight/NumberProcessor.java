package me.freedom4live.patterns.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NumberProcessor {

    private final Map<Integer, Processor> processors = new HashMap<>();


    public void process(Integer number) {
        final Processor processor = processors.computeIfAbsent(number, SomethingProcessor::new);
        processor.process();
    }

}
