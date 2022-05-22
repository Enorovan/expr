package pobj.expr;
/**
 * Classe définissant la question 10.
 * @author Enorovan + [REDACTED]
 */
public class Question10 {
	// rend vrai si e est un arbre d’expression constant
	public static boolean isConstant(Expression e) { 
		return e.accept(new VisitorConstant());
	}
	
	public static int evalConstantExpression(Expression e) { 
		return e.eval();
	}

}
