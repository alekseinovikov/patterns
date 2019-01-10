package me.freedom4live.patterns.java.command;

public class DeleteFileCommand implements Command {

    private final File file;

    public DeleteFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.delete();
    }

}
