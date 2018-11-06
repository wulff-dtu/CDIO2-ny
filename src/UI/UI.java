package UI;

public class UI {

    Language language;

    public UI(){
        language = new Language("ENGLISH"); //English is the default language.
        System.out.println(language.getMessage("testmessage2")); //for at teste om det virker
    }

    public void setLanguage(String language) {
        this.language = new Language(language);
    }
}
