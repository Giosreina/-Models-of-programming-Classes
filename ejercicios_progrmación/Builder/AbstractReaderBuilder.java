package Builder;
import java.io.*;

abstract class AbstractReaderBuilder {
    protected BufferedReader bufferedReader;

    public abstract void buildReader();

    public BufferedReader getReader() {
        return bufferedReader;
    }
}