import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double [] numbers = {3.4, 1.2, -4.7, 2.5, -6.7, 9.2, 5.3, -1.9, 4.5, 9.3, -3.8, 4.1, 8.2, 7.9, -2.7};
        boolean isMinusNumbers = false;
        int num1 = 0;
        double summa = 0;
        for(double num:numbers){
            if (num<0){
                isMinusNumbers = true;
                continue;
            }
            if (isMinusNumbers = true){
                summa += num;
                num1++;

            }

        }
        System.out.println("Средне арифметическое число массива: " + (summa / num1));
        System.out.println(isPalindrome());
    }
    public static String isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stroke = scanner.nextLine();

        stroke = stroke.toLowerCase();
        stroke = stroke.replaceAll("[,./';:#&*--_+= ]", "");

        for (int i = 0; i < (stroke.length() / 2); i++) {
            // Сравниваем символы попарно
            if (stroke.charAt(i) != stroke.charAt(stroke.length() - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return "it's not palindrome";
            }
        }
        return "it's palindrome";
    }
}











