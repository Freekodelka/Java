import java.util.Scanner;

class EmptyStringExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели: " + input);
        }
    }
}