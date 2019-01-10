package me.freedom4live.patterns.java.flyweight;

public class SomethingProcessor implements Processor {

    private final Integer number;


    public SomethingProcessor(Integer number) {
        this.number = number;
    }

    @Override
    public void process() {
        System.out.println(number);
    }

}
