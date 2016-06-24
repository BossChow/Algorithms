public class Sort {
    /**
	* 比较两个元素大小
	*/
    public static boolean less(Comparable t, Comparable v) {
	    return t.compareTo(v) < 0;
	}

	public static void exch(Comparable[] arr, int i, int j) {
	    System.err.println("交换");
	    Comparable tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
