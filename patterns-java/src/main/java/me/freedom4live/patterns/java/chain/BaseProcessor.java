package me.freedom4live.patterns.java.chain;

public abstract class BaseProcessor implements Processor {

    private final ProcessorTypes processorType;
    private Processor nextProcessor;

    protected BaseProcessor(ProcessorTypes processorType) {
        this.processorType = processorType;
    }

    @Override
    public void process(ProcessorTypes type) throws Exception {
        if (type == processorType) {
            processInternal();
            return;
        }

        if (null != nextProcessor) {
            nextProcessor.process(type);
            return;
        }

        throw new Exception("Can't find a processor!");
    }

    @Override
    public void setNextProcessor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    protected abstract void processInternal();

}
