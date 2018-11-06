package UI;

import java.io.*;
import java.util.Scanner;

public class Language {

    private File file;

    public Language(String language) {
        file = new File("src/UI/" + language.toLowerCase()+".txt");
    }

    /**
     * Searches language.txt for a certain messageID, i.e. "mainmenu3",
     * and returns the corresponding message. Only works when language.txt is structured
     * as one line of the messageID followed by one line of the actual message
     */
    public String getMessage(String textID) {
        String message = "";
        try {
            Scanner scanner = new Scanner(file);
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(line.equals(textID)) {
                    message = scanner.nextLine();
                }
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("text not found in language file!");
        }
        return message;
    }
}
