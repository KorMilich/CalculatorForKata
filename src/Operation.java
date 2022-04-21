

 class Operation {

    public static int calculated(int number1, int number2, String operation) {// высчитываем результат с учетом знака
        return switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> throw new IllegalArgumentException("Не верный знак операции");

        };
    }
}
