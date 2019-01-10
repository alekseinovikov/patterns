package me.freedom4live.patterns.java.chain;

public interface Processor {
    void process(ProcessorTypes type);
    void setNextProcessor(Processor nextProcessor);
}
