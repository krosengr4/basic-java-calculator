public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t-----WELCOME TO THE JAVA CALCULATOR-----");

        boolean ifContinue = true;

        while (ifContinue) {
            double firstNumber = Utils.messageAndResponseInt("Please enter your first number: ");
            double secondNumber = Utils.messageAndResponseInt("Please enter your second number: ");
            double result = 0;

            System.out.println("\n---OPTIONS---\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
            int operation = Utils.messageAndResponseInt("Select an operation: ");

            switch (operation) {
                case 1 -> result = addition(firstNumber, secondNumber);
                case 2 -> result = subtraction(firstNumber, secondNumber);
                case 3 -> result = multiplication(firstNumber, secondNumber);
                case 4 -> {
                    if (secondNumber != 0) {
                        result = division(firstNumber, secondNumber);
                    } else {
                        System.err.println("ERROR! Cannot divide by 0!");
                    }
                }
                default -> System.err.println("ERROR! Please enter a valid option!");
            }
            System.out.println("RESULT: " + result);

            String userContinue = Utils.promptGetUserInput("\n\nWould you like to calculate another number? (Y or N)").trim();
            if (userContinue.equalsIgnoreCase("n")) {
                ifContinue = false;
            }
        }

        System.out.println("\n\n Thanks! Have a good one!");
    }

    public static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

}
