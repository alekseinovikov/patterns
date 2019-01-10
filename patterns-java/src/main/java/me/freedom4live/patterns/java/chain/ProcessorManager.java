package me.freedom4live.patterns.java.chain;

public class ProcessorManager {

    private final Processor processorRoot;

    public ProcessorManager() {
        processorRoot = new FastProcessor();
    }

    private void initChain() {
        Processor normalProcessor = new NormalProcessor();
        Processor slowProcessor = new SlowProcessor();

        normalProcessor.setNextProcessor(slowProcessor);
        processorRoot.setNextProcessor(normalProcessor);
    }

    public void process(ProcessorTypes type) throws Exception {
        processorRoot.process(type);
    }

}
