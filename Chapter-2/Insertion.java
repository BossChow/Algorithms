import java.util.Arrays;

/**
 * 插入排序
 */
public class Insertion extends Sort {
    public static void main(String[] args) {
	    Comparable[] arr = {4, 1, 6, 7, 3, 9, 8, 2, 5, 0};
		sort(arr);
	}
    public static void sort(Comparable[] arr) {
	    int N = arr.length;
	    for (int i=1; i<N; i++) {
		    for (int j=i; j>0 && less(arr[j], arr[j-1]); j--) {
			    exch(arr, j, j-1);
			}
		}
	}
}
