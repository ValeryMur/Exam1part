package exam;

import java.util.Scanner;

/**
 * Created by ASUS PC on 20.11.2016.
 */
public class StringNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (буквы, цыфры, символы):");
        String line = scanner.nextLine();
        System.out.println("Результат(только цифры): " + removeNumbers(line));
    }

    public static String removeNumbers(String s){
        char[] chars = s.toCharArray();
        String a = "";
        for (char ch:chars){
            if (Character.isDigit(ch)){
                a += ch;
            }
        }
        return a;
    }
}
