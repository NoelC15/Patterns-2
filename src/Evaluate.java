
public class Evaluate implements ExprVisitor {

	@Override
	public void visit(Plus plus) {
		System.out.println(plus.getLeft() + " + " + plus.getRight());
		
	}

	@Override
	public void visit(Minus minus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Times times) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Div div) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Mod mod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(UMinus uminus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Constant constant) {
		// TODO Auto-generated method stub
		
	}

}
