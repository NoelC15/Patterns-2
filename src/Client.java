
public class Client {
	public static void main(String[] args) {
		Expr test = new Plus(new Constant(1), new Constant(3));
		System.out.println(test.toString());
		ExprVisitor v = new Evaluate();
		test.accept(v);
		
	}
}
