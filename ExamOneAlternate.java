
import java.util.Scanner;

public class ExamOneAlternate {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        // Длина массива
        System.out.println("Enter length");
        int len = myscan.nextInt();

        // Создание массива

        int[] mass = new int[len];

        // Заполнение массива

        for(int i = 0 ; i <= len; i++){
            System.out.println("Enter number under the index "+ i);
            mass[i] = myscan.nextInt();
        }

        // Вывод чисел с четным индексом

        for(int i =0;i<len-1;i++){
            if(mass[i] % 2 == 0){
                System.out.println(mass[i]);
            }
        }
    }
}
