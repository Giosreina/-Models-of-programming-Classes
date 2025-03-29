package Builder;
import java.io.*;

abstract class AbstractWriterBuilder {
    protected BufferedWriter bufferedWriter;

    public abstract void buildWriter();

    public BufferedWriter getWriter() {
        return bufferedWriter;
    }
}