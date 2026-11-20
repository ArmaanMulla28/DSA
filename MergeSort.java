import java.util.*;
class MergeSort{
    static void merge(int[] arr,int left,int mid,int right){
        //size define
        int n1 = mid - left +1;
        int n2 =right-mid;

        //create subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        //copying elements
        for(int i = 0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int j = 0;j<n1;j++){
            L[j] = arr[mid+1+j];
        }
        int i = 0,j=0,k = left;
        while(i<n1 && i<n2){
            if (L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(i<n2){
            arr[k] = R[j];
            j++;
            k++;
        }


    }
    static void mergesort(int[] arr,int left,int right){
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the integers::");
        for(int a = 0;a<arr.length;a++){
            arr[a] = sc.nextInt();
        }

        mergesort(arr, 0, arr.length - 1);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}