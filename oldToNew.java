import java.util.*;

public class oldToNew {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int S = sc.nextInt();
        int arr[] = new int[S];
        int b = sc.nextInt();

        for (int i=0; i<S; i++) {
            arr[i] = sc.nextInt();
        }
        output(arr,b);
        sc.close();
    }

    public static void output(int[] arr, int b) {
		int arr2[] = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
			arr2[i] = arr[i]+b;
            System.out.print(arr2[i]+" ");
        }
    }
}