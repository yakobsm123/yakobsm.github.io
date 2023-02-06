public class CheckingTheCorrectData {
    public static void chekTheArabicData(Integer firstNumber, Integer secondNumber) {
        if (firstNumber > 10) {
            throw new IllegalArgumentException(firstNumber+" cannot be used here ");
        }
        if (secondNumber > 10) {
            throw new IllegalArgumentException(secondNumber + " cannot be used here");
        }
    }
}