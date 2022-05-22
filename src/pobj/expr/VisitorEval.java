package pobj.expr;
/**
 * Classe de représentation d'un visiteur d'evaluation.
 * @author Enorovan + [REDACTED]
 */
public class VisitorEval implements IVisitor<Integer> {

	@Override
	public Integer visit(Constant c) {
		return c.getValue();
	}
	@Override
	public Integer visit(Add e) {
		Integer op1 = e.getLeft().accept(this);
		Integer op2 = e.getRight().accept(this);
		
		return op1 + op2;
	}
	@Override
	public Integer visit(Mult e) {
		Integer op1 = e.getLeft().accept(this);
		Integer op2 = e.getRight().accept(this);
		
		return op1 * op2;
	}
	@Override
	public Integer visit(Var v) {
		throw new UnsupportedOperationException();
	}
}
