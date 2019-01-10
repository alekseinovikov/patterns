package me.freedom4live.patterns.java.chain;

public class NormalProcessor extends BaseProcessor implements Processor {

    public NormalProcessor() {
        super(ProcessorTypes.NORMAL);
    }

    protected void processInternal() {
        System.out.println("Normal processing");
    }

}
