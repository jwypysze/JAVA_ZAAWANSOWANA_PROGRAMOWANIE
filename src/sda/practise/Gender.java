package sda.practise;

public enum Gender {
    MALE("m", "male", "mężczyzna"),
    FEMALE("f", "female", "kobieta");

    private String abbrv;
    private String translationEn;
    private String translationPl;

    Gender(String abbrv, String translationEn, String translationPl) {
        this.abbrv = abbrv;
        this.translationEn = translationEn;
        this.translationPl = translationPl;
    }

    public String getAbbrv() {
        return abbrv;
    }

    public String getTranslationEn() {
        return translationEn;
    }

    public String getTranslationPl() {
        return translationPl;
    }

    public static Gender findByAbbrv(String abbrv) {
        for (Gender g : Gender.values()) {
            if (g.abbrv.equals(abbrv)) {
                return g;
            }
        }
        return null;
    }
}
