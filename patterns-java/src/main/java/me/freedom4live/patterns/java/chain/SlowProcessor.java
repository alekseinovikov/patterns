package me.freedom4live.patterns.java.chain;

public class SlowProcessor extends BaseProcessor implements Processor {

    public SlowProcessor() {
        super(ProcessorTypes.SLOW);
    }

    protected void processInternal() {
        System.out.println("Slow processing");
    }

}
