public class CheckingTheCorrectData {
    public static void chekTheArabicData(Integer firstArabicNumber, Integer secondArabicNumber) {
        if(firstArabicNumber > 10) {
            throw new IllegalArgumentException(firstArabicNumber + " cannot be used here ");
        }
        if (secondArabicNumber > 10) {
            throw new IllegalArgumentException(secondArabicNumber + " cannot be used here");
        }
    }

    public static void chekTheRomanData (Integer firstRomanNumber) {
        if (firstRomanNumber < 0) {
            throw new IllegalArgumentException("the result of calculating Arabic numbers cannot be negative");
        }
    }
    public boolean ChekingRoman(String first) {
        //System.out.println(first);
        if (first.equals("I")) {
            return false;
        } else if (first.equals("II")) {
            return false;
        } else if (first.equals("III")) {
            return false;
        } else if (first.equals("IV")) {
            return false;
        } else if (first.equals("V")) {
            return false;
        } else if (first.equals("VI")) {
            return false;
        } else if (first.equals("VII")) {
            return false;
        } else if (first.equals("VIII")) {
            return false;
        } else if (first.equals("IX")) {
            return false;
        } else if (first.equals("X")) {
            return false;
        } else {
            return true;
        }
    }
}