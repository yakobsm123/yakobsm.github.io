public class CheckingTheCorrectData {
    public static void chekTheArabicData(Integer firstNumber, Integer secondNumber) {
        if (firstNumber > 10) {
            throw new IllegalArgumentException(firstNumber + " cannot be used here ");
        }
        if (secondNumber > 10) {
            throw new IllegalArgumentException(secondNumber + " cannot be used here");
        }
    }

    public static void chekTheRomanData (int firstRomanNumber) {
        if (firstRomanNumber < 0) {
            throw new IllegalArgumentException("the result of calculating Arabic numbers cannot be negative");
        }
    }
}