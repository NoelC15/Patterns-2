
public interface Expr {
	<T> T accept(ExprVisitor<T> v);
}
