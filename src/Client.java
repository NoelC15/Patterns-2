
public class Client {
	public static void main(String[] args) {
		Expr test = new Plus(new Constant(1), new Minus(new Constant(3), new UMinus(new Constant(12))));
//		System.out.println(test.toString());
		ExprVisitor v = new Printer();
		String result = (String) test.accept(v);
		System.out.println(result);
	}
}
