package polimorfismodeinclusao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLog extends BaseLog {

    private PrintWriter writer;

    public FileLog(String fileName) throws IOException {
        writer = new PrintWriter(new FileWriter(fileName));
    }

    @Override
    protected void log(String message, String level, String time) {
        writer.println(time + " " + level + ": " + message);
        // garante que cada mensagem de log seja realmente gravada no arquivo
        writer.flush();
    }

    public void close() {
        writer.close();
    }
}
