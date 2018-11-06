package game.test;

import game.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageTest {

    @Test
    void getMessage() {
        Language languageTest = new Language("EnGlIsH");
        System.out.println(languageTest.getMessage("testmessage"));
        assertEquals("yolo", languageTest.getMessage("testmessage"));
    }
}