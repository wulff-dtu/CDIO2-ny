package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Language {

    private String languagefile;

    public Language(String language) {
        this.languagefile = language.toLowerCase()+".txt";
    }

    /**
     * Searches language.txt for a certain messageID, i.e. "mainmenu3",
     * and returns the corresponding message. Only works when language.txt is structured
     * as one line of the messageID followed by one line of the actual message
     */
    public String getMessage(String messageID) {
        String message = "";
        String currentLine;
        String file = languagefile;

        try {
            do {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                currentLine = reader.readLine();
                message = reader.readLine();
            } while (!currentLine.equalsIgnoreCase(messageID));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return message;
    }
}
