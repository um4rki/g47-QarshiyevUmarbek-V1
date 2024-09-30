package Task4;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestHandler {
    static Logger logger = Logger.getLogger(TestHandler.class.getName());

    public static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("loggerhandler.log", true);
        handler.setFormatter(new CustomFormatter());
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        try {
            if (new Random().nextBoolean()) {
                throw new RuntimeException("Exception occurred!");
            }
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Exception occurred!", e);
        }
    }
}
