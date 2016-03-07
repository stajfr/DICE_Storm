/*
 * generated by Xtext
 */
package org.xtext.dice.toscacloudifydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.dice.toscacloudifydsl.services.JsonDslGrammarAccess;
import tosca_yaml_standard.Attribute;
import tosca_yaml_standard.Connected_to;
import tosca_yaml_standard.Contained_in;
import tosca_yaml_standard.Import;
import tosca_yaml_standard.Input;
import tosca_yaml_standard.Interface;
import tosca_yaml_standard.Node_template;
import tosca_yaml_standard.Operation;
import tosca_yaml_standard.Output;
import tosca_yaml_standard.Parameters;
import tosca_yaml_standard.Property;
import tosca_yaml_standard.Relationship;
import tosca_yaml_standard.Requirement;
import tosca_yaml_standard.Service_Template;
import tosca_yaml_standard.Source_interface;
import tosca_yaml_standard.Target_interface;
import tosca_yaml_standard.Tosca_yaml_standardPackage;
import tosca_yaml_standard.instance;

@SuppressWarnings("all")
public abstract class AbstractJsonDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Tosca_yaml_standardPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Tosca_yaml_standardPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.CONNECTED_TO:
				sequence_Connected_to(context, (Connected_to) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.CONTAINED_IN:
				sequence_Contained_in(context, (Contained_in) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.INTERFACE:
				sequence_Interface_Impl(context, (Interface) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.NODE_TEMPLATE:
				sequence_Node_template(context, (Node_template) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.PARAMETER:
				sequence_Parameter_Impl(context, (tosca_yaml_standard.Parameter) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.PARAMETERS:
				sequence_Parameters(context, (Parameters) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.RELATIONSHIP:
				sequence_Relationship_Impl(context, (Relationship) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.SERVICE_TEMPLATE:
				sequence_Service_Template(context, (Service_Template) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.SOURCE_INTERFACE:
				sequence_Source_interface(context, (Source_interface) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.TARGET_INTERFACE:
				sequence_Target_interface(context, (Target_interface) semanticObject); 
				return; 
			case Tosca_yaml_standardPackage.INSTANCE:
				sequence_instance(context, (instance) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Parameter returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=STRING 
	 *         type=STRING? 
	 *         description=STRING? 
	 *         value=STRING? 
	 *         required=STRING? 
	 *         default=STRING? 
	 *         status=STRING?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Connected_to
	 *     Connected_to returns Connected_to
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Connected_to(ISerializationContext context, Connected_to semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Contained_in
	 *     Contained_in returns Contained_in
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Contained_in(ISerializationContext context, Contained_in semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     file=STRING?
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *     Parameter returns Input
	 *
	 * Constraint:
	 *     (parameter_name=STRING type=STRING? description=STRING? default=STRING?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *     Interface_Impl returns Interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Interface_Impl(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node_template returns Node_template
	 *
	 * Constraint:
	 *     (
	 *         node_template_name=STRING 
	 *         type=STRING? 
	 *         description=STRING? 
	 *         (nodeTemplate_hasInterface+=Interface nodeTemplate_hasInterface+=Interface*)? 
	 *         (nodeTemplate_hasProperty+=Property nodeTemplate_hasProperty+=Property*)? 
	 *         (nodeTemplate_hasAttribute+=Attribute nodeTemplate_hasAttribute+=Attribute*)? 
	 *         (nodeTemplate_hasRequirement+=Requirement nodeTemplate_hasRequirement+=Requirement*)? 
	 *         (NodeTemplate_hasRelationship+=Relationship NodeTemplate_hasRelationship+=Relationship*)? 
	 *         nodeTemplate_hasInstances=instance?
	 *     )
	 */
	protected void sequence_Node_template(ISerializationContext context, Node_template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation_name=STRING? script=STRING?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *     Parameter returns Output
	 *
	 * Constraint:
	 *     (parameter_name=STRING description=STRING? value=STRING?)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter_Impl returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (parameter_name=STRING value=STRING?)
	 */
	protected void sequence_Parameter_Impl(ISerializationContext context, tosca_yaml_standard.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameters returns Parameters
	 *
	 * Constraint:
	 *     (Paremeters_hasParameter+=Parameter Paremeters_hasParameter+=Parameter*)?
	 */
	protected void sequence_Parameters(ISerializationContext context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (property_name=STRING (property_hasParameters+=Parameters property_hasParameters+=Parameters*)?)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Relationship
	 *     Relationship_Impl returns Relationship
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Relationship_Impl(ISerializationContext context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (requirement_name=STRING? node=STRING? capability_Type_name=STRING? (occurances+=STRING occurances+=STRING*)?)
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service_Template returns Service_Template
	 *
	 * Constraint:
	 *     (
	 *         tosca_definitions_version=STRING? 
	 *         (serviceTemplate_hasImport+=Import serviceTemplate_hasImport+=Import*)? 
	 *         (interface_hasInput+=Input interface_hasInput+=Input*)? 
	 *         service_hasNodeTemplate+=Node_template 
	 *         service_hasNodeTemplate+=Node_template* 
	 *         (serviceTemplate_hasOutput+=Output serviceTemplate_hasOutput+=Output*)?
	 *     )
	 */
	protected void sequence_Service_Template(ISerializationContext context, Service_Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Source_interface
	 *     Source_interface returns Source_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Source_interface(ISerializationContext context, Source_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Target_interface
	 *     Target_interface returns Target_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Target_interface(ISerializationContext context, Target_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     instance returns instance
	 *
	 * Constraint:
	 *     deploy=EInt
	 */
	protected void sequence_instance(ISerializationContext context, instance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Tosca_yaml_standardPackage.Literals.INSTANCE__DEPLOY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Tosca_yaml_standardPackage.Literals.INSTANCE__DEPLOY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceAccess().getDeployEIntParserRuleCall_1_0(), semanticObject.getDeploy());
		feeder.finish();
	}
	
	
}
