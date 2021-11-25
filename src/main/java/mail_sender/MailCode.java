package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        String message = "";
        File file = new File("scr/main/java/mail_sender" + filename);
        try{
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            message = scanner.next();
        }
        catch(FileNotFoundException exception){
            exception.printStackTrace();
        }
        return message;
    }
}
