package me.freedom4live.patterns.java.chain;

public interface Processor {
    void process(ProcessorTypes type) throws Exception;
    void setNextProcessor(Processor nextProcessor);
}
