import java.util.*;
class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the integers::");
        for(int a = 0;a<arr.length;a++){
            arr[a] = sc.nextInt();
        }


        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}