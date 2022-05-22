package pobj.expr;
/**
 * Classe de représentation d'un visiteur de constante.
 * @author Enorovan + [REDACTED]
 */
public class VisitorConstant implements IVisitor<Boolean> {
	/** Le visiteur d'evaluation. */
	private VisitorEval visitorEval = new VisitorEval();

	@Override
	public Boolean visit(Constant c) {
		return true;
	}
	@Override
	public Boolean visit(Add e) {
		try {
			visitorEval.visit(e);
		}catch(UnsupportedOperationException ex) {
			return false;
		}
		return true;
	}
	@Override
	public Boolean visit(Mult e) {
		try {
			visitorEval.visit(e);
		}catch(UnsupportedOperationException ex) {
			return false;
		}
		return true;
	}
	@Override
	public Boolean visit(Var v) {
		return false;
	}
}
