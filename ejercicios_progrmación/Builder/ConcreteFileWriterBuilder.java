package Builder;
import java.io.*;
class ConcreteFileWriterBuilder extends AbstractWriterBuilder {
    private String filePath;
    private boolean append;

    public ConcreteFileWriterBuilder(String filePath, boolean append) {
        this.filePath = filePath;
        this.append = append;
    }

    @Override
    public void buildWriter() {
        try {
            FileWriter fileWriter = new FileWriter(filePath, append);
            this.bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}