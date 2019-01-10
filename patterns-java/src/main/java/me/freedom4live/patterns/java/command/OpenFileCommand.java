package me.freedom4live.patterns.java.command;

public class OpenFileCommand implements Command {
    private final File file;

    public OpenFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.open();
    }
}
