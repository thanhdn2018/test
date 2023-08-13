package ss3_array_and_methood;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
                System.out.print("Nhập vào phần tử thứ [" + i + "]: ");
                arr[i] = Integer.parseInt(scanner.nextLine());
                if (min > arr[i]){
                    min = arr[i];
                }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        }
    }

