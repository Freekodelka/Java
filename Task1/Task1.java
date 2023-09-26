import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task01 {
    public static void main(String[] args) {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (flag) {
            System.out.print("Введите дробное число: ");
            try {
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", fNumber);
                flag = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите дробное число.");
            }
        }
    }
}

