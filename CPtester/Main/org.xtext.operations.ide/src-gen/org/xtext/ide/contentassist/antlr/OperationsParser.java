/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalOperationsParser;
import org.xtext.services.OperationsGrammarAccess;

public class OperationsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OperationsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OperationsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getSolutionAccess().getAlternatives(), "rule__Solution__Alternatives");
			builder.put(grammarAccess.getInitialAccess().getGroup(), "rule__Initial__Group__0");
			builder.put(grammarAccess.getLightRGBAccess().getGroup(), "rule__LightRGB__Group__0");
			builder.put(grammarAccess.getBuzzerOffAccess().getGroup(), "rule__BuzzerOff__Group__0");
			builder.put(grammarAccess.getBuzzerOnAccess().getGroup(), "rule__BuzzerOn__Group__0");
			builder.put(grammarAccess.getDeleteColorAccess().getGroup(), "rule__DeleteColor__Group__0");
			builder.put(grammarAccess.getColorConfigurationAccess().getGroup(), "rule__ColorConfiguration__Group__0");
			builder.put(grammarAccess.getCameraColorAccess().getGroup(), "rule__CameraColor__Group__0");
			builder.put(grammarAccess.getReadAllServosAccess().getGroup(), "rule__ReadAllServos__Group__0");
			builder.put(grammarAccess.getReadServoAccess().getGroup(), "rule__ReadServo__Group__0");
			builder.put(grammarAccess.getRotateServoAccess().getGroup(), "rule__RotateServo__Group__0");
			builder.put(grammarAccess.getRotateAllServosAccess().getGroup(), "rule__RotateAllServos__Group__0");
			builder.put(grammarAccess.getResultAccess().getGroup(), "rule__Result__Group__0");
			builder.put(grammarAccess.getConditionsAccess().getGroup(), "rule__Conditions__Group__0");
			builder.put(grammarAccess.getIsAtSingleAccess().getGroup(), "rule__IsAtSingle__Group__0");
			builder.put(grammarAccess.getIsAtAccess().getGroup(), "rule__IsAt__Group__0");
			builder.put(grammarAccess.getInitialAccess().getNameAssignment_0(), "rule__Initial__NameAssignment_0");
			builder.put(grammarAccess.getInitialAccess().getTimeAssignment_2(), "rule__Initial__TimeAssignment_2");
			builder.put(grammarAccess.getLightRGBAccess().getNameAssignment_0(), "rule__LightRGB__NameAssignment_0");
			builder.put(grammarAccess.getLightRGBAccess().getRAssignment_2(), "rule__LightRGB__RAssignment_2");
			builder.put(grammarAccess.getLightRGBAccess().getGAssignment_4(), "rule__LightRGB__GAssignment_4");
			builder.put(grammarAccess.getLightRGBAccess().getBAssignment_6(), "rule__LightRGB__BAssignment_6");
			builder.put(grammarAccess.getBuzzerOffAccess().getNameAssignment_0(), "rule__BuzzerOff__NameAssignment_0");
			builder.put(grammarAccess.getBuzzerOnAccess().getNameAssignment_0(), "rule__BuzzerOn__NameAssignment_0");
			builder.put(grammarAccess.getBuzzerOnAccess().getTimeAssignment_2(), "rule__BuzzerOn__TimeAssignment_2");
			builder.put(grammarAccess.getDeleteColorAccess().getNameAssignment_0(), "rule__DeleteColor__NameAssignment_0");
			builder.put(grammarAccess.getDeleteColorAccess().getColorAssignment_2(), "rule__DeleteColor__ColorAssignment_2");
			builder.put(grammarAccess.getColorConfigurationAccess().getNameAssignment_0(), "rule__ColorConfiguration__NameAssignment_0");
			builder.put(grammarAccess.getColorConfigurationAccess().getColorAssignment_2(), "rule__ColorConfiguration__ColorAssignment_2");
			builder.put(grammarAccess.getColorConfigurationAccess().getH_minAssignment_4(), "rule__ColorConfiguration__H_minAssignment_4");
			builder.put(grammarAccess.getColorConfigurationAccess().getS_minAssignment_6(), "rule__ColorConfiguration__S_minAssignment_6");
			builder.put(grammarAccess.getColorConfigurationAccess().getV_minAssignment_8(), "rule__ColorConfiguration__V_minAssignment_8");
			builder.put(grammarAccess.getColorConfigurationAccess().getH_maxAssignment_10(), "rule__ColorConfiguration__H_maxAssignment_10");
			builder.put(grammarAccess.getColorConfigurationAccess().getS_maxAssignment_12(), "rule__ColorConfiguration__S_maxAssignment_12");
			builder.put(grammarAccess.getColorConfigurationAccess().getV_maxAssignment_14(), "rule__ColorConfiguration__V_maxAssignment_14");
			builder.put(grammarAccess.getCameraColorAccess().getNameAssignment_0(), "rule__CameraColor__NameAssignment_0");
			builder.put(grammarAccess.getCameraColorAccess().getTimeAssignment_2(), "rule__CameraColor__TimeAssignment_2");
			builder.put(grammarAccess.getReadAllServosAccess().getNameAssignment_0(), "rule__ReadAllServos__NameAssignment_0");
			builder.put(grammarAccess.getReadServoAccess().getNameAssignment_0(), "rule__ReadServo__NameAssignment_0");
			builder.put(grammarAccess.getReadServoAccess().getServoAssignment_2(), "rule__ReadServo__ServoAssignment_2");
			builder.put(grammarAccess.getRotateServoAccess().getNameAssignment_0(), "rule__RotateServo__NameAssignment_0");
			builder.put(grammarAccess.getRotateServoAccess().getServoAssignment_2(), "rule__RotateServo__ServoAssignment_2");
			builder.put(grammarAccess.getRotateServoAccess().getAngleAssignment_4(), "rule__RotateServo__AngleAssignment_4");
			builder.put(grammarAccess.getRotateServoAccess().getTimeAssignment_6(), "rule__RotateServo__TimeAssignment_6");
			builder.put(grammarAccess.getRotateAllServosAccess().getNameAssignment_0(), "rule__RotateAllServos__NameAssignment_0");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle1Assignment_2(), "rule__RotateAllServos__Angle1Assignment_2");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle2Assignment_4(), "rule__RotateAllServos__Angle2Assignment_4");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle3Assignment_6(), "rule__RotateAllServos__Angle3Assignment_6");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle4Assignment_8(), "rule__RotateAllServos__Angle4Assignment_8");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle5Assignment_10(), "rule__RotateAllServos__Angle5Assignment_10");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngle6Assignment_12(), "rule__RotateAllServos__Angle6Assignment_12");
			builder.put(grammarAccess.getRotateAllServosAccess().getTimeAssignment_14(), "rule__RotateAllServos__TimeAssignment_14");
			builder.put(grammarAccess.getResultAccess().getNameAssignment_0(), "rule__Result__NameAssignment_0");
			builder.put(grammarAccess.getResultAccess().getTimeAssignment_2(), "rule__Result__TimeAssignment_2");
			builder.put(grammarAccess.getConditionsAccess().getNameAssignment_0(), "rule__Conditions__NameAssignment_0");
			builder.put(grammarAccess.getConditionsAccess().getTimeAssignment_2(), "rule__Conditions__TimeAssignment_2");
			builder.put(grammarAccess.getIsAtSingleAccess().getNameAssignment_0(), "rule__IsAtSingle__NameAssignment_0");
			builder.put(grammarAccess.getIsAtSingleAccess().getServoAssignment_2(), "rule__IsAtSingle__ServoAssignment_2");
			builder.put(grammarAccess.getIsAtSingleAccess().getAngleAssignment_4(), "rule__IsAtSingle__AngleAssignment_4");
			builder.put(grammarAccess.getIsAtSingleAccess().getAngle_resAssignment_6(), "rule__IsAtSingle__Angle_resAssignment_6");
			builder.put(grammarAccess.getIsAtAccess().getNameAssignment_0(), "rule__IsAt__NameAssignment_0");
			builder.put(grammarAccess.getIsAtAccess().getAngle1Assignment_2(), "rule__IsAt__Angle1Assignment_2");
			builder.put(grammarAccess.getIsAtAccess().getAngle2Assignment_4(), "rule__IsAt__Angle2Assignment_4");
			builder.put(grammarAccess.getIsAtAccess().getAngle3Assignment_6(), "rule__IsAt__Angle3Assignment_6");
			builder.put(grammarAccess.getIsAtAccess().getAngle4Assignment_8(), "rule__IsAt__Angle4Assignment_8");
			builder.put(grammarAccess.getIsAtAccess().getAngle5Assignment_10(), "rule__IsAt__Angle5Assignment_10");
			builder.put(grammarAccess.getIsAtAccess().getAngle6Assignment_12(), "rule__IsAt__Angle6Assignment_12");
			builder.put(grammarAccess.getIsAtAccess().getAngle_resAssignment_14(), "rule__IsAt__Angle_resAssignment_14");
			builder.put(grammarAccess.getAngle_resAccess().getAngle_resAssignment(), "rule__Angle_res__Angle_resAssignment");
			builder.put(grammarAccess.getAngleAccess().getAngleAssignment(), "rule__Angle__AngleAssignment");
			builder.put(grammarAccess.getTimeAccess().getTimeAssignment(), "rule__Time__TimeAssignment");
			builder.put(grammarAccess.getServoAccess().getServoAssignment(), "rule__Servo__ServoAssignment");
			builder.put(grammarAccess.getV_maxAccess().getV_maxAssignment(), "rule__V_max__V_maxAssignment");
			builder.put(grammarAccess.getS_maxAccess().getS_maxAssignment(), "rule__S_max__S_maxAssignment");
			builder.put(grammarAccess.getH_maxAccess().getH_maxAssignment(), "rule__H_max__H_maxAssignment");
			builder.put(grammarAccess.getV_minAccess().getV_minAssignment(), "rule__V_min__V_minAssignment");
			builder.put(grammarAccess.getS_minAccess().getS_minAssignment(), "rule__S_min__S_minAssignment");
			builder.put(grammarAccess.getH_minAccess().getH_minAssignment(), "rule__H_min__H_minAssignment");
			builder.put(grammarAccess.getColorAccess().getColorAssignment(), "rule__Color__ColorAssignment");
			builder.put(grammarAccess.getBAccess().getBAssignment(), "rule__B__BAssignment");
			builder.put(grammarAccess.getGAccess().getGAssignment(), "rule__G__GAssignment");
			builder.put(grammarAccess.getRAccess().getRAssignment(), "rule__R__RAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OperationsGrammarAccess grammarAccess;

	@Override
	protected InternalOperationsParser createParser() {
		InternalOperationsParser result = new InternalOperationsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OperationsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OperationsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
