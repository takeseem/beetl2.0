package org.beetl.core.statement;

import org.beetl.core.Context;

public class IfStatement extends Statement {

	Expression condtion;
	Statement ifStatement;
	Statement elseStatement;

	public IfStatement(Expression condtion, Statement ifStatement,
			Statement elseStatement, Token token) {
		super(token);
		this.condtion = condtion;
		this.ifStatement = ifStatement;
		this.elseStatement = elseStatement;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Context ctx) {
		// TODO Auto-generated method stub
		Object value = condtion.evaluate(ctx);
		if (ASTNodeUtil.isTrue(value, this)) {
			ifStatement.execute(ctx);
		} else {
			if (elseStatement != null) {
				elseStatement.execute(ctx);
			}
		}

	}

}
