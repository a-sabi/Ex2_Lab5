import java.util.Scanner;
import java.util.ArrayList;

public class Ex2_Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность чисел: ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; ; i++) {
            String t = sc.next();
            if (t.equals("quit")) {
                break;
            } else {
                try {
                    a.add(Integer.parseInt(t));
                } catch (Exception e) {
                    System.out.println("Введено не число!");
                }
            }
        }
        System.out.println("Введите x: ");
        int x = sc.nextInt();
        try {
            for (int i = 0; i<a.size(); i++) {
                if (a.get(i) == x) {
                    a.remove(i);
                    i--;
                }
                else {
                    System.out.print(a.get(i) + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Введено не число!");
        }
        sc.close();
    }
}
