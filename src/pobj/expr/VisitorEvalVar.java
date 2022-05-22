package pobj.expr;

import java.util.Map;
/**
 * Classe de représentation d'un visiteur d'evaluation avec variables.
 * @author Enorovan + [REDACTED]
 */
public class VisitorEvalVar extends VisitorEval {
	/** La map permettant d'obtenir la variable. */
	private Map<String,Integer> map;
	
	/**
	 * Construit une variable à l'aide de la map donnée en argument.
	 * @param map, map donnée en argument.
	 */
	public VisitorEvalVar(Map<String,Integer> map) {
		this.map = map;
	}
	
	@Override
	public Integer visit(Var v) {
		return map.get(v.toString());
	}
}
