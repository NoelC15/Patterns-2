
public interface ExprVisitor {
	public void visit(Plus plus);
	public void visit(Minus minus);
	public void visit(Times times);
	public void visit(Div div);
	public void visit(Mod mod);
	public void visit(UMinus uminus);
	public void visit(Constant constant);
}
