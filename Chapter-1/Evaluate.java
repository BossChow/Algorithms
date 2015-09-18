import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (StdIn.isEmpty()) {
            String str = StdIn.readString();
            if (str.equals("(")) ;
            else if (str.equals("+")) ops.push(str);
            System.out.println("y: " + ops.pop());
        }
    }
}
