package pobj.expr;
/**
 * Classe définissant la question 13.
 * @author Enorovan + [REDACTED]
 */
public class Question13 {
	public static <T> T compose(IVisitor<T> f, IVisitor<Expression> g, Expression e) {
		return e.accept(g).accept(f);
	}
}
