import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String firstNubmer, operation, secondNumber;
        int sum = 0;
        boolean flg1 = false;
        boolean flg2 = false;
        Calculate res1 = new Calculate();
        System.out.println("Введите выражение");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] masx = s1.split(" ");
        firstNubmer = masx[0];
        operation = masx[1];
        secondNumber = masx[2];
        flg1 = res1.ChekingRoman(masx[0]);
        flg2 = res1.ChekingRoman(masx[2]);
        if (flg1 == true) {
            //System.out.println("KEK");
            if (flg2 == true ) {
                //условия на арабские или римскими числами ?
                Integer FirstNubmer = Integer.valueOf(masx[0]);
                Integer SecondNumber = Integer.valueOf(masx[2]);
                if (FirstNubmer > 10) {
                    throw new IllegalArgumentException(FirstNubmer + " cannot be used here ");
                }
                if (SecondNumber>10){
                    throw new IllegalArgumentException(SecondNumber + " cannot be used here");
                }
                int ResultOfCalculation = res1.operationWithNumbers(FirstNubmer, SecondNumber, operation, sum);
                System.out.println("Результат операции = " + ResultOfCalculation);
            }
        } else {
            int FirstRomanNumber = ConvertationOfNumbers.romanToArabic(masx[0]);
            int SecondRomanNumber = ConvertationOfNumbers.romanToArabic(masx[2]);
            int ResultOfRomanNumbers = 0;
            ResultOfRomanNumbers = res1.operationWithNumbers(FirstRomanNumber, SecondRomanNumber, masx[1],sum);
            if(ResultOfRomanNumbers<0){
                throw new IllegalArgumentException(ResultOfRomanNumbers + "the result of calculating Arabic numbers cannot be negative");
            }else{
            String ResultOfRomanCalculation = arabicToRoman.arabicToRoman(ResultOfRomanNumbers);
            System.out.println("Результат операции = "+ ResultOfRomanCalculation);}

        }
    }
}

class Calculate {
    public int operationWithNumbers(Integer FirstNubmer, Integer secondNubmer, String operation, int sum) {
        if (operation.equals("+")) {
            sum = FirstNubmer + secondNubmer;
            //System.out.println("Результат операции " + sum);
        }
        if (operation.equals("-")) {
            sum = FirstNubmer - secondNubmer;
            //System.out.println("Результат операции " + sum);
        }
        if (operation.equals("/")) {
            sum = FirstNubmer / secondNubmer;
            //System.out.println("Результат операции " + sum);
        }
        if (operation.equals("*")) {
            sum = FirstNubmer * secondNubmer;
            //System.out.println("Результат операции " + sum);
        }
        return sum;
    }
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
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

enum RomanNumeral {
            I(1), IV(4), V(5), IX(9), X(10),
            XL(40), L(50), XC(90), C(100),
            CD(400), D(500), CM(900), M(1000);

            private int value;

            RomanNumeral(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }

            public static List<RomanNumeral> getReverseSortedValues() {
                return Arrays.stream(values())
                        .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                        .collect(Collectors.toList());
            }
        }
        