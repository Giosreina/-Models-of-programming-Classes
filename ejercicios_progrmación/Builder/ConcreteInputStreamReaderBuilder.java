package Builder;
import java.io.*;
class ConcreteInputStreamReaderBuilder extends AbstractReaderBuilder {
    private InputStream inputStream;

    public ConcreteInputStreamReaderBuilder(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void buildReader() {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        this.bufferedReader = new BufferedReader(inputStreamReader);
    }
}