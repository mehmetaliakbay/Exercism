class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("\\s", "");
        phrase = phrase.replaceAll("-", "").toLowerCase();
        if (phrase.isEmpty() || phrase.length() == phrase.chars().distinct().count())
            return true;
        return false;
    }

}
