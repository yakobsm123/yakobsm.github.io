import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String firstNubmer, operation, secondNumber;
        int sum = 0;
        boolean isAllRoman1 = false;
        boolean isALLRoman2 = false;
        System.out.println("Введите выражение");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] masx = data.split(" ");
        firstNubmer = masx[0];
        operation = masx[1];
        secondNumber = masx[2];
        Calculate result = new Calculate();
        Validation datacheck = new Validation();
        isAllRoman1 = datacheck.ChekingRoman(masx[0]);
        isALLRoman2 = datacheck.ChekingRoman(masx[2]);
        Validation dataInput = new Validation();
        if (isAllRoman1 == true) {
            if (isALLRoman2 == true) {
                //CheckingTheCorrectData dataInput = new CheckingTheCorrectData();
                Integer firstNubmerArabic = Integer.valueOf(masx[0]);
                Integer secondNumberArabic = Integer.valueOf(masx[2]);
                dataInput.chekTheArabicData(firstNubmerArabic, secondNumberArabic);
                int ResultOfCalculation = result.operationWithNumbers(firstNubmerArabic, secondNumberArabic, operation, sum);
                System.out.println("Результат операции = " + ResultOfCalculation);
            }
        } else {
            int FirstRomanNumber = Convertation.romanToArabic(masx[0]);
            int SecondRomanNumber = Convertation.romanToArabic(masx[2]);
            int ResultOfRomanNumbers = 0;
            ResultOfRomanNumbers = result.operationWithNumbers(FirstRomanNumber, SecondRomanNumber, masx[1], sum);
            Validation.chekTheRomanData(ResultOfRomanNumbers);
            String ResultOfRomanCalculation = ArabicToRoman.arabicToRoman(ResultOfRomanNumbers);
            System.out.println("Результат операции = " + ResultOfRomanCalculation);
        }

    }
}



        