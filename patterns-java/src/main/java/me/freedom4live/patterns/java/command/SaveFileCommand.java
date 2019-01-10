package me.freedom4live.patterns.java.command;

public class SaveFileCommand implements Command {
    private final File file;

    public SaveFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.save();
    }

}
