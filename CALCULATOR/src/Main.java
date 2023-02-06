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
        isAllRoman1 = result.ChekingRoman(masx[0]);
        isALLRoman2= result.ChekingRoman(masx[2]);
        if (isAllRoman1 == true) {
            if (isALLRoman2 == true ) {
                CheckingTheCorrectData dataInput = new CheckingTheCorrectData();
                Integer firstNubmerArabic = Integer.valueOf(masx[0]);
                Integer secondNumberArabic = Integer.valueOf(masx[2]);
                dataInput.chekTheArabicData(firstNubmerArabic, secondNumberArabic);
                int ResultOfCalculation = result.operationWithNumbers(firstNubmerArabic, secondNumberArabic, operation, sum);
                System.out.println("Результат операции = " + ResultOfCalculation);
            }
        } else{
            int FirstRomanNumber = ConvertationOfNumbers.romanToArabic(masx[0]);
            int SecondRomanNumber = ConvertationOfNumbers.romanToArabic(masx[2]);
            int ResultOfRomanNumbers = 0;
            ResultOfRomanNumbers = result.operationWithNumbers(FirstRomanNumber, SecondRomanNumber, masx[1],sum);
            if(ResultOfRomanNumbers<0){
                throw new IllegalArgumentException("the result of calculating Arabic numbers cannot be negative");
            }else{
            String ResultOfRomanCalculation = arabicToRoman.arabicToRoman(ResultOfRomanNumbers);
            System.out.println("Результат операции = "+ ResultOfRomanCalculation);}

        }
    }
}



        