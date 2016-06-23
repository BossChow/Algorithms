/**
* 选择排序
*/



import java.util.Arrays;

public class Selection extends Sort{
    public static void main(String[] args) {
        int[] arr = {4, 7, 6, 3, 1, 8, 5};
        sort(arr);
    }
   
    public static void sort(int[] arr) {
		int min;
        for (int i=0; i<arr.length; i++) {
		    min = arr[i];
			for (int j=i+1; j<arr.length; j++) {
			    if (less(arr, i, j) > 0) {
				    exch(arr, i, j);
				}
			}
			System.out.println(Arrays.toString(arr));
        }        
    }
}
