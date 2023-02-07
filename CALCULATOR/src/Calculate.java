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
}