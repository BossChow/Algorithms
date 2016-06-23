public class Sort {
    public static int less(int[] arr, int i, int j) {
	    if (arr[i] < arr[j]) return -1;
		if (arr[i] > arr[j]) return +1;
		return 0;
	}

	public static void exch(int[] arr, int i, int j) {
	    int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
