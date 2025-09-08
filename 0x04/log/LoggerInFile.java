import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(LoggerInFile.class.getName());

        FileHandler fileHandler = new FileHandler("logs.txt");

        SimpleFormatter simpleFormatter = new SimpleFormatter();

        fileHandler.setFormatter(simpleFormatter);

        logger.addHandler(fileHandler);

        logger.info("teste de Log");

        logger.info("Olá, eu sou o teste da classe principal");

    }

}