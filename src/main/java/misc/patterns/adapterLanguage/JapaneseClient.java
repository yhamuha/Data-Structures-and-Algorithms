package misc.patterns.adapterLanguage;

/**
 * Adapter:
 * to connect two incompatible systems with incompatible interfaces
 */
public class JapaneseClient {
    public static void main(String args[]) {
        RussianAdaptee radaptee = new RussianAdaptee();
        TranslatorAdapter adapter = new TranslatorAdapter(radaptee);
        String words="Japanses Words";
        String russianWords = adapter.translate(adapter.readDescription(words));
        radaptee.performInstructions(russianWords);
    }
}