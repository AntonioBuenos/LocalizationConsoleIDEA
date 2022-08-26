package by.smirnov.localization.service;

import java.util.Locale;
import java.util.ResourceBundle;

import static by.smirnov.localization.repo.Constants.BASENAME;

public enum ResManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    public Locale locale = Locale.getDefault();

    ResManager() {
        resourceBundle = ResourceBundle.getBundle(BASENAME, Locale.getDefault());;
    }

    public void setLocale(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(BASENAME, locale);
        this.locale = locale;
    }

    public String get(String key){
        return resourceBundle.getString(key);
    }

}
