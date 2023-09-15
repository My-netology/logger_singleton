import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    private int logId = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("[" + timeStamp + " #" + logId + "] " + msg);
        ++logId;
    }
}
