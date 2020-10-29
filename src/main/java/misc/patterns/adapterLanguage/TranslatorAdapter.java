package misc.patterns.adapterLanguage;

public class TranslatorAdapter implements JapaneseTarget {

    private RussianAdaptee russianAdaptee;

    public TranslatorAdapter(RussianAdaptee russianAdaptee) {
        this.russianAdaptee = russianAdaptee;
    }

    @Override
    public void showPictures() {
        System.out.println("Show pictures");
    }

    String translate(String japaneseWords) {
        System.out.println("Translating Japanese Words.........");
        japaneseWords = japaneseWords + "  arigatho gosaymas";
        System.out.println(japaneseWords);
        return japaneseWords;
    }

    @Override
    public String readDescription(String words) {
        System.out.println("Reading Japanese Words.........");
        System.out.println(words);
        return words;
    }

}