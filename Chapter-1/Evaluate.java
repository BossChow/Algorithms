import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.next();

            if ("(".equals(str)) ;
            else if ("+".equals(str)) ops.push(str);
            else if (")".equals(str)) {
                String op = ops.pop();
                double v = vals.pop();

                if (op.equals("+")) vals.push(vals.pop() + v);

            }

            else vals.push(Double.parseDouble(str));
        }
    }
}
