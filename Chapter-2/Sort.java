public class Sort {
    /**
	* 比较两个元素大小
	*/
    public static boolean less(Comparable t, Comparable v) {
	    return t.compareTo(v) < 0;
	}

	public static void exch(Comparable[] arr, int i, int j) {
	    Comparable tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
