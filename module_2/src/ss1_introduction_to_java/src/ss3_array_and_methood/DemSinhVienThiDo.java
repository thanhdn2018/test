package ss3_array_and_methood;

import java.util.Arrays;
import java.util.Scanner;

public class DemSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int count = 0;
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("chỉ được nhập tối đa 30");
        } while (size > 30);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào điểm của sinh viên thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Danh sách vừa nhập là: "+ Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println("Số sinh viên thi đỗ là: "+count);
    }
}
