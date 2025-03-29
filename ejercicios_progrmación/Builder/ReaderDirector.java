package Builder;
import java.io.*;
class ReaderDirector {
    private AbstractReaderBuilder builder;

    public ReaderDirector(AbstractReaderBuilder builder) {
        this.builder = builder;
    }

    public BufferedReader constructReader() {
        builder.buildReader();
        return builder.getReader();
    }
}