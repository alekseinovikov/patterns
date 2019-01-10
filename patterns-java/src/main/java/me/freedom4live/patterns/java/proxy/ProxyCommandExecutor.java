package me.freedom4live.patterns.java.proxy;

import java.io.IOException;
import java.util.logging.Logger;

public class ProxyCommandExecutor implements CommandExecutor {

    private final CommandExecutor commandExecutor;
    private final Logger logger = Logger.getGlobal();

    public ProxyCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @Override
    public void exec(String command) throws IOException {
        logger.info("Starting command: " + command);

        commandExecutor.exec(command);

        logger.info("Finishing command: " + command);
    }
}
