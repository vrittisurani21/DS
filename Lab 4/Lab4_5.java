import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter number of elements in the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        if (n == 0) {
            System.out.println("No element inside the array.");
            return;
        }
        System.out.print("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray Before Removing Duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    break;
                }
            }
            if (j == count) {
                temp[count] = arr[i];
                count++;
            }
        }

        System.out.print("\nArray After Removing Duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}