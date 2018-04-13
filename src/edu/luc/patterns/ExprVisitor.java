
public interface ExprVisitor<T> {
	public T visit(Plus plus);
	public T visit(Minus minus);
	public T visit(Times times);
	public T visit(Div div);
	public T visit(Mod mod);
	public T visit(UMinus uminus);
	public T visit(Constant constant);
}
