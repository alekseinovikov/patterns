package me.freedom4live.patterns.java.chain;

public class FastProcessor extends BaseProcessor implements Processor {

    public FastProcessor() {
        super(ProcessorTypes.FAST);
    }

    protected void processInternal() {
        System.out.println("Fast processing");
    }

}
