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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IotSystem'", "'{'", "'ownedActor'", "','", "'}'", "'ownedResource'", "'Actor'", "'isPriority'", "'processTime'", "'periodTime'", "'resource'", "'Resource'", "'actor'", "'('", "')'", "'-'", "'MaliciousActor'"
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
    public static final int T__27=27;
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


    // $ANTLR start "entryRuleActor"
    // InternalSock.g:237:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSock.g:237:46: (iv_ruleActor= ruleActor EOF )
            // InternalSock.g:238:2: iv_ruleActor= ruleActor EOF
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
    // InternalSock.g:244:1: ruleActor returns [EObject current=null] : (this_Actor_Impl_0= ruleActor_Impl | this_MaliciousActor_1= ruleMaliciousActor ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_Impl_0 = null;

        EObject this_MaliciousActor_1 = null;



        	enterRule();

        try {
            // InternalSock.g:250:2: ( (this_Actor_Impl_0= ruleActor_Impl | this_MaliciousActor_1= ruleMaliciousActor ) )
            // InternalSock.g:251:2: (this_Actor_Impl_0= ruleActor_Impl | this_MaliciousActor_1= ruleMaliciousActor )
            {
            // InternalSock.g:251:2: (this_Actor_Impl_0= ruleActor_Impl | this_MaliciousActor_1= ruleMaliciousActor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSock.g:252:3: this_Actor_Impl_0= ruleActor_Impl
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getActor_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actor_Impl_0=ruleActor_Impl();

                    state._fsp--;


                    			current = this_Actor_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSock.g:261:3: this_MaliciousActor_1= ruleMaliciousActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getMaliciousActorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaliciousActor_1=ruleMaliciousActor();

                    state._fsp--;


                    			current = this_MaliciousActor_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleEString"
    // InternalSock.g:273:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSock.g:273:47: (iv_ruleEString= ruleEString EOF )
            // InternalSock.g:274:2: iv_ruleEString= ruleEString EOF
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
    // InternalSock.g:280:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSock.g:286:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSock.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSock.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSock.g:288:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSock.g:296:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleActor_Impl"
    // InternalSock.g:307:1: entryRuleActor_Impl returns [EObject current=null] : iv_ruleActor_Impl= ruleActor_Impl EOF ;
    public final EObject entryRuleActor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor_Impl = null;


        try {
            // InternalSock.g:307:51: (iv_ruleActor_Impl= ruleActor_Impl EOF )
            // InternalSock.g:308:2: iv_ruleActor_Impl= ruleActor_Impl EOF
            {
             newCompositeNode(grammarAccess.getActor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor_Impl=ruleActor_Impl();

            state._fsp--;

             current =iv_ruleActor_Impl; 
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
    // $ANTLR end "entryRuleActor_Impl"


    // $ANTLR start "ruleActor_Impl"
    // InternalSock.g:314:1: ruleActor_Impl returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleActor_Impl() throws RecognitionException {
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
            // InternalSock.g:320:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalSock.g:321:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalSock.g:321:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalSock.g:322:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalSock.g:322:3: ()
            // InternalSock.g:323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActor_ImplAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActor_ImplAccess().getActorKeyword_1());
            		
            // InternalSock.g:333:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:334:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:334:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:335:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActor_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActor_ImplRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getActor_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSock.g:356:3: (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSock.g:357:4: otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getActor_ImplAccess().getIsPriorityKeyword_4_0());
                    			
                    // InternalSock.g:361:4: ( (lv_isPriority_5_0= ruleEInt ) )
                    // InternalSock.g:362:5: (lv_isPriority_5_0= ruleEInt )
                    {
                    // InternalSock.g:362:5: (lv_isPriority_5_0= ruleEInt )
                    // InternalSock.g:363:6: lv_isPriority_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActor_ImplAccess().getIsPriorityEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_isPriority_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActor_ImplRule());
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

            // InternalSock.g:381:3: (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSock.g:382:4: otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getActor_ImplAccess().getProcessTimeKeyword_5_0());
                    			
                    // InternalSock.g:386:4: ( (lv_processTime_7_0= ruleEInt ) )
                    // InternalSock.g:387:5: (lv_processTime_7_0= ruleEInt )
                    {
                    // InternalSock.g:387:5: (lv_processTime_7_0= ruleEInt )
                    // InternalSock.g:388:6: lv_processTime_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActor_ImplAccess().getProcessTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_processTime_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActor_ImplRule());
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

            // InternalSock.g:406:3: (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSock.g:407:4: otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getActor_ImplAccess().getPeriodTimeKeyword_6_0());
                    			
                    // InternalSock.g:411:4: ( (lv_periodTime_9_0= ruleEInt ) )
                    // InternalSock.g:412:5: (lv_periodTime_9_0= ruleEInt )
                    {
                    // InternalSock.g:412:5: (lv_periodTime_9_0= ruleEInt )
                    // InternalSock.g:413:6: lv_periodTime_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActor_ImplAccess().getPeriodTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_periodTime_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActor_ImplRule());
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

            // InternalSock.g:431:3: (otherlv_10= 'resource' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSock.g:432:4: otherlv_10= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getActor_ImplAccess().getResourceKeyword_7_0());
                    			
                    // InternalSock.g:436:4: ( ( ruleEString ) )
                    // InternalSock.g:437:5: ( ruleEString )
                    {
                    // InternalSock.g:437:5: ( ruleEString )
                    // InternalSock.g:438:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActor_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActor_ImplAccess().getResourceResourceCrossReference_7_1_0());
                    					
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

            			newLeafNode(otherlv_12, grammarAccess.getActor_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActor_Impl"


    // $ANTLR start "entryRuleResource"
    // InternalSock.g:461:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSock.g:461:49: (iv_ruleResource= ruleResource EOF )
            // InternalSock.g:462:2: iv_ruleResource= ruleResource EOF
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
    // InternalSock.g:468:1: ruleResource returns [EObject current=null] : ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
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
            // InternalSock.g:474:2: ( ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalSock.g:475:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalSock.g:475:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalSock.g:476:3: () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalSock.g:476:3: ()
            // InternalSock.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getResourceKeyword_1());
            		
            // InternalSock.g:487:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:488:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:488:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:489:5: lv_name_2_0= ruleEString
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
            		
            // InternalSock.g:510:3: (otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSock.g:511:4: otherlv_4= 'actor' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getActorKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSock.g:519:4: ( ( ruleEString ) )
                    // InternalSock.g:520:5: ( ruleEString )
                    {
                    // InternalSock.g:520:5: ( ruleEString )
                    // InternalSock.g:521:6: ruleEString
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

                    // InternalSock.g:535:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSock.g:536:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSock.g:540:5: ( ( ruleEString ) )
                    	    // InternalSock.g:541:6: ( ruleEString )
                    	    {
                    	    // InternalSock.g:541:6: ( ruleEString )
                    	    // InternalSock.g:542:7: ruleEString
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
                    	    break loop11;
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
    // InternalSock.g:570:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSock.g:570:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSock.g:571:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSock.g:577:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSock.g:583:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSock.g:584:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSock.g:584:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSock.g:585:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSock.g:585:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSock.g:586:4: kw= '-'
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


    // $ANTLR start "entryRuleMaliciousActor"
    // InternalSock.g:603:1: entryRuleMaliciousActor returns [EObject current=null] : iv_ruleMaliciousActor= ruleMaliciousActor EOF ;
    public final EObject entryRuleMaliciousActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaliciousActor = null;


        try {
            // InternalSock.g:603:55: (iv_ruleMaliciousActor= ruleMaliciousActor EOF )
            // InternalSock.g:604:2: iv_ruleMaliciousActor= ruleMaliciousActor EOF
            {
             newCompositeNode(grammarAccess.getMaliciousActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaliciousActor=ruleMaliciousActor();

            state._fsp--;

             current =iv_ruleMaliciousActor; 
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
    // $ANTLR end "entryRuleMaliciousActor"


    // $ANTLR start "ruleMaliciousActor"
    // InternalSock.g:610:1: ruleMaliciousActor returns [EObject current=null] : ( () otherlv_1= 'MaliciousActor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMaliciousActor() throws RecognitionException {
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
            // InternalSock.g:616:2: ( ( () otherlv_1= 'MaliciousActor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalSock.g:617:2: ( () otherlv_1= 'MaliciousActor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalSock.g:617:2: ( () otherlv_1= 'MaliciousActor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalSock.g:618:3: () otherlv_1= 'MaliciousActor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )? (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )? (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )? (otherlv_10= 'resource' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalSock.g:618:3: ()
            // InternalSock.g:619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaliciousActorAccess().getMaliciousActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMaliciousActorAccess().getMaliciousActorKeyword_1());
            		
            // InternalSock.g:629:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSock.g:630:4: (lv_name_2_0= ruleEString )
            {
            // InternalSock.g:630:4: (lv_name_2_0= ruleEString )
            // InternalSock.g:631:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaliciousActorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaliciousActorRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getMaliciousActorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSock.g:652:3: (otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSock.g:653:4: otherlv_4= 'isPriority' ( (lv_isPriority_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getMaliciousActorAccess().getIsPriorityKeyword_4_0());
                    			
                    // InternalSock.g:657:4: ( (lv_isPriority_5_0= ruleEInt ) )
                    // InternalSock.g:658:5: (lv_isPriority_5_0= ruleEInt )
                    {
                    // InternalSock.g:658:5: (lv_isPriority_5_0= ruleEInt )
                    // InternalSock.g:659:6: lv_isPriority_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMaliciousActorAccess().getIsPriorityEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_isPriority_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaliciousActorRule());
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

            // InternalSock.g:677:3: (otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSock.g:678:4: otherlv_6= 'processTime' ( (lv_processTime_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getMaliciousActorAccess().getProcessTimeKeyword_5_0());
                    			
                    // InternalSock.g:682:4: ( (lv_processTime_7_0= ruleEInt ) )
                    // InternalSock.g:683:5: (lv_processTime_7_0= ruleEInt )
                    {
                    // InternalSock.g:683:5: (lv_processTime_7_0= ruleEInt )
                    // InternalSock.g:684:6: lv_processTime_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMaliciousActorAccess().getProcessTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_processTime_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaliciousActorRule());
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

            // InternalSock.g:702:3: (otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSock.g:703:4: otherlv_8= 'periodTime' ( (lv_periodTime_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getMaliciousActorAccess().getPeriodTimeKeyword_6_0());
                    			
                    // InternalSock.g:707:4: ( (lv_periodTime_9_0= ruleEInt ) )
                    // InternalSock.g:708:5: (lv_periodTime_9_0= ruleEInt )
                    {
                    // InternalSock.g:708:5: (lv_periodTime_9_0= ruleEInt )
                    // InternalSock.g:709:6: lv_periodTime_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMaliciousActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_periodTime_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaliciousActorRule());
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

            // InternalSock.g:727:3: (otherlv_10= 'resource' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSock.g:728:4: otherlv_10= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMaliciousActorAccess().getResourceKeyword_7_0());
                    			
                    // InternalSock.g:732:4: ( ( ruleEString ) )
                    // InternalSock.g:733:5: ( ruleEString )
                    {
                    // InternalSock.g:733:5: ( ruleEString )
                    // InternalSock.g:734:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaliciousActorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMaliciousActorAccess().getResourceResourceCrossReference_7_1_0());
                    					
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

            			newLeafNode(otherlv_12, grammarAccess.getMaliciousActorAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMaliciousActor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008020000L});
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