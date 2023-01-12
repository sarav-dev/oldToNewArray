import java.util.*;

public class oldToNew {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter array length: ");
        int S = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[S];
        
        for (int i=0; i<S; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter any number to add: ");
        int b = sc.nextInt();
        System.out.println();
        System.out.println("New array elements are: ");
        output(arr, b);
        System.out.println();
        sc.close();
    }
    
    public static void output(int[] arr, int b) {
        int arr2[] = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            arr2[i] = arr[i]+b;
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}