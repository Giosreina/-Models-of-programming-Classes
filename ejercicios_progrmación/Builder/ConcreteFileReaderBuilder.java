package Builder;
import java.io.*;   
class ConcreteFileReaderBuilder extends AbstractReaderBuilder {
    private String filePath;

    public ConcreteFileReaderBuilder(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void buildReader() {
        try {
            FileReader fileReader = new FileReader(filePath);
            this.bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}