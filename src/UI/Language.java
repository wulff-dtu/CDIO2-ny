package UI;

import java.io.*;
import java.util.Scanner;

public class Language {

    private File file;
    private String currentLanguage;

    public Language(String language) {
        file = new File("src/UI/"+language.toLowerCase()+".txt");
        currentLanguage = language;
    }

    /**
     * Searches language.txt for a certain messageID, i.e. "mainmenu3",
     * and returns the corresponding message, found on the next line. Only works when language.txt is structured
     * as one line of the messageID followed by one line of the actual message
     */
    public String getMessage(String textID) {
        String message = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.equals(textID)) {
                    message = scanner.nextLine();
                    break;
                }
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("text not found in language file!");
        }
        return message;
    }

    public void setCurrentLanguage(String newLanguage) {
        currentLanguage = newLanguage;
    }

    public String toString() {
        return currentLanguage;
    }
}
