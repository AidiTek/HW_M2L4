import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            A.add(input);
        }
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            B.add(input);
        }
        System.out.println(B);
        ArrayList<String> C = new ArrayList<>();


        for (int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
            C.add(B.get(B.size() - i - 1));
        }
        System.out.println("Обьедененнный список " + C);
        Collections.sort(C, Comparator.comparing(String::length));
        System.out.println("Отсортированный список цикл " + C);


    }
}
