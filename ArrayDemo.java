import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Demo of equals method
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};
        boolean isEqual1 = Arrays.equals(arr1, arr2); // true
        boolean isEqual2 = Arrays.equals(arr1, arr3); // false
        System.out.println("arr1 and arr2 are equal: " + isEqual1);
        System.out.println("arr1 and arr3 are equal: " + isEqual2);
        
        // Demo of fill method
        int[] arr4 = new int[5];
        Arrays.fill(arr4, 42);
        System.out.println("arr4 after fill: " + Arrays.toString(arr4));
        
        // Demo of sort method
        int[] arr5 = {5, 2, 9, 1, 7};
        Arrays.sort(arr5);
        System.out.println("arr5 after sort: " + Arrays.toString(arr5));
    }
}
