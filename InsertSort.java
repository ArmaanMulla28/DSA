import java.util.*;
class InsertSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the integers::");
        for(int a = 0;a<arr.length;a++){
            arr[a] = sc.nextInt();
        }
        for(int i = 1;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}