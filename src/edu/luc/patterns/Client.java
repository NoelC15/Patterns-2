
public class Client {
	public static void main(String[] args) {
		Expr test = new Plus(new Constant(1), new Minus(new Constant(3), new UMinus(new Constant(12))));

		ExprVisitor prettyPrinter = new Printer();
		String PrintingResult = (String) test.accept(prettyPrinter);
		System.out.println(PrintingResult);
		
		ExprVisitor accurateEvaluator = new Evaluator();
		int evaluationResult = (int) test.accept(accurateEvaluator);
		System.out.println(evaluationResult);
	}
}
