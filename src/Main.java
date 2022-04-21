public class Main {

    public static int a, b;
    public static int result;
    public static String output;

    public static String calc(String userInput) throws Exception {
        String[] array = userInput.split(" ");
        if (array.length != 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) строго через пробел");
        }
        String num1 = array[0];
        String operation = array[1];
        String num2 = array[2];
        a = Calculator.convertRomanArab(num1);
        b = Calculator.convertRomanArab(num2);
        if (a == -1 && b == -1) {
            a = Integer.parseInt(num1);
            b = Integer.parseInt(num2);
            if (a <= 0 || b <= 0 || a > 10 || b > 10) {
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно");
            }
            result = Operation.calculated(a, b, operation);
          return   output = Integer.toString(result);
        } else if (a != -1 && b != -1) {
            result = Operation.calculated(a, b, operation);
            if (result <= 0) {
                throw new Exception("В римской системе нет отрицательных чисел ");
            }
          return  output = Calculator.convertArabRoman(result);
        } else
            throw new Exception("Используются одновременно разные системы счисления");


    }
}
