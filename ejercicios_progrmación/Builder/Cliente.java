package Builder;
import java.io.*;
public class Cliente {
    public static void main(String[] args) {
        // Ejemplo con FileReader
        AbstractReaderBuilder fileReaderBuilder = new ConcreteFileReaderBuilder("example.txt");
        ReaderDirector fileDirector = new ReaderDirector(fileReaderBuilder);
        BufferedReader fileBufferedReader = fileDirector.constructReader();

        // Ejemplo con InputStreamReader
        AbstractReaderBuilder inputStreamReaderBuilder = new ConcreteInputStreamReaderBuilder(System.in);
        ReaderDirector inputStreamDirector = new ReaderDirector(inputStreamReaderBuilder);
        BufferedReader inputStreamBufferedReader = inputStreamDirector.constructReader();

        AbstractWriterBuilder fileWriterBuilder = new ConcreteFileWriterBuilder("output.txt", true);
        WriterDirector filesDirector = new WriterDirector(fileWriterBuilder);
        BufferedWriter fileBufferedWriter = filesDirector.constructWriter();

        try {
            fileBufferedWriter.write("Texto agregado al archivo");
            fileBufferedWriter.newLine();
            fileBufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ejemplo con OutputStreamWriter (escribiendo en consola)
        AbstractWriterBuilder outputStreamWriterBuilder = 
            new ConcreteOutputStreamWriterBuilder(System.out, "UTF-8");
        WriterDirector outputStreamDirector = new WriterDirector(outputStreamWriterBuilder);
        BufferedWriter consoleBufferedWriter = outputStreamDirector.constructWriter();

        try {
            consoleBufferedWriter.write("Texto escrito en consola");
            consoleBufferedWriter.newLine();
            consoleBufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}