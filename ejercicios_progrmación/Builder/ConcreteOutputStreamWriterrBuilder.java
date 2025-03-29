package Builder;
import java.io.*;
class ConcreteOutputStreamWriterBuilder extends AbstractWriterBuilder {
    private OutputStream outputStream;
    private String charsetName;

    public ConcreteOutputStreamWriterBuilder(OutputStream outputStream, String charsetName) {
        this.outputStream = outputStream;
        this.charsetName = charsetName;
    }

    @Override
    public void buildWriter() {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charsetName);
            this.bufferedWriter = new BufferedWriter(outputStreamWriter);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}