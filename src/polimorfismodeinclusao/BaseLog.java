package polimorfismodeinclusao;

import java.text.DateFormat;
import java.util.Date;

public abstract class BaseLog {

    // algumas constantes úteis
    private final static String DEBUG = "DEBUG";
    private final static String INFO = "INFO";
    private final static String WARNING = "WARNING";
    private final static String ERROR = "ERROR";
    private final static String FATAL = "FATAL";

    DateFormat dateFormat = DateFormat.getDateTimeInstance();

    public void debug(String message){
        log(message, DEBUG, getDate());
    }
    public void info(String message){
        log(message, INFO, getDate());
    }
    public void warning(String message){
        log(message, WARNING, getDate());
    }
    public void error(String message){
        log(message, ERROR, getDate());
    }
    public void fatal(String message){
        log(message, FATAL, getDate());
    }

    // cria uma indicação de tempo
    protected String getDate(){
        Date date = new Date();
        return dateFormat.format(date);
    }

    // permite que as subclasses definam como e onde vão gravar o log
    protected abstract void log(String message, String level, String time);
}
