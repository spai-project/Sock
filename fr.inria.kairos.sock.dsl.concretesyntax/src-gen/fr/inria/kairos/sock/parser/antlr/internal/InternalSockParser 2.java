package fr.inria.kairos.sock.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.kairos.sock.services.SockGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSockParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IotSystem'", "'{'", "'ownedActor'", "','", "'}'", "'ownedResource'", "'Actor'", "'isPriority'", "'processTime'", "'periodTime'", "'resource'", "'Resource'", "'actor'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSockParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSockParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSockParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSock.g"; }



     	private SockGrammarAccess grammarAccess;

        public InternalSockParser(TokenStream input, SockGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IotSystem";
       	}

       	@Override
       	protected SockGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIotSystem"
    // InternalSock.g:64:1: entryRuleIotSystem returns [EObject current=null] : iv_ruleIotSystem= ruleIotSystem EOF ;
    public final EObject entryRuleIotSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotSystem = null;


        try {
            // InternalSock.g:64:50: (iv_ruleIotSystem= ruleIotSystem EOF )
            // InternalSock.g:65:2: iv_ruleIotSystem= ruleIotSystem EOF
            {
             newCompositeNode(grammarAccess.getIotSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIotSystem=ruleIotSystem();

            state._fsp--;

             current =iv_ruleIotSystem; 
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
    // $ANTLR end "entryRuleIotSystem"


    // $ANTLR start "ruleIotSystem"
    // InternalSock.g:71:1: ruleIotSystem returns [EObject current=null] : ( () otherlv_1= 'IotSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleIotSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedActor_6_0 = null;

        EObject lv_ownedActor_8_0 = null;

        EObject lv_ownedResource_12_0 = null;

        EObject lv_ownedResource_14_0 = null;



        	enterRule();

        try {
            // InternalSock.g:77:2: ( ( () otherlv_1= 'IotSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSock.g:78:2: ( () otherlv_1= 'IotSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSock.g:78:2: ( () otherlv_1= 'IotSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSock.g:79:3: () otherlv_1= 'IotSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSock.g:79:3: ()
            // InternalSock.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIotSystemAccess().getIotSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIotSystemAccess().getIotSystemKeyword_1());
            		
            // InternalSock.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:91:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIotSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIotSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.sock.Sock.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSock.g:113:3: (otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSock.g:114:4: otherlv_4= 'ownedActor' otherlv_5= '{' ( (lv_ownedActor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIotSystemAccess().getOwnedActorKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSock.g:122:4: ( (lv_ownedActor_6_0= ruleActor ) )
                    // InternalSock.g:123:5: (lv_ownedActor_6_0= ruleActor )
                    {
                    // InternalSock.g:123:5: (lv_ownedActor_6_0= ruleActor )
                    // InternalSock.g:124:6: lv_ownedActor_6_0= ruleActor
                    {

                    						newCompositeNode(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ownedActor_6_0=ruleActor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIotSystemRule());
                    						}
                    						add(
                    							current,
                    							"ownedActor",
                    							lv_ownedActor_6_0,
                    							"fr.inria.kairos.sock.Sock.Actor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSock.g:141:4: (otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSock.g:142:5: otherlv_7= ',' ( (lv_ownedActor_8_0= ruleActor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getIotSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSock.g:146:5: ( (lv_ownedActor_8_0= ruleActor ) )
                    	    // InternalSock.g:147:6: (lv_ownedActor_8_0= ruleActor )
                    	    {
                    	    // InternalSock.g:147:6: (lv_ownedActor_8_0= ruleActor )
                    	    // InternalSock.g:148:7: lv_ownedActor_8_0= ruleActor
                    	    {

                    	    							newCompositeNode(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ownedActor_8_0=ruleActor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIotSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedActor",
                    	    								lv_ownedActor_8_0,
                    	    								"fr.inria.kairos.sock.Sock.Actor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSock.g:171:3: (otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSock.g:172:4: otherlv_10= 'ownedResource' otherlv_11= '{' ( (lv_ownedResource_12_0= ruleResource ) ) (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getIotSystemAccess().getOwnedResourceKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSock.g:180:4: ( (lv_ownedResource_12_0= ruleResource ) )
                    // InternalSock.g:181:5: (lv_ownedResource_12_0= ruleResource )
                    {
                    // InternalSock.g:181:5: (lv_ownedResource_12_0= ruleResource )
                    // InternalSock.g:182:6: lv_ownedResource_12_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ownedResource_12_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIotSystemRule());
                    						}
                    						add(
                    							current,
                    							"ownedResource",
                    							lv_ownedResource_12_0,
                    							"fr.inria.kairos.sock.Sock.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSock.g:199:4: (otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSock.g:200:5: otherlv_13= ',' ( (lv_ownedResource_14_0= ruleResource ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getIotSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSock.g:204:5: ( (lv_ownedResource_14_0= ruleResource ) )
                    	    // InternalSock.g:205:6: (lv_ownedResource_14_0= ruleResource )
                    	    {
                    	    // InternalSock.g:205:6: (lv_ownedResource_14_0= ruleResource )
                    	    // InternalSock.g:206:7: lv_ownedResource_14_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ownedResource_14_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIotSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedResource",
                    	    								lv_ownedResource_14_0,
                    	    								"fr.inria.kairos.sock.Sock.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleIotSystem"


    // $ANTLR start "entryRuleEString"
    // InternalSock.g:237:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSock.g:237:47: (iv_ruleEString= ruleEString EOF )
            // InternalSock.g:238:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSock.g:244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSock.g:250:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSock.g:251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSock.g:251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSock.g:252:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSock.g:260:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleActor"
    // InternalSock.g:271:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSock.g:271:46: (iv_ruleActor= ruleActor EOF )
            // InternalSock.g:272:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSock.g:278:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_isPriority_5_0 = null;

        AntlrDatatypeRuleToken lv_processTime_7_0 = null;

        AntlrDatatypeRuleToken lv_periodTime_9_0 = null;



        	enterRule();

        try {
            // InternalSock.g:284:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalSock.g:285:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalSock.g:285:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalSock.g:286:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalSock.g:286:3: ()
            // InternalSock.g:287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            // InternalSock.g:297:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:298:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:298:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:299:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.sock.Sock.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSock.g:320:3: (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSock.g:321:4: otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getActorAccess().getIsPriorityKeyword_4_0());
                    			
                    // InternalSock.g:325:4: ( (lv_isPriority_5_0= ruleEInt ) )
                    // InternalSock.g:326:5: (lv_isPriority_5_0= ruleEInt )
                    {
                    // InternalSock.g:326:5: (lv_isPriority_5_0= ruleEInt )
                    // InternalSock.g:327:6: lv_isPriority_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getIsPriorityEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_isPriority_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"isPriority",
                    							lv_isPriority_5_0,
                    							"fr.inria.kairos.sock.Sock.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSock.g:345:3: (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSock.g:346:4: otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getProcessTimeKeyword_5_0());
                    			
                    // InternalSock.g:350:4: ( (lv_processTime_7_0= ruleEInt ) )
                    // InternalSock.g:351:5: (lv_processTime_7_0= ruleEInt )
                    {
                    // InternalSock.g:351:5: (lv_processTime_7_0= ruleEInt )
                    // InternalSock.g:352:6: lv_processTime_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getProcessTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_processTime_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"processTime",
                    							lv_processTime_7_0,
                    							"fr.inria.kairos.sock.Sock.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSock.g:370:3: (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSock.g:371:4: otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getActorAccess().getPeriodTimeKeyword_6_0());
                    			
                    // InternalSock.g:375:4: ( (lv_periodTime_9_0= ruleEInt ) )
                    // InternalSock.g:376:5: (lv_periodTime_9_0= ruleEInt )
                    {
                    // InternalSock.g:376:5: (lv_periodTime_9_0= ruleEInt )
                    // InternalSock.g:377:6: lv_periodTime_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_periodTime_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"periodTime",
                    							lv_periodTime_9_0,
                    							"fr.inria.kairos.sock.Sock.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSock.g:395:3: (otherlv_10= 'resource' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSock.g:396:4: otherlv_10= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getResourceKeyword_7_0());
                    			
                    // InternalSock.g:400:4: ( ( ruleEString ) )
                    // InternalSock.g:401:5: ( ruleEString )
                    {
                    // InternalSock.g:401:5: ( ruleEString )
                    // InternalSock.g:402:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActorAccess().getResourceResourceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleResource"
    // InternalSock.g:425:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSock.g:425:49: (iv_ruleResource= ruleResource EOF )
            // InternalSock.g:426:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSock.g:432:1: ruleResource returns [EObject current=null] : ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSock.g:438:2: ( ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalSock.g:439:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalSock.g:439:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalSock.g:440:3: () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalSock.g:440:3: ()
            // InternalSock.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getResourceKeyword_1());
            		
            // InternalSock.g:451:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:452:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:452:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:453:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.sock.Sock.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSock.g:474:3: (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSock.g:475:4: otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getActorKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSock.g:483:4: ( ( ruleEString ) )
                    // InternalSock.g:484:5: ( ruleEString )
                    {
                    // InternalSock.g:484:5: ( ruleEString )
                    // InternalSock.g:485:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourceAccess().getActorActorCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSock.g:499:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSock.g:500:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSock.g:504:5: ( ( ruleEString ) )
                    	    // InternalSock.g:505:6: ( ruleEString )
                    	    {
                    	    // InternalSock.g:505:6: ( ruleEString )
                    	    // InternalSock.g:506:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getActorActorCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleEInt"
    // InternalSock.g:534:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSock.g:534:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSock.g:535:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSock.g:541:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSock.g:547:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSock.g:548:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSock.g:548:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSock.g:549:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSock.g:549:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSock.g:550:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}