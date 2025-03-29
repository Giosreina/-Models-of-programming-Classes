package Builder;
import java.io.*;
class WriterDirector {
    private AbstractWriterBuilder builder;

    public WriterDirector(AbstractWriterBuilder builder) {
        this.builder = builder;
    }

    public BufferedWriter constructWriter() {
        builder.buildWriter();
        return builder.getWriter();
    }
}
