/*
 * generated by Xtext
 */
package org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.dice.toscacloudifydsl.services.JsonDslGrammarAccess;

public class JsonDslParser extends AbstractContentAssistParser {
	
	@Inject
	private JsonDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr.internal.InternalJsonDslParser createParser() {
		org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr.internal.InternalJsonDslParser result = new org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr.internal.InternalJsonDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInterfaceAccess().getAlternatives(), "rule__Interface__Alternatives");
					put(grammarAccess.getRelationshipAccess().getAlternatives(), "rule__Relationship__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getService_TemplateAccess().getGroup(), "rule__Service_Template__Group__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_1(), "rule__Service_Template__Group_1__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_2(), "rule__Service_Template__Group_2__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_3(), "rule__Service_Template__Group_3__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_3_3(), "rule__Service_Template__Group_3_3__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_4(), "rule__Service_Template__Group_4__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_4_3(), "rule__Service_Template__Group_4_3__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_8(), "rule__Service_Template__Group_8__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_10(), "rule__Service_Template__Group_10__0");
					put(grammarAccess.getService_TemplateAccess().getGroup_10_3(), "rule__Service_Template__Group_10_3__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getOutputAccess().getGroup_4(), "rule__Output__Group_4__0");
					put(grammarAccess.getOutputAccess().getGroup_5(), "rule__Output__Group_5__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_3(), "rule__Input__Group_3__0");
					put(grammarAccess.getInputAccess().getGroup_4(), "rule__Input__Group_4__0");
					put(grammarAccess.getInputAccess().getGroup_5(), "rule__Input__Group_5__0");
					put(grammarAccess.getNode_templateAccess().getGroup(), "rule__Node_template__Group__0");
					put(grammarAccess.getNode_templateAccess().getGroup_4(), "rule__Node_template__Group_4__0");
					put(grammarAccess.getNode_templateAccess().getGroup_5(), "rule__Node_template__Group_5__0");
					put(grammarAccess.getNode_templateAccess().getGroup_6(), "rule__Node_template__Group_6__0");
					put(grammarAccess.getNode_templateAccess().getGroup_6_3(), "rule__Node_template__Group_6_3__0");
					put(grammarAccess.getNode_templateAccess().getGroup_7(), "rule__Node_template__Group_7__0");
					put(grammarAccess.getNode_templateAccess().getGroup_7_3(), "rule__Node_template__Group_7_3__0");
					put(grammarAccess.getNode_templateAccess().getGroup_8(), "rule__Node_template__Group_8__0");
					put(grammarAccess.getNode_templateAccess().getGroup_8_3(), "rule__Node_template__Group_8_3__0");
					put(grammarAccess.getNode_templateAccess().getGroup_9(), "rule__Node_template__Group_9__0");
					put(grammarAccess.getNode_templateAccess().getGroup_9_3(), "rule__Node_template__Group_9_3__0");
					put(grammarAccess.getNode_templateAccess().getGroup_10(), "rule__Node_template__Group_10__0");
					put(grammarAccess.getNode_templateAccess().getGroup_10_3(), "rule__Node_template__Group_10_3__0");
					put(grammarAccess.getNode_templateAccess().getGroup_11(), "rule__Node_template__Group_11__0");
					put(grammarAccess.getInterface_ImplAccess().getGroup(), "rule__Interface_Impl__Group__0");
					put(grammarAccess.getInterface_ImplAccess().getGroup_4(), "rule__Interface_Impl__Group_4__0");
					put(grammarAccess.getInterface_ImplAccess().getGroup_4_1(), "rule__Interface_Impl__Group_4_1__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_4(), "rule__Property__Group_4__0");
					put(grammarAccess.getPropertyAccess().getGroup_4_1(), "rule__Property__Group_4_1__0");
					put(grammarAccess.getProperty_parameterAccess().getGroup(), "rule__Property_parameter__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_5(), "rule__Attribute__Group_5__0");
					put(grammarAccess.getAttributeAccess().getGroup_6(), "rule__Attribute__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup_7(), "rule__Attribute__Group_7__0");
					put(grammarAccess.getAttributeAccess().getGroup_8(), "rule__Attribute__Group_8__0");
					put(grammarAccess.getAttributeAccess().getGroup_9(), "rule__Attribute__Group_9__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_3(), "rule__Requirement__Group_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_4(), "rule__Requirement__Group_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_5(), "rule__Requirement__Group_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_6(), "rule__Requirement__Group_6__0");
					put(grammarAccess.getRequirementAccess().getGroup_6_3(), "rule__Requirement__Group_6_3__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup(), "rule__Relationship_Impl__Group__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_2(), "rule__Relationship_Impl__Group_2__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_3(), "rule__Relationship_Impl__Group_3__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_4(), "rule__Relationship_Impl__Group_4__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_5(), "rule__Relationship_Impl__Group_5__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_5_3(), "rule__Relationship_Impl__Group_5_3__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_6(), "rule__Relationship_Impl__Group_6__0");
					put(grammarAccess.getRelationship_ImplAccess().getGroup_6_3(), "rule__Relationship_Impl__Group_6_3__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getSource_interfaceAccess().getGroup(), "rule__Source_interface__Group__0");
					put(grammarAccess.getSource_interfaceAccess().getGroup_4(), "rule__Source_interface__Group_4__0");
					put(grammarAccess.getSource_interfaceAccess().getGroup_4_1(), "rule__Source_interface__Group_4_1__0");
					put(grammarAccess.getTarget_interfaceAccess().getGroup(), "rule__Target_interface__Group__0");
					put(grammarAccess.getTarget_interfaceAccess().getGroup_4(), "rule__Target_interface__Group_4__0");
					put(grammarAccess.getTarget_interfaceAccess().getGroup_4_3(), "rule__Target_interface__Group_4_3__0");
					put(grammarAccess.getContained_inAccess().getGroup(), "rule__Contained_in__Group__0");
					put(grammarAccess.getContained_inAccess().getGroup_3(), "rule__Contained_in__Group_3__0");
					put(grammarAccess.getContained_inAccess().getGroup_4(), "rule__Contained_in__Group_4__0");
					put(grammarAccess.getContained_inAccess().getGroup_5(), "rule__Contained_in__Group_5__0");
					put(grammarAccess.getContained_inAccess().getGroup_6(), "rule__Contained_in__Group_6__0");
					put(grammarAccess.getContained_inAccess().getGroup_6_3(), "rule__Contained_in__Group_6_3__0");
					put(grammarAccess.getContained_inAccess().getGroup_7(), "rule__Contained_in__Group_7__0");
					put(grammarAccess.getContained_inAccess().getGroup_7_3(), "rule__Contained_in__Group_7_3__0");
					put(grammarAccess.getConnected_toAccess().getGroup(), "rule__Connected_to__Group__0");
					put(grammarAccess.getConnected_toAccess().getGroup_3(), "rule__Connected_to__Group_3__0");
					put(grammarAccess.getConnected_toAccess().getGroup_4(), "rule__Connected_to__Group_4__0");
					put(grammarAccess.getConnected_toAccess().getGroup_5(), "rule__Connected_to__Group_5__0");
					put(grammarAccess.getConnected_toAccess().getGroup_6(), "rule__Connected_to__Group_6__0");
					put(grammarAccess.getConnected_toAccess().getGroup_6_3(), "rule__Connected_to__Group_6_3__0");
					put(grammarAccess.getConnected_toAccess().getGroup_7(), "rule__Connected_to__Group_7__0");
					put(grammarAccess.getConnected_toAccess().getGroup_7_3(), "rule__Connected_to__Group_7_3__0");
					put(grammarAccess.getService_TemplateAccess().getTosca_definition_versionAssignment_1_1(), "rule__Service_Template__Tosca_definition_versionAssignment_1_1");
					put(grammarAccess.getService_TemplateAccess().getDescriptionAssignment_2_1(), "rule__Service_Template__DescriptionAssignment_2_1");
					put(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportAssignment_3_2(), "rule__Service_Template__ServiceTemplate_hasImportAssignment_3_2");
					put(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportAssignment_3_3_1(), "rule__Service_Template__ServiceTemplate_hasImportAssignment_3_3_1");
					put(grammarAccess.getService_TemplateAccess().getInterface_hasInputAssignment_4_2(), "rule__Service_Template__Interface_hasInputAssignment_4_2");
					put(grammarAccess.getService_TemplateAccess().getInterface_hasInputAssignment_4_3_1(), "rule__Service_Template__Interface_hasInputAssignment_4_3_1");
					put(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateAssignment_7(), "rule__Service_Template__Service_hasNodeTemplateAssignment_7");
					put(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateAssignment_8_1(), "rule__Service_Template__Service_hasNodeTemplateAssignment_8_1");
					put(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputAssignment_10_2(), "rule__Service_Template__ServiceTemplate_hasOutputAssignment_10_2");
					put(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputAssignment_10_3_1(), "rule__Service_Template__ServiceTemplate_hasOutputAssignment_10_3_1");
					put(grammarAccess.getImportAccess().getFileAssignment_1(), "rule__Import__FileAssignment_1");
					put(grammarAccess.getOutputAccess().getParameter_nameAssignment_1(), "rule__Output__Parameter_nameAssignment_1");
					put(grammarAccess.getOutputAccess().getDescriptionAssignment_4_1(), "rule__Output__DescriptionAssignment_4_1");
					put(grammarAccess.getOutputAccess().getValueAssignment_5_1(), "rule__Output__ValueAssignment_5_1");
					put(grammarAccess.getInputAccess().getParameter_nameAssignment_1(), "rule__Input__Parameter_nameAssignment_1");
					put(grammarAccess.getInputAccess().getTypeAssignment_3_1(), "rule__Input__TypeAssignment_3_1");
					put(grammarAccess.getInputAccess().getDescriptionAssignment_4_1(), "rule__Input__DescriptionAssignment_4_1");
					put(grammarAccess.getInputAccess().getDefaultAssignment_5_1(), "rule__Input__DefaultAssignment_5_1");
					put(grammarAccess.getNode_templateAccess().getNode_template_nameAssignment_1(), "rule__Node_template__Node_template_nameAssignment_1");
					put(grammarAccess.getNode_templateAccess().getTypeAssignment_4_1(), "rule__Node_template__TypeAssignment_4_1");
					put(grammarAccess.getNode_templateAccess().getDescriptionAssignment_5_1(), "rule__Node_template__DescriptionAssignment_5_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceAssignment_6_2(), "rule__Node_template__NodeTemplate_hasInterfaceAssignment_6_2");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceAssignment_6_3_1(), "rule__Node_template__NodeTemplate_hasInterfaceAssignment_6_3_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyAssignment_7_2(), "rule__Node_template__NodeTemplate_hasPropertyAssignment_7_2");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyAssignment_7_3_1(), "rule__Node_template__NodeTemplate_hasPropertyAssignment_7_3_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAssignment_8_2(), "rule__Node_template__NodeTemplate_hasAttributeAssignment_8_2");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAssignment_8_3_1(), "rule__Node_template__NodeTemplate_hasAttributeAssignment_8_3_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementAssignment_9_2(), "rule__Node_template__NodeTemplate_hasRequirementAssignment_9_2");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementAssignment_9_3_1(), "rule__Node_template__NodeTemplate_hasRequirementAssignment_9_3_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipAssignment_10_2(), "rule__Node_template__NodeTemplate_hasRelationshipAssignment_10_2");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipAssignment_10_3_1(), "rule__Node_template__NodeTemplate_hasRelationshipAssignment_10_3_1");
					put(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInstancesAssignment_11_2(), "rule__Node_template__NodeTemplate_hasInstancesAssignment_11_2");
					put(grammarAccess.getInterface_ImplAccess().getInterface_nameAssignment_1(), "rule__Interface_Impl__Interface_nameAssignment_1");
					put(grammarAccess.getInterface_ImplAccess().getHasOperationAssignment_4_0(), "rule__Interface_Impl__HasOperationAssignment_4_0");
					put(grammarAccess.getInterface_ImplAccess().getHasOperationAssignment_4_1_1(), "rule__Interface_Impl__HasOperationAssignment_4_1_1");
					put(grammarAccess.getPropertyAccess().getProperty_nameAssignment_1(), "rule__Property__Property_nameAssignment_1");
					put(grammarAccess.getPropertyAccess().getProperty_hasParametersAssignment_4_0(), "rule__Property__Property_hasParametersAssignment_4_0");
					put(grammarAccess.getPropertyAccess().getProperty_hasParametersAssignment_4_1_1(), "rule__Property__Property_hasParametersAssignment_4_1_1");
					put(grammarAccess.getProperty_parameterAccess().getParameter_nameAssignment_1(), "rule__Property_parameter__Parameter_nameAssignment_1");
					put(grammarAccess.getProperty_parameterAccess().getValueAssignment_3(), "rule__Property_parameter__ValueAssignment_3");
					put(grammarAccess.getAttributeAccess().getParameter_nameAssignment_2(), "rule__Attribute__Parameter_nameAssignment_2");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_4_1(), "rule__Attribute__TypeAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getDescriptionAssignment_5_1(), "rule__Attribute__DescriptionAssignment_5_1");
					put(grammarAccess.getAttributeAccess().getValueAssignment_6_1(), "rule__Attribute__ValueAssignment_6_1");
					put(grammarAccess.getAttributeAccess().getRequiredAssignment_7_1(), "rule__Attribute__RequiredAssignment_7_1");
					put(grammarAccess.getAttributeAccess().getDefaultAssignment_8_1(), "rule__Attribute__DefaultAssignment_8_1");
					put(grammarAccess.getAttributeAccess().getStatusAssignment_9_1(), "rule__Attribute__StatusAssignment_9_1");
					put(grammarAccess.getRequirementAccess().getRequirement_nameAssignment_3_1(), "rule__Requirement__Requirement_nameAssignment_3_1");
					put(grammarAccess.getRequirementAccess().getNodeAssignment_4_1(), "rule__Requirement__NodeAssignment_4_1");
					put(grammarAccess.getRequirementAccess().getCapability_Type_nameAssignment_5_1(), "rule__Requirement__Capability_Type_nameAssignment_5_1");
					put(grammarAccess.getRequirementAccess().getOccurancesAssignment_6_2(), "rule__Requirement__OccurancesAssignment_6_2");
					put(grammarAccess.getRequirementAccess().getOccurancesAssignment_6_3_1(), "rule__Requirement__OccurancesAssignment_6_3_1");
					put(grammarAccess.getRelationship_ImplAccess().getTypeAssignment_2_1(), "rule__Relationship_Impl__TypeAssignment_2_1");
					put(grammarAccess.getRelationship_ImplAccess().getValidSourceAssignment_3_1(), "rule__Relationship_Impl__ValidSourceAssignment_3_1");
					put(grammarAccess.getRelationship_ImplAccess().getValidTargetAssignment_4_1(), "rule__Relationship_Impl__ValidTargetAssignment_4_1");
					put(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceAssignment_5_2(), "rule__Relationship_Impl__Relation_haSourceInterfaceAssignment_5_2");
					put(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceAssignment_5_3_1(), "rule__Relationship_Impl__Relation_haSourceInterfaceAssignment_5_3_1");
					put(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceAssignment_6_2(), "rule__Relationship_Impl__Relation_hasTargetInterfaceAssignment_6_2");
					put(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceAssignment_6_3_1(), "rule__Relationship_Impl__Relation_hasTargetInterfaceAssignment_6_3_1");
					put(grammarAccess.getInstanceAccess().getParameter_nameAssignment_1(), "rule__Instance__Parameter_nameAssignment_1");
					put(grammarAccess.getInstanceAccess().getValueAssignment_3(), "rule__Instance__ValueAssignment_3");
					put(grammarAccess.getOperationAccess().getOperation_nameAssignment_1(), "rule__Operation__Operation_nameAssignment_1");
					put(grammarAccess.getOperationAccess().getScriptAssignment_3(), "rule__Operation__ScriptAssignment_3");
					put(grammarAccess.getSource_interfaceAccess().getInterface_nameAssignment_1(), "rule__Source_interface__Interface_nameAssignment_1");
					put(grammarAccess.getSource_interfaceAccess().getHasOperationAssignment_4_0(), "rule__Source_interface__HasOperationAssignment_4_0");
					put(grammarAccess.getSource_interfaceAccess().getHasOperationAssignment_4_1_1(), "rule__Source_interface__HasOperationAssignment_4_1_1");
					put(grammarAccess.getTarget_interfaceAccess().getInterface_nameAssignment_1(), "rule__Target_interface__Interface_nameAssignment_1");
					put(grammarAccess.getTarget_interfaceAccess().getHasOperationAssignment_4_2(), "rule__Target_interface__HasOperationAssignment_4_2");
					put(grammarAccess.getTarget_interfaceAccess().getHasOperationAssignment_4_3_1(), "rule__Target_interface__HasOperationAssignment_4_3_1");
					put(grammarAccess.getContained_inAccess().getTypeAssignment_3_1(), "rule__Contained_in__TypeAssignment_3_1");
					put(grammarAccess.getContained_inAccess().getValidSourceAssignment_4_1(), "rule__Contained_in__ValidSourceAssignment_4_1");
					put(grammarAccess.getContained_inAccess().getValidTargetAssignment_5_1(), "rule__Contained_in__ValidTargetAssignment_5_1");
					put(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceAssignment_6_2(), "rule__Contained_in__Relation_haSourceInterfaceAssignment_6_2");
					put(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceAssignment_6_3_1(), "rule__Contained_in__Relation_haSourceInterfaceAssignment_6_3_1");
					put(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceAssignment_7_2(), "rule__Contained_in__Relation_hasTargetInterfaceAssignment_7_2");
					put(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceAssignment_7_3_1(), "rule__Contained_in__Relation_hasTargetInterfaceAssignment_7_3_1");
					put(grammarAccess.getConnected_toAccess().getTypeAssignment_3_1(), "rule__Connected_to__TypeAssignment_3_1");
					put(grammarAccess.getConnected_toAccess().getValidSourceAssignment_4_1(), "rule__Connected_to__ValidSourceAssignment_4_1");
					put(grammarAccess.getConnected_toAccess().getValidTargetAssignment_5_1(), "rule__Connected_to__ValidTargetAssignment_5_1");
					put(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceAssignment_6_2(), "rule__Connected_to__Relation_haSourceInterfaceAssignment_6_2");
					put(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceAssignment_6_3_1(), "rule__Connected_to__Relation_haSourceInterfaceAssignment_6_3_1");
					put(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceAssignment_7_2(), "rule__Connected_to__Relation_hasTargetInterfaceAssignment_7_2");
					put(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceAssignment_7_3_1(), "rule__Connected_to__Relation_hasTargetInterfaceAssignment_7_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr.internal.InternalJsonDslParser typedParser = (org.xtext.dice.toscacloudifydsl.ui.contentassist.antlr.internal.InternalJsonDslParser) parser;
			typedParser.entryRuleService_Template();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JsonDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JsonDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
