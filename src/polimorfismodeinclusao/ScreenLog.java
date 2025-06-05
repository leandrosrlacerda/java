package polimorfismodeinclusao;

public class ScreenLog extends BaseLog{
    @Override
    protected void log(String message, String level, String time) {
        System.out.println(level + " " + time + ": " + message);
    }
}
