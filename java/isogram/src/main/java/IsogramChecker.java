class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replaceAll("[\\W]", "");
       return phrase.isEmpty() || phrase.length() == phrase.chars().distinct().count();

    }

}
