package pobj.expr;
/**
 * Classe de représentation d'un visiteur de simplificateur d'Expression.
 * @author Enorovan + [REDACTED]
 */
public class VisitorSimplify implements IVisitor<Expression> {

	@Override
	public Expression visit(Constant c) {
		return c;
	}
	@Override
	public Expression visit(Add e) {
		//Si les deux opérandes sont des variable, on renvoit l'addition telle quelle.
		if(e.left instanceof Var && e.right instanceof Var) return e;
		
		
		//Si un des deux opérandes est nul, on renvoie l'autre (élément neutre).
		if(e.left instanceof Constant && e.left.eval() == 0) return e.right;
		if(e.right instanceof Constant && e.right.eval() == 0) return e.left;
		
		//Si au moins un opérande est une variable, on renvoit l'addition telle quelle.
		if(e.left instanceof Var) return e;
		if(e.right instanceof Var) return e;
		
		//Si au moins un opérande n'est pas une constante, on traite l'expression.
		if(Question10.isConstant(e.left) && !Question10.isConstant(e.right)) return new Add(new Constant(e.left.eval()),e.right);	
		if(Question10.isConstant(e.right) && !Question10.isConstant(e.left)) return new Add(e.left,new Constant(e.right.eval()));	
		if(!Question10.isConstant(e.right) && !Question10.isConstant(e.left)) return new Add(e.left,e.right);	
		
		//>Un opérateur est une constante.
		return new Constant(e.eval());
	}
	@Override
	public Expression visit(Mult e) {
		//Si les deux opérandes sont des variable, on renvoit la multiplication telle quelle.
		if(e.left instanceof Var && e.right instanceof Var) return e;
		
		//Si un des deux opérandes est égal à 1, on renvoie l'autre (élément neutre).
		if(e.left instanceof Constant && e.left.eval() == 1) return e.right;
		if(e.right instanceof Constant && e.right.eval() == 1) return e.left;
		
		//Si un des deux opérandes est nul, on renvoie 0 (élément absorbant).
		if(e.left instanceof Constant && e.left.eval() == 0) return new Constant(0);
		if(e.right instanceof Constant && e.right.eval() == 0) return new Constant(0);

		//Si au moins un opérande est une variable, on renvoit la multiplication telle quelle.
		if(e.left instanceof Var) return e;
		if(e.right instanceof Var) return e;
		
		//Si au moins un opérande n'est pas une constante, on traite l'expression.
		if(Question10.isConstant(e.left) && !Question10.isConstant(e.right)) return new Mult(new Constant(e.left.eval()),e.right);		
		if(Question10.isConstant(e.right) && !Question10.isConstant(e.left)) return new Mult(e.left,new Constant(e.right.eval()));	
		if(!Question10.isConstant(e.right) && !Question10.isConstant(e.left)) return new Mult(e.left,e.right);	
		
		//>Un opérateur est une constante.
		return new Constant(e.eval());
	}
	@Override
	public Expression visit(Var v) {
		return v;
	}

}
