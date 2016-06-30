public class SortCompare {

    public static double time(String alg, Double[] a) {
		StopWatch stopWatch = new StopWatch();
	    if ("Insertion".equals(alg)) Insertion.sort(a);
		else if ("Selection".equals(alg)) Selection.sort(a);
		return stopWatch.elapsedTime();
	}
    public static double timeRandomInput(String alg, int N, int T) {
	    double total = 0.0;
		Double[] a = new Double[N];
	    for (int i = 0; i < T; i++) {
		    for (int j = 0; j < N; j++) {
			    a[j] = StdRandom.uniform();
			}
			total += time(alg, a);
		}
	    return total;
	}
    public static void main(String[] args) {
	    String alg1 = args[0];
		String alg2 = args[1];
		int N = Integer.parseInt(args[2]);
		int T = Integer.parseInt(args[3]);
		double time1, time2;
		time1 = timeRandomInput(alg1, N, T);
		time2 = timeRandomInput(alg2, N, T);

		StdOut.printf("For %d random Doubles\n    %s is ", N, alg1);
		StdOut.printf("%.1f times faster than %s\n", time2/time1, alg2);
	}
}
