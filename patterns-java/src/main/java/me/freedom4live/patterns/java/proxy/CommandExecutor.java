package me.freedom4live.patterns.java.proxy;

import java.io.IOException;

public interface CommandExecutor {
    void exec(String command) throws IOException;
}
