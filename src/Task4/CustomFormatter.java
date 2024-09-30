package Task4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;


public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append(record.getLevel()).append(", ");
        sb.append(record.getLongThreadID()).append(", ");
        sb.append(record.getLoggerName()).append(", ");
        sb.append(record.getMessage()).append("\n");

        if (record.getThrown() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            record.getThrown().printStackTrace(pw);
            sb.append(sw);
        }

        return sb.toString();
    }
}
