import java.util.List;

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