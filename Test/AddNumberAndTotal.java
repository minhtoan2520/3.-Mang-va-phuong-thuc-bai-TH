package Test;

//Demo tinh tong cac so nguyen nhap vao
import java.util.Scanner;

public class AddNumberAndTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ban muon tinh tong bao nhieu so? \nNhap vao: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("Vui long nhap lai so lon hon 0!");
            n = input.nextInt();
        }

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao so nguyen thu " + (i + 1) + ": ");
            int numbers = input.nextInt();
            arr[i] = numbers;
        }
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        System.out.println("Tong cac so la: " + sum);
        input.close();
    }
}
