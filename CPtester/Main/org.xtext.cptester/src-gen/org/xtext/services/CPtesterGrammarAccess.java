/*
 * generated by Xtext 2.26.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CPtesterGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSurnameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSurnameSTRINGTerminalRuleCall_1_0 = (RuleCall)cSurnameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGivenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGivenGivenParserRuleCall_3_0 = (RuleCall)cGivenAssignment_3.eContents().get(0);
		private final Assignment cAndGivenAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAndGivenAndWhenParserRuleCall_4_0 = (RuleCall)cAndGivenAssignment_4.eContents().get(0);
		private final Assignment cWhenAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cWhenWhenParserRuleCall_5_0 = (RuleCall)cWhenAssignment_5.eContents().get(0);
		private final Assignment cThenAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cThenThenParserRuleCall_6_0 = (RuleCall)cThenAssignment_6.eContents().get(0);
		private final Assignment cAndAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAndAndParserRuleCall_7_0 = (RuleCall)cAndAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Scenario:
		//    'Scenario' surname=STRING
		//    '{'
		//        given=Given
		//        (andGiven+=AndWhen)*
		//        when=When
		//        then=Then
		//        (and+=And)+ //Cambiar a estrella
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Scenario' surname=STRING
		//'{'
		//    given=Given
		//    (andGiven+=AndWhen)*
		//    when=When
		//    then=Then
		//    (and+=And)+ //Cambiar a estrella
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Scenario'
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }
		
		//surname=STRING
		public Assignment getSurnameAssignment_1() { return cSurnameAssignment_1; }
		
		//STRING
		public RuleCall getSurnameSTRINGTerminalRuleCall_1_0() { return cSurnameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//given=Given
		public Assignment getGivenAssignment_3() { return cGivenAssignment_3; }
		
		//Given
		public RuleCall getGivenGivenParserRuleCall_3_0() { return cGivenGivenParserRuleCall_3_0; }
		
		//(andGiven+=AndWhen)*
		public Assignment getAndGivenAssignment_4() { return cAndGivenAssignment_4; }
		
		//AndWhen
		public RuleCall getAndGivenAndWhenParserRuleCall_4_0() { return cAndGivenAndWhenParserRuleCall_4_0; }
		
		//when=When
		public Assignment getWhenAssignment_5() { return cWhenAssignment_5; }
		
		//When
		public RuleCall getWhenWhenParserRuleCall_5_0() { return cWhenWhenParserRuleCall_5_0; }
		
		//then=Then
		public Assignment getThenAssignment_6() { return cThenAssignment_6; }
		
		//Then
		public RuleCall getThenThenParserRuleCall_6_0() { return cThenThenParserRuleCall_6_0; }
		
		//(and+=And)+
		public Assignment getAndAssignment_7() { return cAndAssignment_7; }
		
		//And
		public RuleCall getAndAndParserRuleCall_7_0() { return cAndAndParserRuleCall_7_0; }
		
		////Cambiar a estrella
		//   '}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class GivenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.Given");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameGIVENKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cInitialAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInitialInitialParserRuleCall_1_0 = (RuleCall)cInitialAssignment_1.eContents().get(0);
		
		////////////////////////////////////////////////////
		//Given:
		//    name='GIVEN'
		//    (initial+=Initial)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='GIVEN'
		//(initial+=Initial)
		public Group getGroup() { return cGroup; }
		
		//name='GIVEN'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'GIVEN'
		public Keyword getNameGIVENKeyword_0_0() { return cNameGIVENKeyword_0_0; }
		
		//(initial+=Initial)
		public Assignment getInitialAssignment_1() { return cInitialAssignment_1; }
		
		//Initial
		public RuleCall getInitialInitialParserRuleCall_1_0() { return cInitialInitialParserRuleCall_1_0; }
	}
	public class AndWhenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.AndWhen");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameANDKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cCommandAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCommandCommandParserRuleCall_1_0 = (RuleCall)cCommandAssignment_1.eContents().get(0);
		
		////////////////////////////////////////////////////
		//AndWhen:
		//    name='AND'
		//    (command+=Command)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='AND'
		//(command+=Command)
		public Group getGroup() { return cGroup; }
		
		//name='AND'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'AND'
		public Keyword getNameANDKeyword_0_0() { return cNameANDKeyword_0_0; }
		
		//(command+=Command)
		public Assignment getCommandAssignment_1() { return cCommandAssignment_1; }
		
		//Command
		public RuleCall getCommandCommandParserRuleCall_1_0() { return cCommandCommandParserRuleCall_1_0; }
	}
	public class WhenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.When");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameWHENKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cCommandAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCommandCommandParserRuleCall_1_0 = (RuleCall)cCommandAssignment_1.eContents().get(0);
		
		////////////////////////////////////////////////////
		//When:
		//    name='WHEN'
		//    (command+=Command)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='WHEN'
		//(command+=Command)
		public Group getGroup() { return cGroup; }
		
		//name='WHEN'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'WHEN'
		public Keyword getNameWHENKeyword_0_0() { return cNameWHENKeyword_0_0; }
		
		//(command+=Command)
		public Assignment getCommandAssignment_1() { return cCommandAssignment_1; }
		
		//Command
		public RuleCall getCommandCommandParserRuleCall_1_0() { return cCommandCommandParserRuleCall_1_0; }
	}
	public class ThenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.Then");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameTHENKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cResultAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cResultResultParserRuleCall_1_0 = (RuleCall)cResultAssignment_1.eContents().get(0);
		
		////////////////////////////////////////////////////
		//Then:
		//    name='THEN'
		//    (result+=Result)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='THEN'
		//(result+=Result)
		public Group getGroup() { return cGroup; }
		
		//name='THEN'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'THEN'
		public Keyword getNameTHENKeyword_0_0() { return cNameTHENKeyword_0_0; }
		
		//(result+=Result)
		public Assignment getResultAssignment_1() { return cResultAssignment_1; }
		
		//Result
		public RuleCall getResultResultParserRuleCall_1_0() { return cResultResultParserRuleCall_1_0; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPtester.And");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameANDKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cConditionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionsConditionsParserRuleCall_1_0 = (RuleCall)cConditionsAssignment_1.eContents().get(0);
		private final Keyword cQueryKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSolutionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSolutionSolutionParserRuleCall_3_0 = (RuleCall)cSolutionAssignment_3.eContents().get(0);
		
		////////////////////////////////////////////////////
		//And:
		//    name='AND'
		//    (conditions+=Conditions)
		//    'Query' (solution+=Solution)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='AND'
		//(conditions+=Conditions)
		//'Query' (solution+=Solution)
		public Group getGroup() { return cGroup; }
		
		//name='AND'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'AND'
		public Keyword getNameANDKeyword_0_0() { return cNameANDKeyword_0_0; }
		
		//(conditions+=Conditions)
		public Assignment getConditionsAssignment_1() { return cConditionsAssignment_1; }
		
		//Conditions
		public RuleCall getConditionsConditionsParserRuleCall_1_0() { return cConditionsConditionsParserRuleCall_1_0; }
		
		//'Query'
		public Keyword getQueryKeyword_2() { return cQueryKeyword_2; }
		
		//(solution+=Solution)
		public Assignment getSolutionAssignment_3() { return cSolutionAssignment_3; }
		
		//Solution
		public RuleCall getSolutionSolutionParserRuleCall_3_0() { return cSolutionSolutionParserRuleCall_3_0; }
	}
	
	
	private final ScenarioElements pScenario;
	private final GivenElements pGiven;
	private final AndWhenElements pAndWhen;
	private final WhenElements pWhen;
	private final ThenElements pThen;
	private final AndElements pAnd;
	
	private final Grammar grammar;
	
	private final OperationsGrammarAccess gaOperations;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CPtesterGrammarAccess(GrammarProvider grammarProvider,
			OperationsGrammarAccess gaOperations,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaOperations = gaOperations;
		this.gaTerminals = gaTerminals;
		this.pScenario = new ScenarioElements();
		this.pGiven = new GivenElements();
		this.pAndWhen = new AndWhenElements();
		this.pWhen = new WhenElements();
		this.pThen = new ThenElements();
		this.pAnd = new AndElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.CPtester".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public OperationsGrammarAccess getOperationsGrammarAccess() {
		return gaOperations;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Scenario:
	//    'Scenario' surname=STRING
	//    '{'
	//        given=Given
	//        (andGiven+=AndWhen)*
	//        when=When
	//        then=Then
	//        (and+=And)+ //Cambiar a estrella
	//    '}'
	//;
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	////////////////////////////////////////////////////
	//Given:
	//    name='GIVEN'
	//    (initial+=Initial)
	//;
	public GivenElements getGivenAccess() {
		return pGiven;
	}
	
	public ParserRule getGivenRule() {
		return getGivenAccess().getRule();
	}
	
	////////////////////////////////////////////////////
	//AndWhen:
	//    name='AND'
	//    (command+=Command)
	//;
	public AndWhenElements getAndWhenAccess() {
		return pAndWhen;
	}
	
	public ParserRule getAndWhenRule() {
		return getAndWhenAccess().getRule();
	}
	
	////////////////////////////////////////////////////
	//When:
	//    name='WHEN'
	//    (command+=Command)
	//;
	public WhenElements getWhenAccess() {
		return pWhen;
	}
	
	public ParserRule getWhenRule() {
		return getWhenAccess().getRule();
	}
	
	////////////////////////////////////////////////////
	//Then:
	//    name='THEN'
	//    (result+=Result)
	//;
	public ThenElements getThenAccess() {
		return pThen;
	}
	
	public ParserRule getThenRule() {
		return getThenAccess().getRule();
	}
	
	////////////////////////////////////////////////////
	//And:
	//    name='AND'
	//    (conditions+=Conditions)
	//    'Query' (solution+=Solution)
	//;
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//Initial:
	//    name='posInicial'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.InitialElements getInitialAccess() {
		return gaOperations.getInitialAccess();
	}
	
	public ParserRule getInitialRule() {
		return getInitialAccess().getRule();
	}
	
	//Command:
	//    rotateServo | rotateAllServos | readServo | readAllServos | cameraColor | calibration | buzzerOn | buzzerOff | lightRGB
	//;
	public OperationsGrammarAccess.CommandElements getCommandAccess() {
		return gaOperations.getCommandAccess();
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//lightRGB:
	//    name='lightRGB'
	//    '('
	//    (r+=R)
	//    ','
	//    (g+=G)
	//    ','
	//    (b+=B)
	//    ')'
	//;
	public OperationsGrammarAccess.LightRGBElements getLightRGBAccess() {
		return gaOperations.getLightRGBAccess();
	}
	
	public ParserRule getLightRGBRule() {
		return getLightRGBAccess().getRule();
	}
	
	//buzzerOff:
	//    name='buzzerOff'
	//    '('
	//    ')'
	//;
	public OperationsGrammarAccess.BuzzerOffElements getBuzzerOffAccess() {
		return gaOperations.getBuzzerOffAccess();
	}
	
	public ParserRule getBuzzerOffRule() {
		return getBuzzerOffAccess().getRule();
	}
	
	//buzzerOn:
	//    name='buzzerOn'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.BuzzerOnElements getBuzzerOnAccess() {
		return gaOperations.getBuzzerOnAccess();
	}
	
	public ParserRule getBuzzerOnRule() {
		return getBuzzerOnAccess().getRule();
	}
	
	//calibration:
	//    name='calibration'
	//    '('
	//    (color+=Color)
	//    ','
	//    (h_min+=H_min)
	//    ','
	//    (s_min+=S_min)
	//    ','
	//    (v_min+=V_min)
	//    ','
	//    (h_max+=H_max)
	//    ','
	//    (s_max+=S_max)
	//    ','
	//    (v_max+=V_max)
	//    ')'
	//;
	public OperationsGrammarAccess.CalibrationElements getCalibrationAccess() {
		return gaOperations.getCalibrationAccess();
	}
	
	public ParserRule getCalibrationRule() {
		return getCalibrationAccess().getRule();
	}
	
	//cameraColor:
	//    name='cameraColor'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.CameraColorElements getCameraColorAccess() {
		return gaOperations.getCameraColorAccess();
	}
	
	public ParserRule getCameraColorRule() {
		return getCameraColorAccess().getRule();
	}
	
	//readAllServos:
	//    name='readAllServos'
	//    '('
	//    ')'
	//;
	public OperationsGrammarAccess.ReadAllServosElements getReadAllServosAccess() {
		return gaOperations.getReadAllServosAccess();
	}
	
	public ParserRule getReadAllServosRule() {
		return getReadAllServosAccess().getRule();
	}
	
	//readServo:
	//    name='readServo'
	//    '('
	//    (servo+=Servo)
	//    ')'
	//;
	public OperationsGrammarAccess.ReadServoElements getReadServoAccess() {
		return gaOperations.getReadServoAccess();
	}
	
	public ParserRule getReadServoRule() {
		return getReadServoAccess().getRule();
	}
	
	//rotateServo:
	//    name='rotateServo'
	//    '('
	//    (servo+=Servo)
	//    ','
	//    (angle+=Angle)
	//    ','
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.RotateServoElements getRotateServoAccess() {
		return gaOperations.getRotateServoAccess();
	}
	
	public ParserRule getRotateServoRule() {
		return getRotateServoAccess().getRule();
	}
	
	//rotateAllServos:
	//    name='rotateAllServos'
	//    '('
	//    (angle1+=Angle)
	//    ','
	//    (angle2+=Angle)
	//    ','
	//    (angle3+=Angle)
	//    ','
	//    (angle4+=Angle)
	//    ','
	//    (angle5+=Angle)
	//    ','
	//    (angle6+=Angle)
	//    ','
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.RotateAllServosElements getRotateAllServosAccess() {
		return gaOperations.getRotateAllServosAccess();
	}
	
	public ParserRule getRotateAllServosRule() {
		return getRotateAllServosAccess().getRule();
	}
	
	//Result:
	//    name='result'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.ResultElements getResultAccess() {
		return gaOperations.getResultAccess();
	}
	
	public ParserRule getResultRule() {
		return getResultAccess().getRule();
	}
	
	//Conditions:
	//    name='NotLaterThan'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public OperationsGrammarAccess.ConditionsElements getConditionsAccess() {
		return gaOperations.getConditionsAccess();
	}
	
	public ParserRule getConditionsRule() {
		return getConditionsAccess().getRule();
	}
	
	//Solution:
	//    isAtSingle | isAt
	//;
	public OperationsGrammarAccess.SolutionElements getSolutionAccess() {
		return gaOperations.getSolutionAccess();
	}
	
	public ParserRule getSolutionRule() {
		return getSolutionAccess().getRule();
	}
	
	//isAtSingle:
	//    name='isAtSingle'
	//    '('
	//    (servo+=Servo)
	//    ','
	//    (angle+=Angle)
	//    ','
	//    (angle_res+=Angle_res)
	//    ')'
	//;
	public OperationsGrammarAccess.IsAtSingleElements getIsAtSingleAccess() {
		return gaOperations.getIsAtSingleAccess();
	}
	
	public ParserRule getIsAtSingleRule() {
		return getIsAtSingleAccess().getRule();
	}
	
	//isAt:
	//    name='isAt'
	//    '('
	//    (angle1+=Angle)
	//    ','
	//    (angle2+=Angle)
	//    ','
	//    (angle3+=Angle)
	//    ','
	//    (angle4+=Angle)
	//    ','
	//    (angle5+=Angle)
	//    ','
	//    (angle6+=Angle)
	//    ','
	//    (angle_res+=Angle_res)
	//    ')'
	//;
	public OperationsGrammarAccess.IsAtElements getIsAtAccess() {
		return gaOperations.getIsAtAccess();
	}
	
	public ParserRule getIsAtRule() {
		return getIsAtAccess().getRule();
	}
	
	//Angle_res:
	//    angle_res=INT
	//;
	public OperationsGrammarAccess.Angle_resElements getAngle_resAccess() {
		return gaOperations.getAngle_resAccess();
	}
	
	public ParserRule getAngle_resRule() {
		return getAngle_resAccess().getRule();
	}
	
	//Angle:
	//    angle=INT
	//;
	public OperationsGrammarAccess.AngleElements getAngleAccess() {
		return gaOperations.getAngleAccess();
	}
	
	public ParserRule getAngleRule() {
		return getAngleAccess().getRule();
	}
	
	//Time:
	//    time=INT
	//;
	public OperationsGrammarAccess.TimeElements getTimeAccess() {
		return gaOperations.getTimeAccess();
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Servo:
	//    servo=INT
	//;
	public OperationsGrammarAccess.ServoElements getServoAccess() {
		return gaOperations.getServoAccess();
	}
	
	public ParserRule getServoRule() {
		return getServoAccess().getRule();
	}
	
	//V_max:
	//    v_max=INT
	//;
	public OperationsGrammarAccess.V_maxElements getV_maxAccess() {
		return gaOperations.getV_maxAccess();
	}
	
	public ParserRule getV_maxRule() {
		return getV_maxAccess().getRule();
	}
	
	//S_max:
	//    s_max=INT
	//;
	public OperationsGrammarAccess.S_maxElements getS_maxAccess() {
		return gaOperations.getS_maxAccess();
	}
	
	public ParserRule getS_maxRule() {
		return getS_maxAccess().getRule();
	}
	
	//H_max:
	//    h_max=INT
	//;
	public OperationsGrammarAccess.H_maxElements getH_maxAccess() {
		return gaOperations.getH_maxAccess();
	}
	
	public ParserRule getH_maxRule() {
		return getH_maxAccess().getRule();
	}
	
	//V_min:
	//    v_min=INT
	//;
	public OperationsGrammarAccess.V_minElements getV_minAccess() {
		return gaOperations.getV_minAccess();
	}
	
	public ParserRule getV_minRule() {
		return getV_minAccess().getRule();
	}
	
	//S_min:
	//    s_min=INT
	//;
	public OperationsGrammarAccess.S_minElements getS_minAccess() {
		return gaOperations.getS_minAccess();
	}
	
	public ParserRule getS_minRule() {
		return getS_minAccess().getRule();
	}
	
	//H_min:
	//    h_min=INT
	//;
	public OperationsGrammarAccess.H_minElements getH_minAccess() {
		return gaOperations.getH_minAccess();
	}
	
	public ParserRule getH_minRule() {
		return getH_minAccess().getRule();
	}
	
	//Color:
	//    color=STRING
	//;
	public OperationsGrammarAccess.ColorElements getColorAccess() {
		return gaOperations.getColorAccess();
	}
	
	public ParserRule getColorRule() {
		return getColorAccess().getRule();
	}
	
	//B:
	//    b=INT
	//;
	public OperationsGrammarAccess.BElements getBAccess() {
		return gaOperations.getBAccess();
	}
	
	public ParserRule getBRule() {
		return getBAccess().getRule();
	}
	
	//G:
	//    g=INT
	//;
	public OperationsGrammarAccess.GElements getGAccess() {
		return gaOperations.getGAccess();
	}
	
	public ParserRule getGRule() {
		return getGAccess().getRule();
	}
	
	//R:
	//    r=INT
	//;
	public OperationsGrammarAccess.RElements getRAccess() {
		return gaOperations.getRAccess();
	}
	
	public ParserRule getRRule() {
		return getRAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
