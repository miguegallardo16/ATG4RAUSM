package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.OperationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperationsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'posInicial'", "'('", "')'", "'lightRGB'", "','", "'buzzerOff'", "'buzzerOn'", "'deleteColor'", "'colorConfiguration'", "'cameraColor'", "'readAllServos'", "'readServo'", "'rotateServo'", "'rotateAllServos'", "'isAtSingle'", "'isAt'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOperationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOperationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOperationsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOperations.g"; }



     	private OperationsGrammarAccess grammarAccess;

        public InternalOperationsParser(TokenStream input, OperationsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Initial";
       	}

       	@Override
       	protected OperationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInitial"
    // InternalOperations.g:64:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalOperations.g:64:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalOperations.g:65:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalOperations.g:71:1: ruleInitial returns [EObject current=null] : ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:77:2: ( ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:78:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:78:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:79:3: ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:79:3: ( (lv_name_0_0= 'posInicial' ) )
            // InternalOperations.g:80:4: (lv_name_0_0= 'posInicial' )
            {
            // InternalOperations.g:80:4: (lv_name_0_0= 'posInicial' )
            // InternalOperations.g:81:5: lv_name_0_0= 'posInicial'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialAccess().getNamePosInicialKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "posInicial");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:97:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:98:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:98:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:99:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRulelightRGB"
    // InternalOperations.g:124:1: entryRulelightRGB returns [EObject current=null] : iv_rulelightRGB= rulelightRGB EOF ;
    public final EObject entryRulelightRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelightRGB = null;


        try {
            // InternalOperations.g:124:49: (iv_rulelightRGB= rulelightRGB EOF )
            // InternalOperations.g:125:2: iv_rulelightRGB= rulelightRGB EOF
            {
             newCompositeNode(grammarAccess.getLightRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelightRGB=rulelightRGB();

            state._fsp--;

             current =iv_rulelightRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelightRGB"


    // $ANTLR start "rulelightRGB"
    // InternalOperations.g:131:1: rulelightRGB returns [EObject current=null] : ( ( (lv_name_0_0= 'lightRGB' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' ) ;
    public final EObject rulelightRGB() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_r_2_0 = null;

        EObject lv_g_4_0 = null;

        EObject lv_b_6_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:137:2: ( ( ( (lv_name_0_0= 'lightRGB' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' ) )
            // InternalOperations.g:138:2: ( ( (lv_name_0_0= 'lightRGB' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:138:2: ( ( (lv_name_0_0= 'lightRGB' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' )
            // InternalOperations.g:139:3: ( (lv_name_0_0= 'lightRGB' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')'
            {
            // InternalOperations.g:139:3: ( (lv_name_0_0= 'lightRGB' ) )
            // InternalOperations.g:140:4: (lv_name_0_0= 'lightRGB' )
            {
            // InternalOperations.g:140:4: (lv_name_0_0= 'lightRGB' )
            // InternalOperations.g:141:5: lv_name_0_0= 'lightRGB'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLightRGBAccess().getNameLightRGBKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRGBRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "lightRGB");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLightRGBAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:157:3: ( (lv_r_2_0= ruleR ) )
            // InternalOperations.g:158:4: (lv_r_2_0= ruleR )
            {
            // InternalOperations.g:158:4: (lv_r_2_0= ruleR )
            // InternalOperations.g:159:5: lv_r_2_0= ruleR
            {

            					newCompositeNode(grammarAccess.getLightRGBAccess().getRRParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_r_2_0=ruleR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBRule());
            					}
            					add(
            						current,
            						"r",
            						lv_r_2_0,
            						"org.xtext.Operations.R");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLightRGBAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:180:3: ( (lv_g_4_0= ruleG ) )
            // InternalOperations.g:181:4: (lv_g_4_0= ruleG )
            {
            // InternalOperations.g:181:4: (lv_g_4_0= ruleG )
            // InternalOperations.g:182:5: lv_g_4_0= ruleG
            {

            					newCompositeNode(grammarAccess.getLightRGBAccess().getGGParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_g_4_0=ruleG();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBRule());
            					}
            					add(
            						current,
            						"g",
            						lv_g_4_0,
            						"org.xtext.Operations.G");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLightRGBAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:203:3: ( (lv_b_6_0= ruleB ) )
            // InternalOperations.g:204:4: (lv_b_6_0= ruleB )
            {
            // InternalOperations.g:204:4: (lv_b_6_0= ruleB )
            // InternalOperations.g:205:5: lv_b_6_0= ruleB
            {

            					newCompositeNode(grammarAccess.getLightRGBAccess().getBBParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_b_6_0=ruleB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBRule());
            					}
            					add(
            						current,
            						"b",
            						lv_b_6_0,
            						"org.xtext.Operations.B");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLightRGBAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelightRGB"


    // $ANTLR start "entryRulebuzzerOff"
    // InternalOperations.g:230:1: entryRulebuzzerOff returns [EObject current=null] : iv_rulebuzzerOff= rulebuzzerOff EOF ;
    public final EObject entryRulebuzzerOff() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebuzzerOff = null;


        try {
            // InternalOperations.g:230:50: (iv_rulebuzzerOff= rulebuzzerOff EOF )
            // InternalOperations.g:231:2: iv_rulebuzzerOff= rulebuzzerOff EOF
            {
             newCompositeNode(grammarAccess.getBuzzerOffRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebuzzerOff=rulebuzzerOff();

            state._fsp--;

             current =iv_rulebuzzerOff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebuzzerOff"


    // $ANTLR start "rulebuzzerOff"
    // InternalOperations.g:237:1: rulebuzzerOff returns [EObject current=null] : ( ( (lv_name_0_0= 'buzzerOff' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject rulebuzzerOff() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOperations.g:243:2: ( ( ( (lv_name_0_0= 'buzzerOff' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOperations.g:244:2: ( ( (lv_name_0_0= 'buzzerOff' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOperations.g:244:2: ( ( (lv_name_0_0= 'buzzerOff' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOperations.g:245:3: ( (lv_name_0_0= 'buzzerOff' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOperations.g:245:3: ( (lv_name_0_0= 'buzzerOff' ) )
            // InternalOperations.g:246:4: (lv_name_0_0= 'buzzerOff' )
            {
            // InternalOperations.g:246:4: (lv_name_0_0= 'buzzerOff' )
            // InternalOperations.g:247:5: lv_name_0_0= 'buzzerOff'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBuzzerOffAccess().getNameBuzzerOffKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuzzerOffRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "buzzerOff");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBuzzerOffAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBuzzerOffAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebuzzerOff"


    // $ANTLR start "entryRulebuzzerOn"
    // InternalOperations.g:271:1: entryRulebuzzerOn returns [EObject current=null] : iv_rulebuzzerOn= rulebuzzerOn EOF ;
    public final EObject entryRulebuzzerOn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebuzzerOn = null;


        try {
            // InternalOperations.g:271:49: (iv_rulebuzzerOn= rulebuzzerOn EOF )
            // InternalOperations.g:272:2: iv_rulebuzzerOn= rulebuzzerOn EOF
            {
             newCompositeNode(grammarAccess.getBuzzerOnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebuzzerOn=rulebuzzerOn();

            state._fsp--;

             current =iv_rulebuzzerOn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebuzzerOn"


    // $ANTLR start "rulebuzzerOn"
    // InternalOperations.g:278:1: rulebuzzerOn returns [EObject current=null] : ( ( (lv_name_0_0= 'buzzerOn' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject rulebuzzerOn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:284:2: ( ( ( (lv_name_0_0= 'buzzerOn' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:285:2: ( ( (lv_name_0_0= 'buzzerOn' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:285:2: ( ( (lv_name_0_0= 'buzzerOn' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:286:3: ( (lv_name_0_0= 'buzzerOn' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:286:3: ( (lv_name_0_0= 'buzzerOn' ) )
            // InternalOperations.g:287:4: (lv_name_0_0= 'buzzerOn' )
            {
            // InternalOperations.g:287:4: (lv_name_0_0= 'buzzerOn' )
            // InternalOperations.g:288:5: lv_name_0_0= 'buzzerOn'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBuzzerOnAccess().getNameBuzzerOnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuzzerOnRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "buzzerOn");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBuzzerOnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:304:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:305:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:305:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:306:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getBuzzerOnAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuzzerOnRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBuzzerOnAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebuzzerOn"


    // $ANTLR start "entryRuledeleteColor"
    // InternalOperations.g:331:1: entryRuledeleteColor returns [EObject current=null] : iv_ruledeleteColor= ruledeleteColor EOF ;
    public final EObject entryRuledeleteColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeleteColor = null;


        try {
            // InternalOperations.g:331:52: (iv_ruledeleteColor= ruledeleteColor EOF )
            // InternalOperations.g:332:2: iv_ruledeleteColor= ruledeleteColor EOF
            {
             newCompositeNode(grammarAccess.getDeleteColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledeleteColor=ruledeleteColor();

            state._fsp--;

             current =iv_ruledeleteColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeleteColor"


    // $ANTLR start "ruledeleteColor"
    // InternalOperations.g:338:1: ruledeleteColor returns [EObject current=null] : ( ( (lv_name_0_0= 'deleteColor' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ')' ) ;
    public final EObject ruledeleteColor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_color_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:344:2: ( ( ( (lv_name_0_0= 'deleteColor' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ')' ) )
            // InternalOperations.g:345:2: ( ( (lv_name_0_0= 'deleteColor' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:345:2: ( ( (lv_name_0_0= 'deleteColor' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ')' )
            // InternalOperations.g:346:3: ( (lv_name_0_0= 'deleteColor' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ')'
            {
            // InternalOperations.g:346:3: ( (lv_name_0_0= 'deleteColor' ) )
            // InternalOperations.g:347:4: (lv_name_0_0= 'deleteColor' )
            {
            // InternalOperations.g:347:4: (lv_name_0_0= 'deleteColor' )
            // InternalOperations.g:348:5: lv_name_0_0= 'deleteColor'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeleteColorAccess().getNameDeleteColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteColorRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "deleteColor");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteColorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:364:3: ( (lv_color_2_0= ruleColor ) )
            // InternalOperations.g:365:4: (lv_color_2_0= ruleColor )
            {
            // InternalOperations.g:365:4: (lv_color_2_0= ruleColor )
            // InternalOperations.g:366:5: lv_color_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getDeleteColorAccess().getColorColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_color_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteColorRule());
            					}
            					add(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.Operations.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteColorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeleteColor"


    // $ANTLR start "entryRulecolorConfiguration"
    // InternalOperations.g:391:1: entryRulecolorConfiguration returns [EObject current=null] : iv_rulecolorConfiguration= rulecolorConfiguration EOF ;
    public final EObject entryRulecolorConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolorConfiguration = null;


        try {
            // InternalOperations.g:391:59: (iv_rulecolorConfiguration= rulecolorConfiguration EOF )
            // InternalOperations.g:392:2: iv_rulecolorConfiguration= rulecolorConfiguration EOF
            {
             newCompositeNode(grammarAccess.getColorConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolorConfiguration=rulecolorConfiguration();

            state._fsp--;

             current =iv_rulecolorConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecolorConfiguration"


    // $ANTLR start "rulecolorConfiguration"
    // InternalOperations.g:398:1: rulecolorConfiguration returns [EObject current=null] : ( ( (lv_name_0_0= 'colorConfiguration' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' ) ;
    public final EObject rulecolorConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_color_2_0 = null;

        EObject lv_h_min_4_0 = null;

        EObject lv_s_min_6_0 = null;

        EObject lv_v_min_8_0 = null;

        EObject lv_h_max_10_0 = null;

        EObject lv_s_max_12_0 = null;

        EObject lv_v_max_14_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:404:2: ( ( ( (lv_name_0_0= 'colorConfiguration' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' ) )
            // InternalOperations.g:405:2: ( ( (lv_name_0_0= 'colorConfiguration' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:405:2: ( ( (lv_name_0_0= 'colorConfiguration' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' )
            // InternalOperations.g:406:3: ( (lv_name_0_0= 'colorConfiguration' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')'
            {
            // InternalOperations.g:406:3: ( (lv_name_0_0= 'colorConfiguration' ) )
            // InternalOperations.g:407:4: (lv_name_0_0= 'colorConfiguration' )
            {
            // InternalOperations.g:407:4: (lv_name_0_0= 'colorConfiguration' )
            // InternalOperations.g:408:5: lv_name_0_0= 'colorConfiguration'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColorConfigurationAccess().getNameColorConfigurationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorConfigurationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "colorConfiguration");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getColorConfigurationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:424:3: ( (lv_color_2_0= ruleColor ) )
            // InternalOperations.g:425:4: (lv_color_2_0= ruleColor )
            {
            // InternalOperations.g:425:4: (lv_color_2_0= ruleColor )
            // InternalOperations.g:426:5: lv_color_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getColorColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_color_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.Operations.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getColorConfigurationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:447:3: ( (lv_h_min_4_0= ruleH_min ) )
            // InternalOperations.g:448:4: (lv_h_min_4_0= ruleH_min )
            {
            // InternalOperations.g:448:4: (lv_h_min_4_0= ruleH_min )
            // InternalOperations.g:449:5: lv_h_min_4_0= ruleH_min
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getH_minH_minParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_h_min_4_0=ruleH_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"h_min",
            						lv_h_min_4_0,
            						"org.xtext.Operations.H_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getColorConfigurationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:470:3: ( (lv_s_min_6_0= ruleS_min ) )
            // InternalOperations.g:471:4: (lv_s_min_6_0= ruleS_min )
            {
            // InternalOperations.g:471:4: (lv_s_min_6_0= ruleS_min )
            // InternalOperations.g:472:5: lv_s_min_6_0= ruleS_min
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getS_minS_minParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_s_min_6_0=ruleS_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"s_min",
            						lv_s_min_6_0,
            						"org.xtext.Operations.S_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getColorConfigurationAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:493:3: ( (lv_v_min_8_0= ruleV_min ) )
            // InternalOperations.g:494:4: (lv_v_min_8_0= ruleV_min )
            {
            // InternalOperations.g:494:4: (lv_v_min_8_0= ruleV_min )
            // InternalOperations.g:495:5: lv_v_min_8_0= ruleV_min
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getV_minV_minParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_v_min_8_0=ruleV_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"v_min",
            						lv_v_min_8_0,
            						"org.xtext.Operations.V_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getColorConfigurationAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:516:3: ( (lv_h_max_10_0= ruleH_max ) )
            // InternalOperations.g:517:4: (lv_h_max_10_0= ruleH_max )
            {
            // InternalOperations.g:517:4: (lv_h_max_10_0= ruleH_max )
            // InternalOperations.g:518:5: lv_h_max_10_0= ruleH_max
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getH_maxH_maxParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_h_max_10_0=ruleH_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"h_max",
            						lv_h_max_10_0,
            						"org.xtext.Operations.H_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getColorConfigurationAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:539:3: ( (lv_s_max_12_0= ruleS_max ) )
            // InternalOperations.g:540:4: (lv_s_max_12_0= ruleS_max )
            {
            // InternalOperations.g:540:4: (lv_s_max_12_0= ruleS_max )
            // InternalOperations.g:541:5: lv_s_max_12_0= ruleS_max
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getS_maxS_maxParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_s_max_12_0=ruleS_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"s_max",
            						lv_s_max_12_0,
            						"org.xtext.Operations.S_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getColorConfigurationAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:562:3: ( (lv_v_max_14_0= ruleV_max ) )
            // InternalOperations.g:563:4: (lv_v_max_14_0= ruleV_max )
            {
            // InternalOperations.g:563:4: (lv_v_max_14_0= ruleV_max )
            // InternalOperations.g:564:5: lv_v_max_14_0= ruleV_max
            {

            					newCompositeNode(grammarAccess.getColorConfigurationAccess().getV_maxV_maxParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_v_max_14_0=ruleV_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorConfigurationRule());
            					}
            					add(
            						current,
            						"v_max",
            						lv_v_max_14_0,
            						"org.xtext.Operations.V_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getColorConfigurationAccess().getRightParenthesisKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecolorConfiguration"


    // $ANTLR start "entryRulecameraColor"
    // InternalOperations.g:589:1: entryRulecameraColor returns [EObject current=null] : iv_rulecameraColor= rulecameraColor EOF ;
    public final EObject entryRulecameraColor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecameraColor = null;


        try {
            // InternalOperations.g:589:52: (iv_rulecameraColor= rulecameraColor EOF )
            // InternalOperations.g:590:2: iv_rulecameraColor= rulecameraColor EOF
            {
             newCompositeNode(grammarAccess.getCameraColorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecameraColor=rulecameraColor();

            state._fsp--;

             current =iv_rulecameraColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecameraColor"


    // $ANTLR start "rulecameraColor"
    // InternalOperations.g:596:1: rulecameraColor returns [EObject current=null] : ( ( (lv_name_0_0= 'cameraColor' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject rulecameraColor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:602:2: ( ( ( (lv_name_0_0= 'cameraColor' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:603:2: ( ( (lv_name_0_0= 'cameraColor' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:603:2: ( ( (lv_name_0_0= 'cameraColor' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:604:3: ( (lv_name_0_0= 'cameraColor' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:604:3: ( (lv_name_0_0= 'cameraColor' ) )
            // InternalOperations.g:605:4: (lv_name_0_0= 'cameraColor' )
            {
            // InternalOperations.g:605:4: (lv_name_0_0= 'cameraColor' )
            // InternalOperations.g:606:5: lv_name_0_0= 'cameraColor'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraColorAccess().getNameCameraColorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraColorRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cameraColor");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraColorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:622:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:623:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:623:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:624:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getCameraColorAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraColorRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraColorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecameraColor"


    // $ANTLR start "entryRulereadAllServos"
    // InternalOperations.g:649:1: entryRulereadAllServos returns [EObject current=null] : iv_rulereadAllServos= rulereadAllServos EOF ;
    public final EObject entryRulereadAllServos() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadAllServos = null;


        try {
            // InternalOperations.g:649:54: (iv_rulereadAllServos= rulereadAllServos EOF )
            // InternalOperations.g:650:2: iv_rulereadAllServos= rulereadAllServos EOF
            {
             newCompositeNode(grammarAccess.getReadAllServosRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereadAllServos=rulereadAllServos();

            state._fsp--;

             current =iv_rulereadAllServos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereadAllServos"


    // $ANTLR start "rulereadAllServos"
    // InternalOperations.g:656:1: rulereadAllServos returns [EObject current=null] : ( ( (lv_name_0_0= 'readAllServos' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject rulereadAllServos() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOperations.g:662:2: ( ( ( (lv_name_0_0= 'readAllServos' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOperations.g:663:2: ( ( (lv_name_0_0= 'readAllServos' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOperations.g:663:2: ( ( (lv_name_0_0= 'readAllServos' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOperations.g:664:3: ( (lv_name_0_0= 'readAllServos' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOperations.g:664:3: ( (lv_name_0_0= 'readAllServos' ) )
            // InternalOperations.g:665:4: (lv_name_0_0= 'readAllServos' )
            {
            // InternalOperations.g:665:4: (lv_name_0_0= 'readAllServos' )
            // InternalOperations.g:666:5: lv_name_0_0= 'readAllServos'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReadAllServosAccess().getNameReadAllServosKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadAllServosRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "readAllServos");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAllServosAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAllServosAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereadAllServos"


    // $ANTLR start "entryRulereadServo"
    // InternalOperations.g:690:1: entryRulereadServo returns [EObject current=null] : iv_rulereadServo= rulereadServo EOF ;
    public final EObject entryRulereadServo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadServo = null;


        try {
            // InternalOperations.g:690:50: (iv_rulereadServo= rulereadServo EOF )
            // InternalOperations.g:691:2: iv_rulereadServo= rulereadServo EOF
            {
             newCompositeNode(grammarAccess.getReadServoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereadServo=rulereadServo();

            state._fsp--;

             current =iv_rulereadServo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereadServo"


    // $ANTLR start "rulereadServo"
    // InternalOperations.g:697:1: rulereadServo returns [EObject current=null] : ( ( (lv_name_0_0= 'readServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' ) ;
    public final EObject rulereadServo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_servo_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:703:2: ( ( ( (lv_name_0_0= 'readServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' ) )
            // InternalOperations.g:704:2: ( ( (lv_name_0_0= 'readServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:704:2: ( ( (lv_name_0_0= 'readServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' )
            // InternalOperations.g:705:3: ( (lv_name_0_0= 'readServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')'
            {
            // InternalOperations.g:705:3: ( (lv_name_0_0= 'readServo' ) )
            // InternalOperations.g:706:4: (lv_name_0_0= 'readServo' )
            {
            // InternalOperations.g:706:4: (lv_name_0_0= 'readServo' )
            // InternalOperations.g:707:5: lv_name_0_0= 'readServo'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReadServoAccess().getNameReadServoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadServoRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "readServo");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReadServoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:723:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:724:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:724:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:725:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getReadServoAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadServoRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReadServoAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereadServo"


    // $ANTLR start "entryRulerotateServo"
    // InternalOperations.g:750:1: entryRulerotateServo returns [EObject current=null] : iv_rulerotateServo= rulerotateServo EOF ;
    public final EObject entryRulerotateServo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateServo = null;


        try {
            // InternalOperations.g:750:52: (iv_rulerotateServo= rulerotateServo EOF )
            // InternalOperations.g:751:2: iv_rulerotateServo= rulerotateServo EOF
            {
             newCompositeNode(grammarAccess.getRotateServoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateServo=rulerotateServo();

            state._fsp--;

             current =iv_rulerotateServo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerotateServo"


    // $ANTLR start "rulerotateServo"
    // InternalOperations.g:757:1: rulerotateServo returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) ;
    public final EObject rulerotateServo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_servo_2_0 = null;

        EObject lv_angle_4_0 = null;

        EObject lv_time_6_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:763:2: ( ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) )
            // InternalOperations.g:764:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:764:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            // InternalOperations.g:765:3: ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')'
            {
            // InternalOperations.g:765:3: ( (lv_name_0_0= 'rotateServo' ) )
            // InternalOperations.g:766:4: (lv_name_0_0= 'rotateServo' )
            {
            // InternalOperations.g:766:4: (lv_name_0_0= 'rotateServo' )
            // InternalOperations.g:767:5: lv_name_0_0= 'rotateServo'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateServoAccess().getNameRotateServoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateServoRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateServo");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateServoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:783:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:784:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:784:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:785:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateServoAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:806:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:807:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:807:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:808:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateServoAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:829:3: ( (lv_time_6_0= ruleTime ) )
            // InternalOperations.g:830:4: (lv_time_6_0= ruleTime )
            {
            // InternalOperations.g:830:4: (lv_time_6_0= ruleTime )
            // InternalOperations.g:831:5: lv_time_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getTimeTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_6_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateServoAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerotateServo"


    // $ANTLR start "entryRulerotateAllServos"
    // InternalOperations.g:856:1: entryRulerotateAllServos returns [EObject current=null] : iv_rulerotateAllServos= rulerotateAllServos EOF ;
    public final EObject entryRulerotateAllServos() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateAllServos = null;


        try {
            // InternalOperations.g:856:56: (iv_rulerotateAllServos= rulerotateAllServos EOF )
            // InternalOperations.g:857:2: iv_rulerotateAllServos= rulerotateAllServos EOF
            {
             newCompositeNode(grammarAccess.getRotateAllServosRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateAllServos=rulerotateAllServos();

            state._fsp--;

             current =iv_rulerotateAllServos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerotateAllServos"


    // $ANTLR start "rulerotateAllServos"
    // InternalOperations.g:863:1: rulerotateAllServos returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) ;
    public final EObject rulerotateAllServos() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_angle1_2_0 = null;

        EObject lv_angle2_4_0 = null;

        EObject lv_angle3_6_0 = null;

        EObject lv_angle4_8_0 = null;

        EObject lv_angle5_10_0 = null;

        EObject lv_angle6_12_0 = null;

        EObject lv_time_14_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:869:2: ( ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) )
            // InternalOperations.g:870:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:870:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            // InternalOperations.g:871:3: ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')'
            {
            // InternalOperations.g:871:3: ( (lv_name_0_0= 'rotateAllServos' ) )
            // InternalOperations.g:872:4: (lv_name_0_0= 'rotateAllServos' )
            {
            // InternalOperations.g:872:4: (lv_name_0_0= 'rotateAllServos' )
            // InternalOperations.g:873:5: lv_name_0_0= 'rotateAllServos'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAllServosAccess().getNameRotateAllServosKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateAllServosRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateAllServos");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAllServosAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:889:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalOperations.g:890:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalOperations.g:890:4: (lv_angle1_2_0= ruleAngle )
            // InternalOperations.g:891:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAllServosAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:912:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalOperations.g:913:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalOperations.g:913:4: (lv_angle2_4_0= ruleAngle )
            // InternalOperations.g:914:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAllServosAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:935:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalOperations.g:936:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalOperations.g:936:4: (lv_angle3_6_0= ruleAngle )
            // InternalOperations.g:937:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAllServosAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:958:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalOperations.g:959:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalOperations.g:959:4: (lv_angle4_8_0= ruleAngle )
            // InternalOperations.g:960:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getRotateAllServosAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:981:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalOperations.g:982:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalOperations.g:982:4: (lv_angle5_10_0= ruleAngle )
            // InternalOperations.g:983:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getRotateAllServosAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:1004:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalOperations.g:1005:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalOperations.g:1005:4: (lv_angle6_12_0= ruleAngle )
            // InternalOperations.g:1006:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getRotateAllServosAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:1027:3: ( (lv_time_14_0= ruleTime ) )
            // InternalOperations.g:1028:4: (lv_time_14_0= ruleTime )
            {
            // InternalOperations.g:1028:4: (lv_time_14_0= ruleTime )
            // InternalOperations.g:1029:5: lv_time_14_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getTimeTimeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_14_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_14_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRotateAllServosAccess().getRightParenthesisKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerotateAllServos"


    // $ANTLR start "entryRuleisAtSingle"
    // InternalOperations.g:1054:1: entryRuleisAtSingle returns [EObject current=null] : iv_ruleisAtSingle= ruleisAtSingle EOF ;
    public final EObject entryRuleisAtSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingle = null;


        try {
            // InternalOperations.g:1054:51: (iv_ruleisAtSingle= ruleisAtSingle EOF )
            // InternalOperations.g:1055:2: iv_ruleisAtSingle= ruleisAtSingle EOF
            {
             newCompositeNode(grammarAccess.getIsAtSingleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAtSingle=ruleisAtSingle();

            state._fsp--;

             current =iv_ruleisAtSingle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisAtSingle"


    // $ANTLR start "ruleisAtSingle"
    // InternalOperations.g:1061:1: ruleisAtSingle returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
    public final EObject ruleisAtSingle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_servo_2_0 = null;

        EObject lv_angle_4_0 = null;

        EObject lv_angle_res_6_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:1067:2: ( ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalOperations.g:1068:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:1068:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalOperations.g:1069:3: ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalOperations.g:1069:3: ( (lv_name_0_0= 'isAtSingle' ) )
            // InternalOperations.g:1070:4: (lv_name_0_0= 'isAtSingle' )
            {
            // InternalOperations.g:1070:4: (lv_name_0_0= 'isAtSingle' )
            // InternalOperations.g:1071:5: lv_name_0_0= 'isAtSingle'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingle");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:1087:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:1088:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:1088:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:1089:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:1110:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:1111:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:1111:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:1112:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:1133:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalOperations.g:1134:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalOperations.g:1134:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalOperations.g:1135:5: lv_angle_res_6_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_6_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_6_0,
            						"org.xtext.Operations.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtSingleAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisAtSingle"


    // $ANTLR start "entryRuleisAt"
    // InternalOperations.g:1160:1: entryRuleisAt returns [EObject current=null] : iv_ruleisAt= ruleisAt EOF ;
    public final EObject entryRuleisAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAt = null;


        try {
            // InternalOperations.g:1160:45: (iv_ruleisAt= ruleisAt EOF )
            // InternalOperations.g:1161:2: iv_ruleisAt= ruleisAt EOF
            {
             newCompositeNode(grammarAccess.getIsAtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAt=ruleisAt();

            state._fsp--;

             current =iv_ruleisAt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisAt"


    // $ANTLR start "ruleisAt"
    // InternalOperations.g:1167:1: ruleisAt returns [EObject current=null] : ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) ;
    public final EObject ruleisAt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_angle1_2_0 = null;

        EObject lv_angle2_4_0 = null;

        EObject lv_angle3_6_0 = null;

        EObject lv_angle4_8_0 = null;

        EObject lv_angle5_10_0 = null;

        EObject lv_angle6_12_0 = null;

        EObject lv_angle_res_14_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:1173:2: ( ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) )
            // InternalOperations.g:1174:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:1174:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            // InternalOperations.g:1175:3: ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')'
            {
            // InternalOperations.g:1175:3: ( (lv_name_0_0= 'isAt' ) )
            // InternalOperations.g:1176:4: (lv_name_0_0= 'isAt' )
            {
            // InternalOperations.g:1176:4: (lv_name_0_0= 'isAt' )
            // InternalOperations.g:1177:5: lv_name_0_0= 'isAt'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAt");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:1193:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalOperations.g:1194:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalOperations.g:1194:4: (lv_angle1_2_0= ruleAngle )
            // InternalOperations.g:1195:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:1216:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalOperations.g:1217:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalOperations.g:1217:4: (lv_angle2_4_0= ruleAngle )
            // InternalOperations.g:1218:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:1239:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalOperations.g:1240:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalOperations.g:1240:4: (lv_angle3_6_0= ruleAngle )
            // InternalOperations.g:1241:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:1262:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalOperations.g:1263:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalOperations.g:1263:4: (lv_angle4_8_0= ruleAngle )
            // InternalOperations.g:1264:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getIsAtAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:1285:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalOperations.g:1286:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalOperations.g:1286:4: (lv_angle5_10_0= ruleAngle )
            // InternalOperations.g:1287:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getIsAtAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:1308:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalOperations.g:1309:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalOperations.g:1309:4: (lv_angle6_12_0= ruleAngle )
            // InternalOperations.g:1310:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getIsAtAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:1331:3: ( (lv_angle_res_14_0= ruleAngle_res ) )
            // InternalOperations.g:1332:4: (lv_angle_res_14_0= ruleAngle_res )
            {
            // InternalOperations.g:1332:4: (lv_angle_res_14_0= ruleAngle_res )
            // InternalOperations.g:1333:5: lv_angle_res_14_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_14_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_14_0,
            						"org.xtext.Operations.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIsAtAccess().getRightParenthesisKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisAt"


    // $ANTLR start "entryRuleAngle_res"
    // InternalOperations.g:1358:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalOperations.g:1358:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalOperations.g:1359:2: iv_ruleAngle_res= ruleAngle_res EOF
            {
             newCompositeNode(grammarAccess.getAngle_resRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngle_res=ruleAngle_res();

            state._fsp--;

             current =iv_ruleAngle_res; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAngle_res"


    // $ANTLR start "ruleAngle_res"
    // InternalOperations.g:1365:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1371:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalOperations.g:1372:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1372:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalOperations.g:1373:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalOperations.g:1373:3: (lv_angle_res_0_0= RULE_INT )
            // InternalOperations.g:1374:4: lv_angle_res_0_0= RULE_INT
            {
            lv_angle_res_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_angle_res_0_0, grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAngle_resRule());
            				}
            				setWithLastConsumed(
            					current,
            					"angle_res",
            					lv_angle_res_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAngle_res"


    // $ANTLR start "entryRuleAngle"
    // InternalOperations.g:1393:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalOperations.g:1393:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalOperations.g:1394:2: iv_ruleAngle= ruleAngle EOF
            {
             newCompositeNode(grammarAccess.getAngleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngle=ruleAngle();

            state._fsp--;

             current =iv_ruleAngle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // InternalOperations.g:1400:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1406:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalOperations.g:1407:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1407:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalOperations.g:1408:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalOperations.g:1408:3: (lv_angle_0_0= RULE_INT )
            // InternalOperations.g:1409:4: lv_angle_0_0= RULE_INT
            {
            lv_angle_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_angle_0_0, grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAngleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"angle",
            					lv_angle_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAngle"


    // $ANTLR start "entryRuleTime"
    // InternalOperations.g:1428:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOperations.g:1428:45: (iv_ruleTime= ruleTime EOF )
            // InternalOperations.g:1429:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalOperations.g:1435:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1441:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalOperations.g:1442:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1442:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalOperations.g:1443:3: (lv_time_0_0= RULE_INT )
            {
            // InternalOperations.g:1443:3: (lv_time_0_0= RULE_INT )
            // InternalOperations.g:1444:4: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTimeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"time",
            					lv_time_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleServo"
    // InternalOperations.g:1463:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalOperations.g:1463:46: (iv_ruleServo= ruleServo EOF )
            // InternalOperations.g:1464:2: iv_ruleServo= ruleServo EOF
            {
             newCompositeNode(grammarAccess.getServoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServo=ruleServo();

            state._fsp--;

             current =iv_ruleServo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServo"


    // $ANTLR start "ruleServo"
    // InternalOperations.g:1470:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1476:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalOperations.g:1477:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1477:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalOperations.g:1478:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalOperations.g:1478:3: (lv_servo_0_0= RULE_INT )
            // InternalOperations.g:1479:4: lv_servo_0_0= RULE_INT
            {
            lv_servo_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_servo_0_0, grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getServoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"servo",
            					lv_servo_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServo"


    // $ANTLR start "entryRuleV_max"
    // InternalOperations.g:1498:1: entryRuleV_max returns [EObject current=null] : iv_ruleV_max= ruleV_max EOF ;
    public final EObject entryRuleV_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV_max = null;


        try {
            // InternalOperations.g:1498:46: (iv_ruleV_max= ruleV_max EOF )
            // InternalOperations.g:1499:2: iv_ruleV_max= ruleV_max EOF
            {
             newCompositeNode(grammarAccess.getV_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV_max=ruleV_max();

            state._fsp--;

             current =iv_ruleV_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV_max"


    // $ANTLR start "ruleV_max"
    // InternalOperations.g:1505:1: ruleV_max returns [EObject current=null] : ( (lv_v_max_0_0= RULE_INT ) ) ;
    public final EObject ruleV_max() throws RecognitionException {
        EObject current = null;

        Token lv_v_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1511:2: ( ( (lv_v_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1512:2: ( (lv_v_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1512:2: ( (lv_v_max_0_0= RULE_INT ) )
            // InternalOperations.g:1513:3: (lv_v_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1513:3: (lv_v_max_0_0= RULE_INT )
            // InternalOperations.g:1514:4: lv_v_max_0_0= RULE_INT
            {
            lv_v_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_v_max_0_0, grammarAccess.getV_maxAccess().getV_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getV_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"v_max",
            					lv_v_max_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV_max"


    // $ANTLR start "entryRuleS_max"
    // InternalOperations.g:1533:1: entryRuleS_max returns [EObject current=null] : iv_ruleS_max= ruleS_max EOF ;
    public final EObject entryRuleS_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS_max = null;


        try {
            // InternalOperations.g:1533:46: (iv_ruleS_max= ruleS_max EOF )
            // InternalOperations.g:1534:2: iv_ruleS_max= ruleS_max EOF
            {
             newCompositeNode(grammarAccess.getS_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS_max=ruleS_max();

            state._fsp--;

             current =iv_ruleS_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleS_max"


    // $ANTLR start "ruleS_max"
    // InternalOperations.g:1540:1: ruleS_max returns [EObject current=null] : ( (lv_s_max_0_0= RULE_INT ) ) ;
    public final EObject ruleS_max() throws RecognitionException {
        EObject current = null;

        Token lv_s_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1546:2: ( ( (lv_s_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1547:2: ( (lv_s_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1547:2: ( (lv_s_max_0_0= RULE_INT ) )
            // InternalOperations.g:1548:3: (lv_s_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1548:3: (lv_s_max_0_0= RULE_INT )
            // InternalOperations.g:1549:4: lv_s_max_0_0= RULE_INT
            {
            lv_s_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_s_max_0_0, grammarAccess.getS_maxAccess().getS_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getS_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"s_max",
            					lv_s_max_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleS_max"


    // $ANTLR start "entryRuleH_max"
    // InternalOperations.g:1568:1: entryRuleH_max returns [EObject current=null] : iv_ruleH_max= ruleH_max EOF ;
    public final EObject entryRuleH_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleH_max = null;


        try {
            // InternalOperations.g:1568:46: (iv_ruleH_max= ruleH_max EOF )
            // InternalOperations.g:1569:2: iv_ruleH_max= ruleH_max EOF
            {
             newCompositeNode(grammarAccess.getH_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleH_max=ruleH_max();

            state._fsp--;

             current =iv_ruleH_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleH_max"


    // $ANTLR start "ruleH_max"
    // InternalOperations.g:1575:1: ruleH_max returns [EObject current=null] : ( (lv_h_max_0_0= RULE_INT ) ) ;
    public final EObject ruleH_max() throws RecognitionException {
        EObject current = null;

        Token lv_h_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1581:2: ( ( (lv_h_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1582:2: ( (lv_h_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1582:2: ( (lv_h_max_0_0= RULE_INT ) )
            // InternalOperations.g:1583:3: (lv_h_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1583:3: (lv_h_max_0_0= RULE_INT )
            // InternalOperations.g:1584:4: lv_h_max_0_0= RULE_INT
            {
            lv_h_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_h_max_0_0, grammarAccess.getH_maxAccess().getH_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getH_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"h_max",
            					lv_h_max_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleH_max"


    // $ANTLR start "entryRuleV_min"
    // InternalOperations.g:1603:1: entryRuleV_min returns [EObject current=null] : iv_ruleV_min= ruleV_min EOF ;
    public final EObject entryRuleV_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV_min = null;


        try {
            // InternalOperations.g:1603:46: (iv_ruleV_min= ruleV_min EOF )
            // InternalOperations.g:1604:2: iv_ruleV_min= ruleV_min EOF
            {
             newCompositeNode(grammarAccess.getV_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV_min=ruleV_min();

            state._fsp--;

             current =iv_ruleV_min; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV_min"


    // $ANTLR start "ruleV_min"
    // InternalOperations.g:1610:1: ruleV_min returns [EObject current=null] : ( (lv_v_min_0_0= RULE_INT ) ) ;
    public final EObject ruleV_min() throws RecognitionException {
        EObject current = null;

        Token lv_v_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1616:2: ( ( (lv_v_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1617:2: ( (lv_v_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1617:2: ( (lv_v_min_0_0= RULE_INT ) )
            // InternalOperations.g:1618:3: (lv_v_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1618:3: (lv_v_min_0_0= RULE_INT )
            // InternalOperations.g:1619:4: lv_v_min_0_0= RULE_INT
            {
            lv_v_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_v_min_0_0, grammarAccess.getV_minAccess().getV_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getV_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"v_min",
            					lv_v_min_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV_min"


    // $ANTLR start "entryRuleS_min"
    // InternalOperations.g:1638:1: entryRuleS_min returns [EObject current=null] : iv_ruleS_min= ruleS_min EOF ;
    public final EObject entryRuleS_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS_min = null;


        try {
            // InternalOperations.g:1638:46: (iv_ruleS_min= ruleS_min EOF )
            // InternalOperations.g:1639:2: iv_ruleS_min= ruleS_min EOF
            {
             newCompositeNode(grammarAccess.getS_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS_min=ruleS_min();

            state._fsp--;

             current =iv_ruleS_min; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleS_min"


    // $ANTLR start "ruleS_min"
    // InternalOperations.g:1645:1: ruleS_min returns [EObject current=null] : ( (lv_s_min_0_0= RULE_INT ) ) ;
    public final EObject ruleS_min() throws RecognitionException {
        EObject current = null;

        Token lv_s_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1651:2: ( ( (lv_s_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1652:2: ( (lv_s_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1652:2: ( (lv_s_min_0_0= RULE_INT ) )
            // InternalOperations.g:1653:3: (lv_s_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1653:3: (lv_s_min_0_0= RULE_INT )
            // InternalOperations.g:1654:4: lv_s_min_0_0= RULE_INT
            {
            lv_s_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_s_min_0_0, grammarAccess.getS_minAccess().getS_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getS_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"s_min",
            					lv_s_min_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleS_min"


    // $ANTLR start "entryRuleH_min"
    // InternalOperations.g:1673:1: entryRuleH_min returns [EObject current=null] : iv_ruleH_min= ruleH_min EOF ;
    public final EObject entryRuleH_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleH_min = null;


        try {
            // InternalOperations.g:1673:46: (iv_ruleH_min= ruleH_min EOF )
            // InternalOperations.g:1674:2: iv_ruleH_min= ruleH_min EOF
            {
             newCompositeNode(grammarAccess.getH_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleH_min=ruleH_min();

            state._fsp--;

             current =iv_ruleH_min; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleH_min"


    // $ANTLR start "ruleH_min"
    // InternalOperations.g:1680:1: ruleH_min returns [EObject current=null] : ( (lv_h_min_0_0= RULE_INT ) ) ;
    public final EObject ruleH_min() throws RecognitionException {
        EObject current = null;

        Token lv_h_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1686:2: ( ( (lv_h_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1687:2: ( (lv_h_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1687:2: ( (lv_h_min_0_0= RULE_INT ) )
            // InternalOperations.g:1688:3: (lv_h_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1688:3: (lv_h_min_0_0= RULE_INT )
            // InternalOperations.g:1689:4: lv_h_min_0_0= RULE_INT
            {
            lv_h_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_h_min_0_0, grammarAccess.getH_minAccess().getH_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getH_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"h_min",
            					lv_h_min_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleH_min"


    // $ANTLR start "entryRuleColor"
    // InternalOperations.g:1708:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalOperations.g:1708:46: (iv_ruleColor= ruleColor EOF )
            // InternalOperations.g:1709:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalOperations.g:1715:1: ruleColor returns [EObject current=null] : ( (lv_color_0_0= RULE_STRING ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1721:2: ( ( (lv_color_0_0= RULE_STRING ) ) )
            // InternalOperations.g:1722:2: ( (lv_color_0_0= RULE_STRING ) )
            {
            // InternalOperations.g:1722:2: ( (lv_color_0_0= RULE_STRING ) )
            // InternalOperations.g:1723:3: (lv_color_0_0= RULE_STRING )
            {
            // InternalOperations.g:1723:3: (lv_color_0_0= RULE_STRING )
            // InternalOperations.g:1724:4: lv_color_0_0= RULE_STRING
            {
            lv_color_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_color_0_0, grammarAccess.getColorAccess().getColorSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"color",
            					lv_color_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleB"
    // InternalOperations.g:1743:1: entryRuleB returns [EObject current=null] : iv_ruleB= ruleB EOF ;
    public final EObject entryRuleB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleB = null;


        try {
            // InternalOperations.g:1743:42: (iv_ruleB= ruleB EOF )
            // InternalOperations.g:1744:2: iv_ruleB= ruleB EOF
            {
             newCompositeNode(grammarAccess.getBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleB=ruleB();

            state._fsp--;

             current =iv_ruleB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleB"


    // $ANTLR start "ruleB"
    // InternalOperations.g:1750:1: ruleB returns [EObject current=null] : ( (lv_b_0_0= RULE_INT ) ) ;
    public final EObject ruleB() throws RecognitionException {
        EObject current = null;

        Token lv_b_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1756:2: ( ( (lv_b_0_0= RULE_INT ) ) )
            // InternalOperations.g:1757:2: ( (lv_b_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1757:2: ( (lv_b_0_0= RULE_INT ) )
            // InternalOperations.g:1758:3: (lv_b_0_0= RULE_INT )
            {
            // InternalOperations.g:1758:3: (lv_b_0_0= RULE_INT )
            // InternalOperations.g:1759:4: lv_b_0_0= RULE_INT
            {
            lv_b_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_b_0_0, grammarAccess.getBAccess().getBINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBRule());
            				}
            				setWithLastConsumed(
            					current,
            					"b",
            					lv_b_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleB"


    // $ANTLR start "entryRuleG"
    // InternalOperations.g:1778:1: entryRuleG returns [EObject current=null] : iv_ruleG= ruleG EOF ;
    public final EObject entryRuleG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG = null;


        try {
            // InternalOperations.g:1778:42: (iv_ruleG= ruleG EOF )
            // InternalOperations.g:1779:2: iv_ruleG= ruleG EOF
            {
             newCompositeNode(grammarAccess.getGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleG=ruleG();

            state._fsp--;

             current =iv_ruleG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleG"


    // $ANTLR start "ruleG"
    // InternalOperations.g:1785:1: ruleG returns [EObject current=null] : ( (lv_g_0_0= RULE_INT ) ) ;
    public final EObject ruleG() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1791:2: ( ( (lv_g_0_0= RULE_INT ) ) )
            // InternalOperations.g:1792:2: ( (lv_g_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1792:2: ( (lv_g_0_0= RULE_INT ) )
            // InternalOperations.g:1793:3: (lv_g_0_0= RULE_INT )
            {
            // InternalOperations.g:1793:3: (lv_g_0_0= RULE_INT )
            // InternalOperations.g:1794:4: lv_g_0_0= RULE_INT
            {
            lv_g_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_g_0_0, grammarAccess.getGAccess().getGINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"g",
            					lv_g_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleG"


    // $ANTLR start "entryRuleR"
    // InternalOperations.g:1813:1: entryRuleR returns [EObject current=null] : iv_ruleR= ruleR EOF ;
    public final EObject entryRuleR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleR = null;


        try {
            // InternalOperations.g:1813:42: (iv_ruleR= ruleR EOF )
            // InternalOperations.g:1814:2: iv_ruleR= ruleR EOF
            {
             newCompositeNode(grammarAccess.getRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleR=ruleR();

            state._fsp--;

             current =iv_ruleR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleR"


    // $ANTLR start "ruleR"
    // InternalOperations.g:1820:1: ruleR returns [EObject current=null] : ( (lv_r_0_0= RULE_INT ) ) ;
    public final EObject ruleR() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1826:2: ( ( (lv_r_0_0= RULE_INT ) ) )
            // InternalOperations.g:1827:2: ( (lv_r_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1827:2: ( (lv_r_0_0= RULE_INT ) )
            // InternalOperations.g:1828:3: (lv_r_0_0= RULE_INT )
            {
            // InternalOperations.g:1828:3: (lv_r_0_0= RULE_INT )
            // InternalOperations.g:1829:4: lv_r_0_0= RULE_INT
            {
            lv_r_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_r_0_0, grammarAccess.getRAccess().getRINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRRule());
            				}
            				setWithLastConsumed(
            					current,
            					"r",
            					lv_r_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}