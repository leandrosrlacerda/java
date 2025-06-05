package polimorfismodeinclusao;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileLog fileLog = new FileLog("Teste.txt");
        fileLog.log("Hello World", "INFO", "12:00");
        fileLog.log("Leandro", "DEBUG", "05:00");
        fileLog.info("Info message");
        fileLog.close();

        ScreenLog screenLog = new ScreenLog();
        screenLog.log("Leandro", "WARNING", "03:00");
        screenLog.debug("Debug message");
        System.out.println("Programa finalizado!");
    }
}
