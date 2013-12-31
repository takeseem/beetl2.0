package org.beetl.core.statement;

import org.beetl.core.Context;

public class VarAssignNullStatment extends Statement {

	protected int varIndex;

	public VarAssignNullStatment(int varIndex, Token token) {
		super(token);
		this.varIndex = varIndex;
	}

	@Override
	public void execute(Context ctx) {
		// TODO Auto-generated method stub
		ctx.vars[varIndex] = null;

	}

}
