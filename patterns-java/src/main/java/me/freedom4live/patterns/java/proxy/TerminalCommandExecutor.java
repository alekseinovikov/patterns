package me.freedom4live.patterns.java.proxy;

import java.io.IOException;

public class TerminalCommandExecutor implements CommandExecutor {
    @Override
    public void exec(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }
}
