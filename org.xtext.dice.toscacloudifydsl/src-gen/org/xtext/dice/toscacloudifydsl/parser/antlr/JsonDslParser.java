/*
 * generated by Xtext
 */
package org.xtext.dice.toscacloudifydsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.dice.toscacloudifydsl.services.JsonDslGrammarAccess;

public class JsonDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JsonDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.dice.toscacloudifydsl.parser.antlr.internal.InternalJsonDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.dice.toscacloudifydsl.parser.antlr.internal.InternalJsonDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Service_Template";
	}
	
	public JsonDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JsonDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}