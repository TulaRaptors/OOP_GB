package model;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Logger implements ILogger {
    public String path;
    private boolean append = true;

    public Logger(String path) {
        this.path = path;
    }

    public Logger() {
    }

    @Override
    public void FileWrite(String text) throws IOException {
        FileWriter fileWriter = new FileWriter(path, append);
        PrintWriter print = new PrintWriter(fileWriter);
        print.printf("%s" + "%n", text);
        print.close();
    }

    public void setPath(String path) {
        this.path = path;
    }
}
