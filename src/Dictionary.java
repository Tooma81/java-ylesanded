import java.util.ArrayList;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> translation;

    public Dictionary() {
        this.translation = new HashMap<String, String>();
    }

    public void add(String finnish, String english) {
        this.translation.put(finnish, english);
    }

    public String translate(String finnish) {
        return this.translation.get(finnish);
    }

    public int amountOfWords() {
        return this.translation.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();
        for ( String key : this.translation.keySet() ) {
            translations.add(key + " = " + this.translation.get(key));
        }
        return translations;
    }
}
