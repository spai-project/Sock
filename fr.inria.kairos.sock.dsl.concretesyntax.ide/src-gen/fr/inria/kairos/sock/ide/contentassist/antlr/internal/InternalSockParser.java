package fr.inria.kairos.sock.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.kairos.sock.services.SockGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSockParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IotSystem'", "'{'", "'}'", "'ownedActor'", "','", "'ownedResource'", "'Actor'", "'isPriority'", "'processTime'", "'periodTime'", "'resource'", "'Resource'", "'actor'", "'('", "')'", "'-'", "'MaliciousActor'"
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

    	public void setGrammarAccess(SockGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleIotSystem"
    // InternalSock.g:53:1: entryRuleIotSystem : ruleIotSystem EOF ;
    public final void entryRuleIotSystem() throws RecognitionException {
        try {
            // InternalSock.g:54:1: ( ruleIotSystem EOF )
            // InternalSock.g:55:1: ruleIotSystem EOF
            {
             before(grammarAccess.getIotSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleIotSystem();

            state._fsp--;

             after(grammarAccess.getIotSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIotSystem"


    // $ANTLR start "ruleIotSystem"
    // InternalSock.g:62:1: ruleIotSystem : ( ( rule__IotSystem__Group__0 ) ) ;
    public final void ruleIotSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:66:2: ( ( ( rule__IotSystem__Group__0 ) ) )
            // InternalSock.g:67:2: ( ( rule__IotSystem__Group__0 ) )
            {
            // InternalSock.g:67:2: ( ( rule__IotSystem__Group__0 ) )
            // InternalSock.g:68:3: ( rule__IotSystem__Group__0 )
            {
             before(grammarAccess.getIotSystemAccess().getGroup()); 
            // InternalSock.g:69:3: ( rule__IotSystem__Group__0 )
            // InternalSock.g:69:4: rule__IotSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIotSystem"


    // $ANTLR start "entryRuleActor"
    // InternalSock.g:78:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalSock.g:79:1: ( ruleActor EOF )
            // InternalSock.g:80:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSock.g:87:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:91:2: ( ( ( rule__Actor__Alternatives ) ) )
            // InternalSock.g:92:2: ( ( rule__Actor__Alternatives ) )
            {
            // InternalSock.g:92:2: ( ( rule__Actor__Alternatives ) )
            // InternalSock.g:93:3: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // InternalSock.g:94:3: ( rule__Actor__Alternatives )
            // InternalSock.g:94:4: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleEString"
    // InternalSock.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSock.g:104:1: ( ruleEString EOF )
            // InternalSock.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSock.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSock.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSock.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSock.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSock.g:119:3: ( rule__EString__Alternatives )
            // InternalSock.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleActor_Impl"
    // InternalSock.g:128:1: entryRuleActor_Impl : ruleActor_Impl EOF ;
    public final void entryRuleActor_Impl() throws RecognitionException {
        try {
            // InternalSock.g:129:1: ( ruleActor_Impl EOF )
            // InternalSock.g:130:1: ruleActor_Impl EOF
            {
             before(grammarAccess.getActor_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleActor_Impl();

            state._fsp--;

             after(grammarAccess.getActor_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor_Impl"


    // $ANTLR start "ruleActor_Impl"
    // InternalSock.g:137:1: ruleActor_Impl : ( ( rule__Actor_Impl__Group__0 ) ) ;
    public final void ruleActor_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:141:2: ( ( ( rule__Actor_Impl__Group__0 ) ) )
            // InternalSock.g:142:2: ( ( rule__Actor_Impl__Group__0 ) )
            {
            // InternalSock.g:142:2: ( ( rule__Actor_Impl__Group__0 ) )
            // InternalSock.g:143:3: ( rule__Actor_Impl__Group__0 )
            {
             before(grammarAccess.getActor_ImplAccess().getGroup()); 
            // InternalSock.g:144:3: ( rule__Actor_Impl__Group__0 )
            // InternalSock.g:144:4: rule__Actor_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor_Impl"


    // $ANTLR start "entryRuleResource"
    // InternalSock.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalSock.g:154:1: ( ruleResource EOF )
            // InternalSock.g:155:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSock.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalSock.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalSock.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalSock.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalSock.g:169:3: ( rule__Resource__Group__0 )
            // InternalSock.g:169:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleEInt"
    // InternalSock.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSock.g:179:1: ( ruleEInt EOF )
            // InternalSock.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSock.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSock.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSock.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalSock.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSock.g:194:3: ( rule__EInt__Group__0 )
            // InternalSock.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleMaliciousActor"
    // InternalSock.g:203:1: entryRuleMaliciousActor : ruleMaliciousActor EOF ;
    public final void entryRuleMaliciousActor() throws RecognitionException {
        try {
            // InternalSock.g:204:1: ( ruleMaliciousActor EOF )
            // InternalSock.g:205:1: ruleMaliciousActor EOF
            {
             before(grammarAccess.getMaliciousActorRule()); 
            pushFollow(FOLLOW_1);
            ruleMaliciousActor();

            state._fsp--;

             after(grammarAccess.getMaliciousActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaliciousActor"


    // $ANTLR start "ruleMaliciousActor"
    // InternalSock.g:212:1: ruleMaliciousActor : ( ( rule__MaliciousActor__Group__0 ) ) ;
    public final void ruleMaliciousActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:216:2: ( ( ( rule__MaliciousActor__Group__0 ) ) )
            // InternalSock.g:217:2: ( ( rule__MaliciousActor__Group__0 ) )
            {
            // InternalSock.g:217:2: ( ( rule__MaliciousActor__Group__0 ) )
            // InternalSock.g:218:3: ( rule__MaliciousActor__Group__0 )
            {
             before(grammarAccess.getMaliciousActorAccess().getGroup()); 
            // InternalSock.g:219:3: ( rule__MaliciousActor__Group__0 )
            // InternalSock.g:219:4: rule__MaliciousActor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaliciousActor"


    // $ANTLR start "rule__Actor__Alternatives"
    // InternalSock.g:227:1: rule__Actor__Alternatives : ( ( ruleActor_Impl ) | ( ruleMaliciousActor ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:231:1: ( ( ruleActor_Impl ) | ( ruleMaliciousActor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSock.g:232:2: ( ruleActor_Impl )
                    {
                    // InternalSock.g:232:2: ( ruleActor_Impl )
                    // InternalSock.g:233:3: ruleActor_Impl
                    {
                     before(grammarAccess.getActorAccess().getActor_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor_Impl();

                    state._fsp--;

                     after(grammarAccess.getActorAccess().getActor_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSock.g:238:2: ( ruleMaliciousActor )
                    {
                    // InternalSock.g:238:2: ( ruleMaliciousActor )
                    // InternalSock.g:239:3: ruleMaliciousActor
                    {
                     before(grammarAccess.getActorAccess().getMaliciousActorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMaliciousActor();

                    state._fsp--;

                     after(grammarAccess.getActorAccess().getMaliciousActorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSock.g:248:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:252:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSock.g:253:2: ( RULE_STRING )
                    {
                    // InternalSock.g:253:2: ( RULE_STRING )
                    // InternalSock.g:254:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSock.g:259:2: ( RULE_ID )
                    {
                    // InternalSock.g:259:2: ( RULE_ID )
                    // InternalSock.g:260:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__IotSystem__Group__0"
    // InternalSock.g:269:1: rule__IotSystem__Group__0 : rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1 ;
    public final void rule__IotSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:273:1: ( rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1 )
            // InternalSock.g:274:2: rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IotSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__0"


    // $ANTLR start "rule__IotSystem__Group__0__Impl"
    // InternalSock.g:281:1: rule__IotSystem__Group__0__Impl : ( () ) ;
    public final void rule__IotSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:285:1: ( ( () ) )
            // InternalSock.g:286:1: ( () )
            {
            // InternalSock.g:286:1: ( () )
            // InternalSock.g:287:2: ()
            {
             before(grammarAccess.getIotSystemAccess().getIotSystemAction_0()); 
            // InternalSock.g:288:2: ()
            // InternalSock.g:288:3: 
            {
            }

             after(grammarAccess.getIotSystemAccess().getIotSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__0__Impl"


    // $ANTLR start "rule__IotSystem__Group__1"
    // InternalSock.g:296:1: rule__IotSystem__Group__1 : rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2 ;
    public final void rule__IotSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:300:1: ( rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2 )
            // InternalSock.g:301:2: rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IotSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__1"


    // $ANTLR start "rule__IotSystem__Group__1__Impl"
    // InternalSock.g:308:1: rule__IotSystem__Group__1__Impl : ( 'IotSystem' ) ;
    public final void rule__IotSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:312:1: ( ( 'IotSystem' ) )
            // InternalSock.g:313:1: ( 'IotSystem' )
            {
            // InternalSock.g:313:1: ( 'IotSystem' )
            // InternalSock.g:314:2: 'IotSystem'
            {
             before(grammarAccess.getIotSystemAccess().getIotSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getIotSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__1__Impl"


    // $ANTLR start "rule__IotSystem__Group__2"
    // InternalSock.g:323:1: rule__IotSystem__Group__2 : rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3 ;
    public final void rule__IotSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:327:1: ( rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3 )
            // InternalSock.g:328:2: rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IotSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__2"


    // $ANTLR start "rule__IotSystem__Group__2__Impl"
    // InternalSock.g:335:1: rule__IotSystem__Group__2__Impl : ( ( rule__IotSystem__NameAssignment_2 ) ) ;
    public final void rule__IotSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:339:1: ( ( ( rule__IotSystem__NameAssignment_2 ) ) )
            // InternalSock.g:340:1: ( ( rule__IotSystem__NameAssignment_2 ) )
            {
            // InternalSock.g:340:1: ( ( rule__IotSystem__NameAssignment_2 ) )
            // InternalSock.g:341:2: ( rule__IotSystem__NameAssignment_2 )
            {
             before(grammarAccess.getIotSystemAccess().getNameAssignment_2()); 
            // InternalSock.g:342:2: ( rule__IotSystem__NameAssignment_2 )
            // InternalSock.g:342:3: rule__IotSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__2__Impl"


    // $ANTLR start "rule__IotSystem__Group__3"
    // InternalSock.g:350:1: rule__IotSystem__Group__3 : rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4 ;
    public final void rule__IotSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:354:1: ( rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4 )
            // InternalSock.g:355:2: rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__IotSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__3"


    // $ANTLR start "rule__IotSystem__Group__3__Impl"
    // InternalSock.g:362:1: rule__IotSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:366:1: ( ( '{' ) )
            // InternalSock.g:367:1: ( '{' )
            {
            // InternalSock.g:367:1: ( '{' )
            // InternalSock.g:368:2: '{'
            {
             before(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__3__Impl"


    // $ANTLR start "rule__IotSystem__Group__4"
    // InternalSock.g:377:1: rule__IotSystem__Group__4 : rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5 ;
    public final void rule__IotSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:381:1: ( rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5 )
            // InternalSock.g:382:2: rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__IotSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__4"


    // $ANTLR start "rule__IotSystem__Group__4__Impl"
    // InternalSock.g:389:1: rule__IotSystem__Group__4__Impl : ( ( rule__IotSystem__Group_4__0 )? ) ;
    public final void rule__IotSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:393:1: ( ( ( rule__IotSystem__Group_4__0 )? ) )
            // InternalSock.g:394:1: ( ( rule__IotSystem__Group_4__0 )? )
            {
            // InternalSock.g:394:1: ( ( rule__IotSystem__Group_4__0 )? )
            // InternalSock.g:395:2: ( rule__IotSystem__Group_4__0 )?
            {
             before(grammarAccess.getIotSystemAccess().getGroup_4()); 
            // InternalSock.g:396:2: ( rule__IotSystem__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSock.g:396:3: rule__IotSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IotSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIotSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__4__Impl"


    // $ANTLR start "rule__IotSystem__Group__5"
    // InternalSock.g:404:1: rule__IotSystem__Group__5 : rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6 ;
    public final void rule__IotSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:408:1: ( rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6 )
            // InternalSock.g:409:2: rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__IotSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__5"


    // $ANTLR start "rule__IotSystem__Group__5__Impl"
    // InternalSock.g:416:1: rule__IotSystem__Group__5__Impl : ( ( rule__IotSystem__Group_5__0 )? ) ;
    public final void rule__IotSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:420:1: ( ( ( rule__IotSystem__Group_5__0 )? ) )
            // InternalSock.g:421:1: ( ( rule__IotSystem__Group_5__0 )? )
            {
            // InternalSock.g:421:1: ( ( rule__IotSystem__Group_5__0 )? )
            // InternalSock.g:422:2: ( rule__IotSystem__Group_5__0 )?
            {
             before(grammarAccess.getIotSystemAccess().getGroup_5()); 
            // InternalSock.g:423:2: ( rule__IotSystem__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSock.g:423:3: rule__IotSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IotSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIotSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__5__Impl"


    // $ANTLR start "rule__IotSystem__Group__6"
    // InternalSock.g:431:1: rule__IotSystem__Group__6 : rule__IotSystem__Group__6__Impl ;
    public final void rule__IotSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:435:1: ( rule__IotSystem__Group__6__Impl )
            // InternalSock.g:436:2: rule__IotSystem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__6"


    // $ANTLR start "rule__IotSystem__Group__6__Impl"
    // InternalSock.g:442:1: rule__IotSystem__Group__6__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:446:1: ( ( '}' ) )
            // InternalSock.g:447:1: ( '}' )
            {
            // InternalSock.g:447:1: ( '}' )
            // InternalSock.g:448:2: '}'
            {
             before(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group__6__Impl"


    // $ANTLR start "rule__IotSystem__Group_4__0"
    // InternalSock.g:458:1: rule__IotSystem__Group_4__0 : rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1 ;
    public final void rule__IotSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:462:1: ( rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1 )
            // InternalSock.g:463:2: rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__IotSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__0"


    // $ANTLR start "rule__IotSystem__Group_4__0__Impl"
    // InternalSock.g:470:1: rule__IotSystem__Group_4__0__Impl : ( 'ownedActor' ) ;
    public final void rule__IotSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:474:1: ( ( 'ownedActor' ) )
            // InternalSock.g:475:1: ( 'ownedActor' )
            {
            // InternalSock.g:475:1: ( 'ownedActor' )
            // InternalSock.g:476:2: 'ownedActor'
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getOwnedActorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__0__Impl"


    // $ANTLR start "rule__IotSystem__Group_4__1"
    // InternalSock.g:485:1: rule__IotSystem__Group_4__1 : rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2 ;
    public final void rule__IotSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:489:1: ( rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2 )
            // InternalSock.g:490:2: rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__IotSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__1"


    // $ANTLR start "rule__IotSystem__Group_4__1__Impl"
    // InternalSock.g:497:1: rule__IotSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:501:1: ( ( '{' ) )
            // InternalSock.g:502:1: ( '{' )
            {
            // InternalSock.g:502:1: ( '{' )
            // InternalSock.g:503:2: '{'
            {
             before(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__1__Impl"


    // $ANTLR start "rule__IotSystem__Group_4__2"
    // InternalSock.g:512:1: rule__IotSystem__Group_4__2 : rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3 ;
    public final void rule__IotSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:516:1: ( rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3 )
            // InternalSock.g:517:2: rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__IotSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__2"


    // $ANTLR start "rule__IotSystem__Group_4__2__Impl"
    // InternalSock.g:524:1: rule__IotSystem__Group_4__2__Impl : ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) ) ;
    public final void rule__IotSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:528:1: ( ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) ) )
            // InternalSock.g:529:1: ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) )
            {
            // InternalSock.g:529:1: ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) )
            // InternalSock.g:530:2: ( rule__IotSystem__OwnedActorAssignment_4_2 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_2()); 
            // InternalSock.g:531:2: ( rule__IotSystem__OwnedActorAssignment_4_2 )
            // InternalSock.g:531:3: rule__IotSystem__OwnedActorAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__OwnedActorAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__2__Impl"


    // $ANTLR start "rule__IotSystem__Group_4__3"
    // InternalSock.g:539:1: rule__IotSystem__Group_4__3 : rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4 ;
    public final void rule__IotSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:543:1: ( rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4 )
            // InternalSock.g:544:2: rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__IotSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__3"


    // $ANTLR start "rule__IotSystem__Group_4__3__Impl"
    // InternalSock.g:551:1: rule__IotSystem__Group_4__3__Impl : ( ( rule__IotSystem__Group_4_3__0 )* ) ;
    public final void rule__IotSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:555:1: ( ( ( rule__IotSystem__Group_4_3__0 )* ) )
            // InternalSock.g:556:1: ( ( rule__IotSystem__Group_4_3__0 )* )
            {
            // InternalSock.g:556:1: ( ( rule__IotSystem__Group_4_3__0 )* )
            // InternalSock.g:557:2: ( rule__IotSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getIotSystemAccess().getGroup_4_3()); 
            // InternalSock.g:558:2: ( rule__IotSystem__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSock.g:558:3: rule__IotSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__IotSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getIotSystemAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__3__Impl"


    // $ANTLR start "rule__IotSystem__Group_4__4"
    // InternalSock.g:566:1: rule__IotSystem__Group_4__4 : rule__IotSystem__Group_4__4__Impl ;
    public final void rule__IotSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:570:1: ( rule__IotSystem__Group_4__4__Impl )
            // InternalSock.g:571:2: rule__IotSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__4"


    // $ANTLR start "rule__IotSystem__Group_4__4__Impl"
    // InternalSock.g:577:1: rule__IotSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:581:1: ( ( '}' ) )
            // InternalSock.g:582:1: ( '}' )
            {
            // InternalSock.g:582:1: ( '}' )
            // InternalSock.g:583:2: '}'
            {
             before(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4__4__Impl"


    // $ANTLR start "rule__IotSystem__Group_4_3__0"
    // InternalSock.g:593:1: rule__IotSystem__Group_4_3__0 : rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1 ;
    public final void rule__IotSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:597:1: ( rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1 )
            // InternalSock.g:598:2: rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__IotSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4_3__0"


    // $ANTLR start "rule__IotSystem__Group_4_3__0__Impl"
    // InternalSock.g:605:1: rule__IotSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__IotSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:609:1: ( ( ',' ) )
            // InternalSock.g:610:1: ( ',' )
            {
            // InternalSock.g:610:1: ( ',' )
            // InternalSock.g:611:2: ','
            {
             before(grammarAccess.getIotSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__IotSystem__Group_4_3__1"
    // InternalSock.g:620:1: rule__IotSystem__Group_4_3__1 : rule__IotSystem__Group_4_3__1__Impl ;
    public final void rule__IotSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:624:1: ( rule__IotSystem__Group_4_3__1__Impl )
            // InternalSock.g:625:2: rule__IotSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4_3__1"


    // $ANTLR start "rule__IotSystem__Group_4_3__1__Impl"
    // InternalSock.g:631:1: rule__IotSystem__Group_4_3__1__Impl : ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) ) ;
    public final void rule__IotSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:635:1: ( ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) ) )
            // InternalSock.g:636:1: ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) )
            {
            // InternalSock.g:636:1: ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) )
            // InternalSock.g:637:2: ( rule__IotSystem__OwnedActorAssignment_4_3_1 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_3_1()); 
            // InternalSock.g:638:2: ( rule__IotSystem__OwnedActorAssignment_4_3_1 )
            // InternalSock.g:638:3: rule__IotSystem__OwnedActorAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__OwnedActorAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__IotSystem__Group_5__0"
    // InternalSock.g:647:1: rule__IotSystem__Group_5__0 : rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1 ;
    public final void rule__IotSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:651:1: ( rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1 )
            // InternalSock.g:652:2: rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__IotSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__0"


    // $ANTLR start "rule__IotSystem__Group_5__0__Impl"
    // InternalSock.g:659:1: rule__IotSystem__Group_5__0__Impl : ( 'ownedResource' ) ;
    public final void rule__IotSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:663:1: ( ( 'ownedResource' ) )
            // InternalSock.g:664:1: ( 'ownedResource' )
            {
            // InternalSock.g:664:1: ( 'ownedResource' )
            // InternalSock.g:665:2: 'ownedResource'
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getOwnedResourceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__0__Impl"


    // $ANTLR start "rule__IotSystem__Group_5__1"
    // InternalSock.g:674:1: rule__IotSystem__Group_5__1 : rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2 ;
    public final void rule__IotSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:678:1: ( rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2 )
            // InternalSock.g:679:2: rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__IotSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__1"


    // $ANTLR start "rule__IotSystem__Group_5__1__Impl"
    // InternalSock.g:686:1: rule__IotSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:690:1: ( ( '{' ) )
            // InternalSock.g:691:1: ( '{' )
            {
            // InternalSock.g:691:1: ( '{' )
            // InternalSock.g:692:2: '{'
            {
             before(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__1__Impl"


    // $ANTLR start "rule__IotSystem__Group_5__2"
    // InternalSock.g:701:1: rule__IotSystem__Group_5__2 : rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3 ;
    public final void rule__IotSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:705:1: ( rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3 )
            // InternalSock.g:706:2: rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__IotSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__2"


    // $ANTLR start "rule__IotSystem__Group_5__2__Impl"
    // InternalSock.g:713:1: rule__IotSystem__Group_5__2__Impl : ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) ) ;
    public final void rule__IotSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:717:1: ( ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) ) )
            // InternalSock.g:718:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) )
            {
            // InternalSock.g:718:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) )
            // InternalSock.g:719:2: ( rule__IotSystem__OwnedResourceAssignment_5_2 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_2()); 
            // InternalSock.g:720:2: ( rule__IotSystem__OwnedResourceAssignment_5_2 )
            // InternalSock.g:720:3: rule__IotSystem__OwnedResourceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__OwnedResourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__2__Impl"


    // $ANTLR start "rule__IotSystem__Group_5__3"
    // InternalSock.g:728:1: rule__IotSystem__Group_5__3 : rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4 ;
    public final void rule__IotSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:732:1: ( rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4 )
            // InternalSock.g:733:2: rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__IotSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__3"


    // $ANTLR start "rule__IotSystem__Group_5__3__Impl"
    // InternalSock.g:740:1: rule__IotSystem__Group_5__3__Impl : ( ( rule__IotSystem__Group_5_3__0 )* ) ;
    public final void rule__IotSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:744:1: ( ( ( rule__IotSystem__Group_5_3__0 )* ) )
            // InternalSock.g:745:1: ( ( rule__IotSystem__Group_5_3__0 )* )
            {
            // InternalSock.g:745:1: ( ( rule__IotSystem__Group_5_3__0 )* )
            // InternalSock.g:746:2: ( rule__IotSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getIotSystemAccess().getGroup_5_3()); 
            // InternalSock.g:747:2: ( rule__IotSystem__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSock.g:747:3: rule__IotSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__IotSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getIotSystemAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__3__Impl"


    // $ANTLR start "rule__IotSystem__Group_5__4"
    // InternalSock.g:755:1: rule__IotSystem__Group_5__4 : rule__IotSystem__Group_5__4__Impl ;
    public final void rule__IotSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:759:1: ( rule__IotSystem__Group_5__4__Impl )
            // InternalSock.g:760:2: rule__IotSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__4"


    // $ANTLR start "rule__IotSystem__Group_5__4__Impl"
    // InternalSock.g:766:1: rule__IotSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:770:1: ( ( '}' ) )
            // InternalSock.g:771:1: ( '}' )
            {
            // InternalSock.g:771:1: ( '}' )
            // InternalSock.g:772:2: '}'
            {
             before(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5__4__Impl"


    // $ANTLR start "rule__IotSystem__Group_5_3__0"
    // InternalSock.g:782:1: rule__IotSystem__Group_5_3__0 : rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1 ;
    public final void rule__IotSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:786:1: ( rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1 )
            // InternalSock.g:787:2: rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__IotSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5_3__0"


    // $ANTLR start "rule__IotSystem__Group_5_3__0__Impl"
    // InternalSock.g:794:1: rule__IotSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__IotSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:798:1: ( ( ',' ) )
            // InternalSock.g:799:1: ( ',' )
            {
            // InternalSock.g:799:1: ( ',' )
            // InternalSock.g:800:2: ','
            {
             before(grammarAccess.getIotSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIotSystemAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__IotSystem__Group_5_3__1"
    // InternalSock.g:809:1: rule__IotSystem__Group_5_3__1 : rule__IotSystem__Group_5_3__1__Impl ;
    public final void rule__IotSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:813:1: ( rule__IotSystem__Group_5_3__1__Impl )
            // InternalSock.g:814:2: rule__IotSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5_3__1"


    // $ANTLR start "rule__IotSystem__Group_5_3__1__Impl"
    // InternalSock.g:820:1: rule__IotSystem__Group_5_3__1__Impl : ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) ) ;
    public final void rule__IotSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:824:1: ( ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) ) )
            // InternalSock.g:825:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) )
            {
            // InternalSock.g:825:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) )
            // InternalSock.g:826:2: ( rule__IotSystem__OwnedResourceAssignment_5_3_1 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_3_1()); 
            // InternalSock.g:827:2: ( rule__IotSystem__OwnedResourceAssignment_5_3_1 )
            // InternalSock.g:827:3: rule__IotSystem__OwnedResourceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IotSystem__OwnedResourceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__0"
    // InternalSock.g:836:1: rule__Actor_Impl__Group__0 : rule__Actor_Impl__Group__0__Impl rule__Actor_Impl__Group__1 ;
    public final void rule__Actor_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:840:1: ( rule__Actor_Impl__Group__0__Impl rule__Actor_Impl__Group__1 )
            // InternalSock.g:841:2: rule__Actor_Impl__Group__0__Impl rule__Actor_Impl__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Actor_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__0"


    // $ANTLR start "rule__Actor_Impl__Group__0__Impl"
    // InternalSock.g:848:1: rule__Actor_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Actor_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:852:1: ( ( () ) )
            // InternalSock.g:853:1: ( () )
            {
            // InternalSock.g:853:1: ( () )
            // InternalSock.g:854:2: ()
            {
             before(grammarAccess.getActor_ImplAccess().getActorAction_0()); 
            // InternalSock.g:855:2: ()
            // InternalSock.g:855:3: 
            {
            }

             after(grammarAccess.getActor_ImplAccess().getActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__0__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__1"
    // InternalSock.g:863:1: rule__Actor_Impl__Group__1 : rule__Actor_Impl__Group__1__Impl rule__Actor_Impl__Group__2 ;
    public final void rule__Actor_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:867:1: ( rule__Actor_Impl__Group__1__Impl rule__Actor_Impl__Group__2 )
            // InternalSock.g:868:2: rule__Actor_Impl__Group__1__Impl rule__Actor_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Actor_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__1"


    // $ANTLR start "rule__Actor_Impl__Group__1__Impl"
    // InternalSock.g:875:1: rule__Actor_Impl__Group__1__Impl : ( 'Actor' ) ;
    public final void rule__Actor_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:879:1: ( ( 'Actor' ) )
            // InternalSock.g:880:1: ( 'Actor' )
            {
            // InternalSock.g:880:1: ( 'Actor' )
            // InternalSock.g:881:2: 'Actor'
            {
             before(grammarAccess.getActor_ImplAccess().getActorKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getActorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__1__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__2"
    // InternalSock.g:890:1: rule__Actor_Impl__Group__2 : rule__Actor_Impl__Group__2__Impl rule__Actor_Impl__Group__3 ;
    public final void rule__Actor_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:894:1: ( rule__Actor_Impl__Group__2__Impl rule__Actor_Impl__Group__3 )
            // InternalSock.g:895:2: rule__Actor_Impl__Group__2__Impl rule__Actor_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Actor_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__2"


    // $ANTLR start "rule__Actor_Impl__Group__2__Impl"
    // InternalSock.g:902:1: rule__Actor_Impl__Group__2__Impl : ( ( rule__Actor_Impl__NameAssignment_2 ) ) ;
    public final void rule__Actor_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:906:1: ( ( ( rule__Actor_Impl__NameAssignment_2 ) ) )
            // InternalSock.g:907:1: ( ( rule__Actor_Impl__NameAssignment_2 ) )
            {
            // InternalSock.g:907:1: ( ( rule__Actor_Impl__NameAssignment_2 ) )
            // InternalSock.g:908:2: ( rule__Actor_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getActor_ImplAccess().getNameAssignment_2()); 
            // InternalSock.g:909:2: ( rule__Actor_Impl__NameAssignment_2 )
            // InternalSock.g:909:3: rule__Actor_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__2__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__3"
    // InternalSock.g:917:1: rule__Actor_Impl__Group__3 : rule__Actor_Impl__Group__3__Impl rule__Actor_Impl__Group__4 ;
    public final void rule__Actor_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:921:1: ( rule__Actor_Impl__Group__3__Impl rule__Actor_Impl__Group__4 )
            // InternalSock.g:922:2: rule__Actor_Impl__Group__3__Impl rule__Actor_Impl__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Actor_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__3"


    // $ANTLR start "rule__Actor_Impl__Group__3__Impl"
    // InternalSock.g:929:1: rule__Actor_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Actor_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:933:1: ( ( '{' ) )
            // InternalSock.g:934:1: ( '{' )
            {
            // InternalSock.g:934:1: ( '{' )
            // InternalSock.g:935:2: '{'
            {
             before(grammarAccess.getActor_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__3__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__4"
    // InternalSock.g:944:1: rule__Actor_Impl__Group__4 : rule__Actor_Impl__Group__4__Impl rule__Actor_Impl__Group__5 ;
    public final void rule__Actor_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:948:1: ( rule__Actor_Impl__Group__4__Impl rule__Actor_Impl__Group__5 )
            // InternalSock.g:949:2: rule__Actor_Impl__Group__4__Impl rule__Actor_Impl__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Actor_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__4"


    // $ANTLR start "rule__Actor_Impl__Group__4__Impl"
    // InternalSock.g:956:1: rule__Actor_Impl__Group__4__Impl : ( ( rule__Actor_Impl__Group_4__0 )? ) ;
    public final void rule__Actor_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:960:1: ( ( ( rule__Actor_Impl__Group_4__0 )? ) )
            // InternalSock.g:961:1: ( ( rule__Actor_Impl__Group_4__0 )? )
            {
            // InternalSock.g:961:1: ( ( rule__Actor_Impl__Group_4__0 )? )
            // InternalSock.g:962:2: ( rule__Actor_Impl__Group_4__0 )?
            {
             before(grammarAccess.getActor_ImplAccess().getGroup_4()); 
            // InternalSock.g:963:2: ( rule__Actor_Impl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSock.g:963:3: rule__Actor_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActor_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__4__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__5"
    // InternalSock.g:971:1: rule__Actor_Impl__Group__5 : rule__Actor_Impl__Group__5__Impl rule__Actor_Impl__Group__6 ;
    public final void rule__Actor_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:975:1: ( rule__Actor_Impl__Group__5__Impl rule__Actor_Impl__Group__6 )
            // InternalSock.g:976:2: rule__Actor_Impl__Group__5__Impl rule__Actor_Impl__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Actor_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__5"


    // $ANTLR start "rule__Actor_Impl__Group__5__Impl"
    // InternalSock.g:983:1: rule__Actor_Impl__Group__5__Impl : ( ( rule__Actor_Impl__Group_5__0 )? ) ;
    public final void rule__Actor_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:987:1: ( ( ( rule__Actor_Impl__Group_5__0 )? ) )
            // InternalSock.g:988:1: ( ( rule__Actor_Impl__Group_5__0 )? )
            {
            // InternalSock.g:988:1: ( ( rule__Actor_Impl__Group_5__0 )? )
            // InternalSock.g:989:2: ( rule__Actor_Impl__Group_5__0 )?
            {
             before(grammarAccess.getActor_ImplAccess().getGroup_5()); 
            // InternalSock.g:990:2: ( rule__Actor_Impl__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSock.g:990:3: rule__Actor_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActor_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__5__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__6"
    // InternalSock.g:998:1: rule__Actor_Impl__Group__6 : rule__Actor_Impl__Group__6__Impl rule__Actor_Impl__Group__7 ;
    public final void rule__Actor_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1002:1: ( rule__Actor_Impl__Group__6__Impl rule__Actor_Impl__Group__7 )
            // InternalSock.g:1003:2: rule__Actor_Impl__Group__6__Impl rule__Actor_Impl__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Actor_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__6"


    // $ANTLR start "rule__Actor_Impl__Group__6__Impl"
    // InternalSock.g:1010:1: rule__Actor_Impl__Group__6__Impl : ( ( rule__Actor_Impl__Group_6__0 )? ) ;
    public final void rule__Actor_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1014:1: ( ( ( rule__Actor_Impl__Group_6__0 )? ) )
            // InternalSock.g:1015:1: ( ( rule__Actor_Impl__Group_6__0 )? )
            {
            // InternalSock.g:1015:1: ( ( rule__Actor_Impl__Group_6__0 )? )
            // InternalSock.g:1016:2: ( rule__Actor_Impl__Group_6__0 )?
            {
             before(grammarAccess.getActor_ImplAccess().getGroup_6()); 
            // InternalSock.g:1017:2: ( rule__Actor_Impl__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSock.g:1017:3: rule__Actor_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActor_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__6__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__7"
    // InternalSock.g:1025:1: rule__Actor_Impl__Group__7 : rule__Actor_Impl__Group__7__Impl rule__Actor_Impl__Group__8 ;
    public final void rule__Actor_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1029:1: ( rule__Actor_Impl__Group__7__Impl rule__Actor_Impl__Group__8 )
            // InternalSock.g:1030:2: rule__Actor_Impl__Group__7__Impl rule__Actor_Impl__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Actor_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__7"


    // $ANTLR start "rule__Actor_Impl__Group__7__Impl"
    // InternalSock.g:1037:1: rule__Actor_Impl__Group__7__Impl : ( ( rule__Actor_Impl__Group_7__0 )? ) ;
    public final void rule__Actor_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1041:1: ( ( ( rule__Actor_Impl__Group_7__0 )? ) )
            // InternalSock.g:1042:1: ( ( rule__Actor_Impl__Group_7__0 )? )
            {
            // InternalSock.g:1042:1: ( ( rule__Actor_Impl__Group_7__0 )? )
            // InternalSock.g:1043:2: ( rule__Actor_Impl__Group_7__0 )?
            {
             before(grammarAccess.getActor_ImplAccess().getGroup_7()); 
            // InternalSock.g:1044:2: ( rule__Actor_Impl__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSock.g:1044:3: rule__Actor_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActor_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__7__Impl"


    // $ANTLR start "rule__Actor_Impl__Group__8"
    // InternalSock.g:1052:1: rule__Actor_Impl__Group__8 : rule__Actor_Impl__Group__8__Impl ;
    public final void rule__Actor_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1056:1: ( rule__Actor_Impl__Group__8__Impl )
            // InternalSock.g:1057:2: rule__Actor_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__8"


    // $ANTLR start "rule__Actor_Impl__Group__8__Impl"
    // InternalSock.g:1063:1: rule__Actor_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Actor_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1067:1: ( ( '}' ) )
            // InternalSock.g:1068:1: ( '}' )
            {
            // InternalSock.g:1068:1: ( '}' )
            // InternalSock.g:1069:2: '}'
            {
             before(grammarAccess.getActor_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group__8__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_4__0"
    // InternalSock.g:1079:1: rule__Actor_Impl__Group_4__0 : rule__Actor_Impl__Group_4__0__Impl rule__Actor_Impl__Group_4__1 ;
    public final void rule__Actor_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1083:1: ( rule__Actor_Impl__Group_4__0__Impl rule__Actor_Impl__Group_4__1 )
            // InternalSock.g:1084:2: rule__Actor_Impl__Group_4__0__Impl rule__Actor_Impl__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Actor_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_4__0"


    // $ANTLR start "rule__Actor_Impl__Group_4__0__Impl"
    // InternalSock.g:1091:1: rule__Actor_Impl__Group_4__0__Impl : ( 'isPriority' ) ;
    public final void rule__Actor_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1095:1: ( ( 'isPriority' ) )
            // InternalSock.g:1096:1: ( 'isPriority' )
            {
            // InternalSock.g:1096:1: ( 'isPriority' )
            // InternalSock.g:1097:2: 'isPriority'
            {
             before(grammarAccess.getActor_ImplAccess().getIsPriorityKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getIsPriorityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_4__1"
    // InternalSock.g:1106:1: rule__Actor_Impl__Group_4__1 : rule__Actor_Impl__Group_4__1__Impl ;
    public final void rule__Actor_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1110:1: ( rule__Actor_Impl__Group_4__1__Impl )
            // InternalSock.g:1111:2: rule__Actor_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_4__1"


    // $ANTLR start "rule__Actor_Impl__Group_4__1__Impl"
    // InternalSock.g:1117:1: rule__Actor_Impl__Group_4__1__Impl : ( ( rule__Actor_Impl__IsPriorityAssignment_4_1 ) ) ;
    public final void rule__Actor_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1121:1: ( ( ( rule__Actor_Impl__IsPriorityAssignment_4_1 ) ) )
            // InternalSock.g:1122:1: ( ( rule__Actor_Impl__IsPriorityAssignment_4_1 ) )
            {
            // InternalSock.g:1122:1: ( ( rule__Actor_Impl__IsPriorityAssignment_4_1 ) )
            // InternalSock.g:1123:2: ( rule__Actor_Impl__IsPriorityAssignment_4_1 )
            {
             before(grammarAccess.getActor_ImplAccess().getIsPriorityAssignment_4_1()); 
            // InternalSock.g:1124:2: ( rule__Actor_Impl__IsPriorityAssignment_4_1 )
            // InternalSock.g:1124:3: rule__Actor_Impl__IsPriorityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__IsPriorityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getIsPriorityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_5__0"
    // InternalSock.g:1133:1: rule__Actor_Impl__Group_5__0 : rule__Actor_Impl__Group_5__0__Impl rule__Actor_Impl__Group_5__1 ;
    public final void rule__Actor_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1137:1: ( rule__Actor_Impl__Group_5__0__Impl rule__Actor_Impl__Group_5__1 )
            // InternalSock.g:1138:2: rule__Actor_Impl__Group_5__0__Impl rule__Actor_Impl__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Actor_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_5__0"


    // $ANTLR start "rule__Actor_Impl__Group_5__0__Impl"
    // InternalSock.g:1145:1: rule__Actor_Impl__Group_5__0__Impl : ( 'processTime' ) ;
    public final void rule__Actor_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1149:1: ( ( 'processTime' ) )
            // InternalSock.g:1150:1: ( 'processTime' )
            {
            // InternalSock.g:1150:1: ( 'processTime' )
            // InternalSock.g:1151:2: 'processTime'
            {
             before(grammarAccess.getActor_ImplAccess().getProcessTimeKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getProcessTimeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_5__1"
    // InternalSock.g:1160:1: rule__Actor_Impl__Group_5__1 : rule__Actor_Impl__Group_5__1__Impl ;
    public final void rule__Actor_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1164:1: ( rule__Actor_Impl__Group_5__1__Impl )
            // InternalSock.g:1165:2: rule__Actor_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_5__1"


    // $ANTLR start "rule__Actor_Impl__Group_5__1__Impl"
    // InternalSock.g:1171:1: rule__Actor_Impl__Group_5__1__Impl : ( ( rule__Actor_Impl__ProcessTimeAssignment_5_1 ) ) ;
    public final void rule__Actor_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1175:1: ( ( ( rule__Actor_Impl__ProcessTimeAssignment_5_1 ) ) )
            // InternalSock.g:1176:1: ( ( rule__Actor_Impl__ProcessTimeAssignment_5_1 ) )
            {
            // InternalSock.g:1176:1: ( ( rule__Actor_Impl__ProcessTimeAssignment_5_1 ) )
            // InternalSock.g:1177:2: ( rule__Actor_Impl__ProcessTimeAssignment_5_1 )
            {
             before(grammarAccess.getActor_ImplAccess().getProcessTimeAssignment_5_1()); 
            // InternalSock.g:1178:2: ( rule__Actor_Impl__ProcessTimeAssignment_5_1 )
            // InternalSock.g:1178:3: rule__Actor_Impl__ProcessTimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__ProcessTimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getProcessTimeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_6__0"
    // InternalSock.g:1187:1: rule__Actor_Impl__Group_6__0 : rule__Actor_Impl__Group_6__0__Impl rule__Actor_Impl__Group_6__1 ;
    public final void rule__Actor_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1191:1: ( rule__Actor_Impl__Group_6__0__Impl rule__Actor_Impl__Group_6__1 )
            // InternalSock.g:1192:2: rule__Actor_Impl__Group_6__0__Impl rule__Actor_Impl__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Actor_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_6__0"


    // $ANTLR start "rule__Actor_Impl__Group_6__0__Impl"
    // InternalSock.g:1199:1: rule__Actor_Impl__Group_6__0__Impl : ( 'periodTime' ) ;
    public final void rule__Actor_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1203:1: ( ( 'periodTime' ) )
            // InternalSock.g:1204:1: ( 'periodTime' )
            {
            // InternalSock.g:1204:1: ( 'periodTime' )
            // InternalSock.g:1205:2: 'periodTime'
            {
             before(grammarAccess.getActor_ImplAccess().getPeriodTimeKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getPeriodTimeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_6__1"
    // InternalSock.g:1214:1: rule__Actor_Impl__Group_6__1 : rule__Actor_Impl__Group_6__1__Impl ;
    public final void rule__Actor_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1218:1: ( rule__Actor_Impl__Group_6__1__Impl )
            // InternalSock.g:1219:2: rule__Actor_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_6__1"


    // $ANTLR start "rule__Actor_Impl__Group_6__1__Impl"
    // InternalSock.g:1225:1: rule__Actor_Impl__Group_6__1__Impl : ( ( rule__Actor_Impl__PeriodTimeAssignment_6_1 ) ) ;
    public final void rule__Actor_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1229:1: ( ( ( rule__Actor_Impl__PeriodTimeAssignment_6_1 ) ) )
            // InternalSock.g:1230:1: ( ( rule__Actor_Impl__PeriodTimeAssignment_6_1 ) )
            {
            // InternalSock.g:1230:1: ( ( rule__Actor_Impl__PeriodTimeAssignment_6_1 ) )
            // InternalSock.g:1231:2: ( rule__Actor_Impl__PeriodTimeAssignment_6_1 )
            {
             before(grammarAccess.getActor_ImplAccess().getPeriodTimeAssignment_6_1()); 
            // InternalSock.g:1232:2: ( rule__Actor_Impl__PeriodTimeAssignment_6_1 )
            // InternalSock.g:1232:3: rule__Actor_Impl__PeriodTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__PeriodTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getPeriodTimeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_7__0"
    // InternalSock.g:1241:1: rule__Actor_Impl__Group_7__0 : rule__Actor_Impl__Group_7__0__Impl rule__Actor_Impl__Group_7__1 ;
    public final void rule__Actor_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1245:1: ( rule__Actor_Impl__Group_7__0__Impl rule__Actor_Impl__Group_7__1 )
            // InternalSock.g:1246:2: rule__Actor_Impl__Group_7__0__Impl rule__Actor_Impl__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Actor_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_7__0"


    // $ANTLR start "rule__Actor_Impl__Group_7__0__Impl"
    // InternalSock.g:1253:1: rule__Actor_Impl__Group_7__0__Impl : ( 'resource' ) ;
    public final void rule__Actor_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1257:1: ( ( 'resource' ) )
            // InternalSock.g:1258:1: ( 'resource' )
            {
            // InternalSock.g:1258:1: ( 'resource' )
            // InternalSock.g:1259:2: 'resource'
            {
             before(grammarAccess.getActor_ImplAccess().getResourceKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActor_ImplAccess().getResourceKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Actor_Impl__Group_7__1"
    // InternalSock.g:1268:1: rule__Actor_Impl__Group_7__1 : rule__Actor_Impl__Group_7__1__Impl ;
    public final void rule__Actor_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1272:1: ( rule__Actor_Impl__Group_7__1__Impl )
            // InternalSock.g:1273:2: rule__Actor_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_7__1"


    // $ANTLR start "rule__Actor_Impl__Group_7__1__Impl"
    // InternalSock.g:1279:1: rule__Actor_Impl__Group_7__1__Impl : ( ( rule__Actor_Impl__ResourceAssignment_7_1 ) ) ;
    public final void rule__Actor_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1283:1: ( ( ( rule__Actor_Impl__ResourceAssignment_7_1 ) ) )
            // InternalSock.g:1284:1: ( ( rule__Actor_Impl__ResourceAssignment_7_1 ) )
            {
            // InternalSock.g:1284:1: ( ( rule__Actor_Impl__ResourceAssignment_7_1 ) )
            // InternalSock.g:1285:2: ( rule__Actor_Impl__ResourceAssignment_7_1 )
            {
             before(grammarAccess.getActor_ImplAccess().getResourceAssignment_7_1()); 
            // InternalSock.g:1286:2: ( rule__Actor_Impl__ResourceAssignment_7_1 )
            // InternalSock.g:1286:3: rule__Actor_Impl__ResourceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor_Impl__ResourceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getActor_ImplAccess().getResourceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalSock.g:1295:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1299:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSock.g:1300:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalSock.g:1307:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1311:1: ( ( () ) )
            // InternalSock.g:1312:1: ( () )
            {
            // InternalSock.g:1312:1: ( () )
            // InternalSock.g:1313:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalSock.g:1314:2: ()
            // InternalSock.g:1314:3: 
            {
            }

             after(grammarAccess.getResourceAccess().getResourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalSock.g:1322:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1326:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSock.g:1327:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalSock.g:1334:1: rule__Resource__Group__1__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1338:1: ( ( 'Resource' ) )
            // InternalSock.g:1339:1: ( 'Resource' )
            {
            // InternalSock.g:1339:1: ( 'Resource' )
            // InternalSock.g:1340:2: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalSock.g:1349:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1353:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSock.g:1354:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalSock.g:1361:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__NameAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1365:1: ( ( ( rule__Resource__NameAssignment_2 ) ) )
            // InternalSock.g:1366:1: ( ( rule__Resource__NameAssignment_2 ) )
            {
            // InternalSock.g:1366:1: ( ( rule__Resource__NameAssignment_2 ) )
            // InternalSock.g:1367:2: ( rule__Resource__NameAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_2()); 
            // InternalSock.g:1368:2: ( rule__Resource__NameAssignment_2 )
            // InternalSock.g:1368:3: rule__Resource__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalSock.g:1376:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1380:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSock.g:1381:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalSock.g:1388:1: rule__Resource__Group__3__Impl : ( '{' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1392:1: ( ( '{' ) )
            // InternalSock.g:1393:1: ( '{' )
            {
            // InternalSock.g:1393:1: ( '{' )
            // InternalSock.g:1394:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalSock.g:1403:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1407:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSock.g:1408:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalSock.g:1415:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__Group_4__0 )? ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1419:1: ( ( ( rule__Resource__Group_4__0 )? ) )
            // InternalSock.g:1420:1: ( ( rule__Resource__Group_4__0 )? )
            {
            // InternalSock.g:1420:1: ( ( rule__Resource__Group_4__0 )? )
            // InternalSock.g:1421:2: ( rule__Resource__Group_4__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_4()); 
            // InternalSock.g:1422:2: ( rule__Resource__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSock.g:1422:3: rule__Resource__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalSock.g:1430:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1434:1: ( rule__Resource__Group__5__Impl )
            // InternalSock.g:1435:2: rule__Resource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalSock.g:1441:1: rule__Resource__Group__5__Impl : ( '}' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1445:1: ( ( '}' ) )
            // InternalSock.g:1446:1: ( '}' )
            {
            // InternalSock.g:1446:1: ( '}' )
            // InternalSock.g:1447:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group_4__0"
    // InternalSock.g:1457:1: rule__Resource__Group_4__0 : rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 ;
    public final void rule__Resource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1461:1: ( rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 )
            // InternalSock.g:1462:2: rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Resource__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__0"


    // $ANTLR start "rule__Resource__Group_4__0__Impl"
    // InternalSock.g:1469:1: rule__Resource__Group_4__0__Impl : ( 'actor' ) ;
    public final void rule__Resource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1473:1: ( ( 'actor' ) )
            // InternalSock.g:1474:1: ( 'actor' )
            {
            // InternalSock.g:1474:1: ( 'actor' )
            // InternalSock.g:1475:2: 'actor'
            {
             before(grammarAccess.getResourceAccess().getActorKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getActorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__0__Impl"


    // $ANTLR start "rule__Resource__Group_4__1"
    // InternalSock.g:1484:1: rule__Resource__Group_4__1 : rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2 ;
    public final void rule__Resource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1488:1: ( rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2 )
            // InternalSock.g:1489:2: rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__1"


    // $ANTLR start "rule__Resource__Group_4__1__Impl"
    // InternalSock.g:1496:1: rule__Resource__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Resource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1500:1: ( ( '(' ) )
            // InternalSock.g:1501:1: ( '(' )
            {
            // InternalSock.g:1501:1: ( '(' )
            // InternalSock.g:1502:2: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__1__Impl"


    // $ANTLR start "rule__Resource__Group_4__2"
    // InternalSock.g:1511:1: rule__Resource__Group_4__2 : rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3 ;
    public final void rule__Resource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1515:1: ( rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3 )
            // InternalSock.g:1516:2: rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Resource__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__2"


    // $ANTLR start "rule__Resource__Group_4__2__Impl"
    // InternalSock.g:1523:1: rule__Resource__Group_4__2__Impl : ( ( rule__Resource__ActorAssignment_4_2 ) ) ;
    public final void rule__Resource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1527:1: ( ( ( rule__Resource__ActorAssignment_4_2 ) ) )
            // InternalSock.g:1528:1: ( ( rule__Resource__ActorAssignment_4_2 ) )
            {
            // InternalSock.g:1528:1: ( ( rule__Resource__ActorAssignment_4_2 ) )
            // InternalSock.g:1529:2: ( rule__Resource__ActorAssignment_4_2 )
            {
             before(grammarAccess.getResourceAccess().getActorAssignment_4_2()); 
            // InternalSock.g:1530:2: ( rule__Resource__ActorAssignment_4_2 )
            // InternalSock.g:1530:3: rule__Resource__ActorAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ActorAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getActorAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__2__Impl"


    // $ANTLR start "rule__Resource__Group_4__3"
    // InternalSock.g:1538:1: rule__Resource__Group_4__3 : rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4 ;
    public final void rule__Resource__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1542:1: ( rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4 )
            // InternalSock.g:1543:2: rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Resource__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__3"


    // $ANTLR start "rule__Resource__Group_4__3__Impl"
    // InternalSock.g:1550:1: rule__Resource__Group_4__3__Impl : ( ( rule__Resource__Group_4_3__0 )* ) ;
    public final void rule__Resource__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1554:1: ( ( ( rule__Resource__Group_4_3__0 )* ) )
            // InternalSock.g:1555:1: ( ( rule__Resource__Group_4_3__0 )* )
            {
            // InternalSock.g:1555:1: ( ( rule__Resource__Group_4_3__0 )* )
            // InternalSock.g:1556:2: ( rule__Resource__Group_4_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_4_3()); 
            // InternalSock.g:1557:2: ( rule__Resource__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSock.g:1557:3: rule__Resource__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__3__Impl"


    // $ANTLR start "rule__Resource__Group_4__4"
    // InternalSock.g:1565:1: rule__Resource__Group_4__4 : rule__Resource__Group_4__4__Impl ;
    public final void rule__Resource__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1569:1: ( rule__Resource__Group_4__4__Impl )
            // InternalSock.g:1570:2: rule__Resource__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__4"


    // $ANTLR start "rule__Resource__Group_4__4__Impl"
    // InternalSock.g:1576:1: rule__Resource__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Resource__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1580:1: ( ( ')' ) )
            // InternalSock.g:1581:1: ( ')' )
            {
            // InternalSock.g:1581:1: ( ')' )
            // InternalSock.g:1582:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4__4__Impl"


    // $ANTLR start "rule__Resource__Group_4_3__0"
    // InternalSock.g:1592:1: rule__Resource__Group_4_3__0 : rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1 ;
    public final void rule__Resource__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1596:1: ( rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1 )
            // InternalSock.g:1597:2: rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4_3__0"


    // $ANTLR start "rule__Resource__Group_4_3__0__Impl"
    // InternalSock.g:1604:1: rule__Resource__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1608:1: ( ( ',' ) )
            // InternalSock.g:1609:1: ( ',' )
            {
            // InternalSock.g:1609:1: ( ',' )
            // InternalSock.g:1610:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_4_3__1"
    // InternalSock.g:1619:1: rule__Resource__Group_4_3__1 : rule__Resource__Group_4_3__1__Impl ;
    public final void rule__Resource__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1623:1: ( rule__Resource__Group_4_3__1__Impl )
            // InternalSock.g:1624:2: rule__Resource__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4_3__1"


    // $ANTLR start "rule__Resource__Group_4_3__1__Impl"
    // InternalSock.g:1630:1: rule__Resource__Group_4_3__1__Impl : ( ( rule__Resource__ActorAssignment_4_3_1 ) ) ;
    public final void rule__Resource__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1634:1: ( ( ( rule__Resource__ActorAssignment_4_3_1 ) ) )
            // InternalSock.g:1635:1: ( ( rule__Resource__ActorAssignment_4_3_1 ) )
            {
            // InternalSock.g:1635:1: ( ( rule__Resource__ActorAssignment_4_3_1 ) )
            // InternalSock.g:1636:2: ( rule__Resource__ActorAssignment_4_3_1 )
            {
             before(grammarAccess.getResourceAccess().getActorAssignment_4_3_1()); 
            // InternalSock.g:1637:2: ( rule__Resource__ActorAssignment_4_3_1 )
            // InternalSock.g:1637:3: rule__Resource__ActorAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ActorAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getActorAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_4_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSock.g:1646:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1650:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSock.g:1651:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSock.g:1658:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1662:1: ( ( ( '-' )? ) )
            // InternalSock.g:1663:1: ( ( '-' )? )
            {
            // InternalSock.g:1663:1: ( ( '-' )? )
            // InternalSock.g:1664:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSock.g:1665:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSock.g:1665:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSock.g:1673:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1677:1: ( rule__EInt__Group__1__Impl )
            // InternalSock.g:1678:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSock.g:1684:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1688:1: ( ( RULE_INT ) )
            // InternalSock.g:1689:1: ( RULE_INT )
            {
            // InternalSock.g:1689:1: ( RULE_INT )
            // InternalSock.g:1690:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__0"
    // InternalSock.g:1700:1: rule__MaliciousActor__Group__0 : rule__MaliciousActor__Group__0__Impl rule__MaliciousActor__Group__1 ;
    public final void rule__MaliciousActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1704:1: ( rule__MaliciousActor__Group__0__Impl rule__MaliciousActor__Group__1 )
            // InternalSock.g:1705:2: rule__MaliciousActor__Group__0__Impl rule__MaliciousActor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MaliciousActor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__0"


    // $ANTLR start "rule__MaliciousActor__Group__0__Impl"
    // InternalSock.g:1712:1: rule__MaliciousActor__Group__0__Impl : ( () ) ;
    public final void rule__MaliciousActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1716:1: ( ( () ) )
            // InternalSock.g:1717:1: ( () )
            {
            // InternalSock.g:1717:1: ( () )
            // InternalSock.g:1718:2: ()
            {
             before(grammarAccess.getMaliciousActorAccess().getMaliciousActorAction_0()); 
            // InternalSock.g:1719:2: ()
            // InternalSock.g:1719:3: 
            {
            }

             after(grammarAccess.getMaliciousActorAccess().getMaliciousActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__0__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__1"
    // InternalSock.g:1727:1: rule__MaliciousActor__Group__1 : rule__MaliciousActor__Group__1__Impl rule__MaliciousActor__Group__2 ;
    public final void rule__MaliciousActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1731:1: ( rule__MaliciousActor__Group__1__Impl rule__MaliciousActor__Group__2 )
            // InternalSock.g:1732:2: rule__MaliciousActor__Group__1__Impl rule__MaliciousActor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MaliciousActor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__1"


    // $ANTLR start "rule__MaliciousActor__Group__1__Impl"
    // InternalSock.g:1739:1: rule__MaliciousActor__Group__1__Impl : ( 'MaliciousActor' ) ;
    public final void rule__MaliciousActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1743:1: ( ( 'MaliciousActor' ) )
            // InternalSock.g:1744:1: ( 'MaliciousActor' )
            {
            // InternalSock.g:1744:1: ( 'MaliciousActor' )
            // InternalSock.g:1745:2: 'MaliciousActor'
            {
             before(grammarAccess.getMaliciousActorAccess().getMaliciousActorKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getMaliciousActorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__1__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__2"
    // InternalSock.g:1754:1: rule__MaliciousActor__Group__2 : rule__MaliciousActor__Group__2__Impl rule__MaliciousActor__Group__3 ;
    public final void rule__MaliciousActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1758:1: ( rule__MaliciousActor__Group__2__Impl rule__MaliciousActor__Group__3 )
            // InternalSock.g:1759:2: rule__MaliciousActor__Group__2__Impl rule__MaliciousActor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MaliciousActor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__2"


    // $ANTLR start "rule__MaliciousActor__Group__2__Impl"
    // InternalSock.g:1766:1: rule__MaliciousActor__Group__2__Impl : ( ( rule__MaliciousActor__NameAssignment_2 ) ) ;
    public final void rule__MaliciousActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1770:1: ( ( ( rule__MaliciousActor__NameAssignment_2 ) ) )
            // InternalSock.g:1771:1: ( ( rule__MaliciousActor__NameAssignment_2 ) )
            {
            // InternalSock.g:1771:1: ( ( rule__MaliciousActor__NameAssignment_2 ) )
            // InternalSock.g:1772:2: ( rule__MaliciousActor__NameAssignment_2 )
            {
             before(grammarAccess.getMaliciousActorAccess().getNameAssignment_2()); 
            // InternalSock.g:1773:2: ( rule__MaliciousActor__NameAssignment_2 )
            // InternalSock.g:1773:3: rule__MaliciousActor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__2__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__3"
    // InternalSock.g:1781:1: rule__MaliciousActor__Group__3 : rule__MaliciousActor__Group__3__Impl rule__MaliciousActor__Group__4 ;
    public final void rule__MaliciousActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1785:1: ( rule__MaliciousActor__Group__3__Impl rule__MaliciousActor__Group__4 )
            // InternalSock.g:1786:2: rule__MaliciousActor__Group__3__Impl rule__MaliciousActor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MaliciousActor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__3"


    // $ANTLR start "rule__MaliciousActor__Group__3__Impl"
    // InternalSock.g:1793:1: rule__MaliciousActor__Group__3__Impl : ( '{' ) ;
    public final void rule__MaliciousActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1797:1: ( ( '{' ) )
            // InternalSock.g:1798:1: ( '{' )
            {
            // InternalSock.g:1798:1: ( '{' )
            // InternalSock.g:1799:2: '{'
            {
             before(grammarAccess.getMaliciousActorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__3__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__4"
    // InternalSock.g:1808:1: rule__MaliciousActor__Group__4 : rule__MaliciousActor__Group__4__Impl rule__MaliciousActor__Group__5 ;
    public final void rule__MaliciousActor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1812:1: ( rule__MaliciousActor__Group__4__Impl rule__MaliciousActor__Group__5 )
            // InternalSock.g:1813:2: rule__MaliciousActor__Group__4__Impl rule__MaliciousActor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__MaliciousActor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__4"


    // $ANTLR start "rule__MaliciousActor__Group__4__Impl"
    // InternalSock.g:1820:1: rule__MaliciousActor__Group__4__Impl : ( ( rule__MaliciousActor__Group_4__0 )? ) ;
    public final void rule__MaliciousActor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1824:1: ( ( ( rule__MaliciousActor__Group_4__0 )? ) )
            // InternalSock.g:1825:1: ( ( rule__MaliciousActor__Group_4__0 )? )
            {
            // InternalSock.g:1825:1: ( ( rule__MaliciousActor__Group_4__0 )? )
            // InternalSock.g:1826:2: ( rule__MaliciousActor__Group_4__0 )?
            {
             before(grammarAccess.getMaliciousActorAccess().getGroup_4()); 
            // InternalSock.g:1827:2: ( rule__MaliciousActor__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSock.g:1827:3: rule__MaliciousActor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaliciousActor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaliciousActorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__4__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__5"
    // InternalSock.g:1835:1: rule__MaliciousActor__Group__5 : rule__MaliciousActor__Group__5__Impl rule__MaliciousActor__Group__6 ;
    public final void rule__MaliciousActor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1839:1: ( rule__MaliciousActor__Group__5__Impl rule__MaliciousActor__Group__6 )
            // InternalSock.g:1840:2: rule__MaliciousActor__Group__5__Impl rule__MaliciousActor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MaliciousActor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__5"


    // $ANTLR start "rule__MaliciousActor__Group__5__Impl"
    // InternalSock.g:1847:1: rule__MaliciousActor__Group__5__Impl : ( ( rule__MaliciousActor__Group_5__0 )? ) ;
    public final void rule__MaliciousActor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1851:1: ( ( ( rule__MaliciousActor__Group_5__0 )? ) )
            // InternalSock.g:1852:1: ( ( rule__MaliciousActor__Group_5__0 )? )
            {
            // InternalSock.g:1852:1: ( ( rule__MaliciousActor__Group_5__0 )? )
            // InternalSock.g:1853:2: ( rule__MaliciousActor__Group_5__0 )?
            {
             before(grammarAccess.getMaliciousActorAccess().getGroup_5()); 
            // InternalSock.g:1854:2: ( rule__MaliciousActor__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSock.g:1854:3: rule__MaliciousActor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaliciousActor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaliciousActorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__5__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__6"
    // InternalSock.g:1862:1: rule__MaliciousActor__Group__6 : rule__MaliciousActor__Group__6__Impl rule__MaliciousActor__Group__7 ;
    public final void rule__MaliciousActor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1866:1: ( rule__MaliciousActor__Group__6__Impl rule__MaliciousActor__Group__7 )
            // InternalSock.g:1867:2: rule__MaliciousActor__Group__6__Impl rule__MaliciousActor__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__MaliciousActor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__6"


    // $ANTLR start "rule__MaliciousActor__Group__6__Impl"
    // InternalSock.g:1874:1: rule__MaliciousActor__Group__6__Impl : ( ( rule__MaliciousActor__Group_6__0 )? ) ;
    public final void rule__MaliciousActor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1878:1: ( ( ( rule__MaliciousActor__Group_6__0 )? ) )
            // InternalSock.g:1879:1: ( ( rule__MaliciousActor__Group_6__0 )? )
            {
            // InternalSock.g:1879:1: ( ( rule__MaliciousActor__Group_6__0 )? )
            // InternalSock.g:1880:2: ( rule__MaliciousActor__Group_6__0 )?
            {
             before(grammarAccess.getMaliciousActorAccess().getGroup_6()); 
            // InternalSock.g:1881:2: ( rule__MaliciousActor__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSock.g:1881:3: rule__MaliciousActor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaliciousActor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaliciousActorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__6__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__7"
    // InternalSock.g:1889:1: rule__MaliciousActor__Group__7 : rule__MaliciousActor__Group__7__Impl rule__MaliciousActor__Group__8 ;
    public final void rule__MaliciousActor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1893:1: ( rule__MaliciousActor__Group__7__Impl rule__MaliciousActor__Group__8 )
            // InternalSock.g:1894:2: rule__MaliciousActor__Group__7__Impl rule__MaliciousActor__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MaliciousActor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__7"


    // $ANTLR start "rule__MaliciousActor__Group__7__Impl"
    // InternalSock.g:1901:1: rule__MaliciousActor__Group__7__Impl : ( ( rule__MaliciousActor__Group_7__0 )? ) ;
    public final void rule__MaliciousActor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1905:1: ( ( ( rule__MaliciousActor__Group_7__0 )? ) )
            // InternalSock.g:1906:1: ( ( rule__MaliciousActor__Group_7__0 )? )
            {
            // InternalSock.g:1906:1: ( ( rule__MaliciousActor__Group_7__0 )? )
            // InternalSock.g:1907:2: ( rule__MaliciousActor__Group_7__0 )?
            {
             before(grammarAccess.getMaliciousActorAccess().getGroup_7()); 
            // InternalSock.g:1908:2: ( rule__MaliciousActor__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSock.g:1908:3: rule__MaliciousActor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaliciousActor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaliciousActorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__7__Impl"


    // $ANTLR start "rule__MaliciousActor__Group__8"
    // InternalSock.g:1916:1: rule__MaliciousActor__Group__8 : rule__MaliciousActor__Group__8__Impl ;
    public final void rule__MaliciousActor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1920:1: ( rule__MaliciousActor__Group__8__Impl )
            // InternalSock.g:1921:2: rule__MaliciousActor__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__8"


    // $ANTLR start "rule__MaliciousActor__Group__8__Impl"
    // InternalSock.g:1927:1: rule__MaliciousActor__Group__8__Impl : ( '}' ) ;
    public final void rule__MaliciousActor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1931:1: ( ( '}' ) )
            // InternalSock.g:1932:1: ( '}' )
            {
            // InternalSock.g:1932:1: ( '}' )
            // InternalSock.g:1933:2: '}'
            {
             before(grammarAccess.getMaliciousActorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group__8__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_4__0"
    // InternalSock.g:1943:1: rule__MaliciousActor__Group_4__0 : rule__MaliciousActor__Group_4__0__Impl rule__MaliciousActor__Group_4__1 ;
    public final void rule__MaliciousActor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1947:1: ( rule__MaliciousActor__Group_4__0__Impl rule__MaliciousActor__Group_4__1 )
            // InternalSock.g:1948:2: rule__MaliciousActor__Group_4__0__Impl rule__MaliciousActor__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__MaliciousActor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_4__0"


    // $ANTLR start "rule__MaliciousActor__Group_4__0__Impl"
    // InternalSock.g:1955:1: rule__MaliciousActor__Group_4__0__Impl : ( 'isPriority' ) ;
    public final void rule__MaliciousActor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1959:1: ( ( 'isPriority' ) )
            // InternalSock.g:1960:1: ( 'isPriority' )
            {
            // InternalSock.g:1960:1: ( 'isPriority' )
            // InternalSock.g:1961:2: 'isPriority'
            {
             before(grammarAccess.getMaliciousActorAccess().getIsPriorityKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getIsPriorityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_4__0__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_4__1"
    // InternalSock.g:1970:1: rule__MaliciousActor__Group_4__1 : rule__MaliciousActor__Group_4__1__Impl ;
    public final void rule__MaliciousActor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1974:1: ( rule__MaliciousActor__Group_4__1__Impl )
            // InternalSock.g:1975:2: rule__MaliciousActor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_4__1"


    // $ANTLR start "rule__MaliciousActor__Group_4__1__Impl"
    // InternalSock.g:1981:1: rule__MaliciousActor__Group_4__1__Impl : ( ( rule__MaliciousActor__IsPriorityAssignment_4_1 ) ) ;
    public final void rule__MaliciousActor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1985:1: ( ( ( rule__MaliciousActor__IsPriorityAssignment_4_1 ) ) )
            // InternalSock.g:1986:1: ( ( rule__MaliciousActor__IsPriorityAssignment_4_1 ) )
            {
            // InternalSock.g:1986:1: ( ( rule__MaliciousActor__IsPriorityAssignment_4_1 ) )
            // InternalSock.g:1987:2: ( rule__MaliciousActor__IsPriorityAssignment_4_1 )
            {
             before(grammarAccess.getMaliciousActorAccess().getIsPriorityAssignment_4_1()); 
            // InternalSock.g:1988:2: ( rule__MaliciousActor__IsPriorityAssignment_4_1 )
            // InternalSock.g:1988:3: rule__MaliciousActor__IsPriorityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__IsPriorityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getIsPriorityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_4__1__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_5__0"
    // InternalSock.g:1997:1: rule__MaliciousActor__Group_5__0 : rule__MaliciousActor__Group_5__0__Impl rule__MaliciousActor__Group_5__1 ;
    public final void rule__MaliciousActor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2001:1: ( rule__MaliciousActor__Group_5__0__Impl rule__MaliciousActor__Group_5__1 )
            // InternalSock.g:2002:2: rule__MaliciousActor__Group_5__0__Impl rule__MaliciousActor__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__MaliciousActor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_5__0"


    // $ANTLR start "rule__MaliciousActor__Group_5__0__Impl"
    // InternalSock.g:2009:1: rule__MaliciousActor__Group_5__0__Impl : ( 'processTime' ) ;
    public final void rule__MaliciousActor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2013:1: ( ( 'processTime' ) )
            // InternalSock.g:2014:1: ( 'processTime' )
            {
            // InternalSock.g:2014:1: ( 'processTime' )
            // InternalSock.g:2015:2: 'processTime'
            {
             before(grammarAccess.getMaliciousActorAccess().getProcessTimeKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getProcessTimeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_5__0__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_5__1"
    // InternalSock.g:2024:1: rule__MaliciousActor__Group_5__1 : rule__MaliciousActor__Group_5__1__Impl ;
    public final void rule__MaliciousActor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2028:1: ( rule__MaliciousActor__Group_5__1__Impl )
            // InternalSock.g:2029:2: rule__MaliciousActor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_5__1"


    // $ANTLR start "rule__MaliciousActor__Group_5__1__Impl"
    // InternalSock.g:2035:1: rule__MaliciousActor__Group_5__1__Impl : ( ( rule__MaliciousActor__ProcessTimeAssignment_5_1 ) ) ;
    public final void rule__MaliciousActor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2039:1: ( ( ( rule__MaliciousActor__ProcessTimeAssignment_5_1 ) ) )
            // InternalSock.g:2040:1: ( ( rule__MaliciousActor__ProcessTimeAssignment_5_1 ) )
            {
            // InternalSock.g:2040:1: ( ( rule__MaliciousActor__ProcessTimeAssignment_5_1 ) )
            // InternalSock.g:2041:2: ( rule__MaliciousActor__ProcessTimeAssignment_5_1 )
            {
             before(grammarAccess.getMaliciousActorAccess().getProcessTimeAssignment_5_1()); 
            // InternalSock.g:2042:2: ( rule__MaliciousActor__ProcessTimeAssignment_5_1 )
            // InternalSock.g:2042:3: rule__MaliciousActor__ProcessTimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__ProcessTimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getProcessTimeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_5__1__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_6__0"
    // InternalSock.g:2051:1: rule__MaliciousActor__Group_6__0 : rule__MaliciousActor__Group_6__0__Impl rule__MaliciousActor__Group_6__1 ;
    public final void rule__MaliciousActor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2055:1: ( rule__MaliciousActor__Group_6__0__Impl rule__MaliciousActor__Group_6__1 )
            // InternalSock.g:2056:2: rule__MaliciousActor__Group_6__0__Impl rule__MaliciousActor__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__MaliciousActor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_6__0"


    // $ANTLR start "rule__MaliciousActor__Group_6__0__Impl"
    // InternalSock.g:2063:1: rule__MaliciousActor__Group_6__0__Impl : ( 'periodTime' ) ;
    public final void rule__MaliciousActor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2067:1: ( ( 'periodTime' ) )
            // InternalSock.g:2068:1: ( 'periodTime' )
            {
            // InternalSock.g:2068:1: ( 'periodTime' )
            // InternalSock.g:2069:2: 'periodTime'
            {
             before(grammarAccess.getMaliciousActorAccess().getPeriodTimeKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getPeriodTimeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_6__0__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_6__1"
    // InternalSock.g:2078:1: rule__MaliciousActor__Group_6__1 : rule__MaliciousActor__Group_6__1__Impl ;
    public final void rule__MaliciousActor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2082:1: ( rule__MaliciousActor__Group_6__1__Impl )
            // InternalSock.g:2083:2: rule__MaliciousActor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_6__1"


    // $ANTLR start "rule__MaliciousActor__Group_6__1__Impl"
    // InternalSock.g:2089:1: rule__MaliciousActor__Group_6__1__Impl : ( ( rule__MaliciousActor__PeriodTimeAssignment_6_1 ) ) ;
    public final void rule__MaliciousActor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2093:1: ( ( ( rule__MaliciousActor__PeriodTimeAssignment_6_1 ) ) )
            // InternalSock.g:2094:1: ( ( rule__MaliciousActor__PeriodTimeAssignment_6_1 ) )
            {
            // InternalSock.g:2094:1: ( ( rule__MaliciousActor__PeriodTimeAssignment_6_1 ) )
            // InternalSock.g:2095:2: ( rule__MaliciousActor__PeriodTimeAssignment_6_1 )
            {
             before(grammarAccess.getMaliciousActorAccess().getPeriodTimeAssignment_6_1()); 
            // InternalSock.g:2096:2: ( rule__MaliciousActor__PeriodTimeAssignment_6_1 )
            // InternalSock.g:2096:3: rule__MaliciousActor__PeriodTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__PeriodTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getPeriodTimeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_6__1__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_7__0"
    // InternalSock.g:2105:1: rule__MaliciousActor__Group_7__0 : rule__MaliciousActor__Group_7__0__Impl rule__MaliciousActor__Group_7__1 ;
    public final void rule__MaliciousActor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2109:1: ( rule__MaliciousActor__Group_7__0__Impl rule__MaliciousActor__Group_7__1 )
            // InternalSock.g:2110:2: rule__MaliciousActor__Group_7__0__Impl rule__MaliciousActor__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__MaliciousActor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_7__0"


    // $ANTLR start "rule__MaliciousActor__Group_7__0__Impl"
    // InternalSock.g:2117:1: rule__MaliciousActor__Group_7__0__Impl : ( 'resource' ) ;
    public final void rule__MaliciousActor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2121:1: ( ( 'resource' ) )
            // InternalSock.g:2122:1: ( 'resource' )
            {
            // InternalSock.g:2122:1: ( 'resource' )
            // InternalSock.g:2123:2: 'resource'
            {
             before(grammarAccess.getMaliciousActorAccess().getResourceKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMaliciousActorAccess().getResourceKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_7__0__Impl"


    // $ANTLR start "rule__MaliciousActor__Group_7__1"
    // InternalSock.g:2132:1: rule__MaliciousActor__Group_7__1 : rule__MaliciousActor__Group_7__1__Impl ;
    public final void rule__MaliciousActor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2136:1: ( rule__MaliciousActor__Group_7__1__Impl )
            // InternalSock.g:2137:2: rule__MaliciousActor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_7__1"


    // $ANTLR start "rule__MaliciousActor__Group_7__1__Impl"
    // InternalSock.g:2143:1: rule__MaliciousActor__Group_7__1__Impl : ( ( rule__MaliciousActor__ResourceAssignment_7_1 ) ) ;
    public final void rule__MaliciousActor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2147:1: ( ( ( rule__MaliciousActor__ResourceAssignment_7_1 ) ) )
            // InternalSock.g:2148:1: ( ( rule__MaliciousActor__ResourceAssignment_7_1 ) )
            {
            // InternalSock.g:2148:1: ( ( rule__MaliciousActor__ResourceAssignment_7_1 ) )
            // InternalSock.g:2149:2: ( rule__MaliciousActor__ResourceAssignment_7_1 )
            {
             before(grammarAccess.getMaliciousActorAccess().getResourceAssignment_7_1()); 
            // InternalSock.g:2150:2: ( rule__MaliciousActor__ResourceAssignment_7_1 )
            // InternalSock.g:2150:3: rule__MaliciousActor__ResourceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MaliciousActor__ResourceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousActorAccess().getResourceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__Group_7__1__Impl"


    // $ANTLR start "rule__IotSystem__NameAssignment_2"
    // InternalSock.g:2159:1: rule__IotSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IotSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2163:1: ( ( ruleEString ) )
            // InternalSock.g:2164:2: ( ruleEString )
            {
            // InternalSock.g:2164:2: ( ruleEString )
            // InternalSock.g:2165:3: ruleEString
            {
             before(grammarAccess.getIotSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIotSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__NameAssignment_2"


    // $ANTLR start "rule__IotSystem__OwnedActorAssignment_4_2"
    // InternalSock.g:2174:1: rule__IotSystem__OwnedActorAssignment_4_2 : ( ruleActor ) ;
    public final void rule__IotSystem__OwnedActorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2178:1: ( ( ruleActor ) )
            // InternalSock.g:2179:2: ( ruleActor )
            {
            // InternalSock.g:2179:2: ( ruleActor )
            // InternalSock.g:2180:3: ruleActor
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__OwnedActorAssignment_4_2"


    // $ANTLR start "rule__IotSystem__OwnedActorAssignment_4_3_1"
    // InternalSock.g:2189:1: rule__IotSystem__OwnedActorAssignment_4_3_1 : ( ruleActor ) ;
    public final void rule__IotSystem__OwnedActorAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2193:1: ( ( ruleActor ) )
            // InternalSock.g:2194:2: ( ruleActor )
            {
            // InternalSock.g:2194:2: ( ruleActor )
            // InternalSock.g:2195:3: ruleActor
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getIotSystemAccess().getOwnedActorActorParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__OwnedActorAssignment_4_3_1"


    // $ANTLR start "rule__IotSystem__OwnedResourceAssignment_5_2"
    // InternalSock.g:2204:1: rule__IotSystem__OwnedResourceAssignment_5_2 : ( ruleResource ) ;
    public final void rule__IotSystem__OwnedResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2208:1: ( ( ruleResource ) )
            // InternalSock.g:2209:2: ( ruleResource )
            {
            // InternalSock.g:2209:2: ( ruleResource )
            // InternalSock.g:2210:3: ruleResource
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__OwnedResourceAssignment_5_2"


    // $ANTLR start "rule__IotSystem__OwnedResourceAssignment_5_3_1"
    // InternalSock.g:2219:1: rule__IotSystem__OwnedResourceAssignment_5_3_1 : ( ruleResource ) ;
    public final void rule__IotSystem__OwnedResourceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2223:1: ( ( ruleResource ) )
            // InternalSock.g:2224:2: ( ruleResource )
            {
            // InternalSock.g:2224:2: ( ruleResource )
            // InternalSock.g:2225:3: ruleResource
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getIotSystemAccess().getOwnedResourceResourceParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IotSystem__OwnedResourceAssignment_5_3_1"


    // $ANTLR start "rule__Actor_Impl__NameAssignment_2"
    // InternalSock.g:2234:1: rule__Actor_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Actor_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2238:1: ( ( ruleEString ) )
            // InternalSock.g:2239:2: ( ruleEString )
            {
            // InternalSock.g:2239:2: ( ruleEString )
            // InternalSock.g:2240:3: ruleEString
            {
             before(grammarAccess.getActor_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActor_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__NameAssignment_2"


    // $ANTLR start "rule__Actor_Impl__IsPriorityAssignment_4_1"
    // InternalSock.g:2249:1: rule__Actor_Impl__IsPriorityAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Actor_Impl__IsPriorityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2253:1: ( ( ruleEInt ) )
            // InternalSock.g:2254:2: ( ruleEInt )
            {
            // InternalSock.g:2254:2: ( ruleEInt )
            // InternalSock.g:2255:3: ruleEInt
            {
             before(grammarAccess.getActor_ImplAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActor_ImplAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__IsPriorityAssignment_4_1"


    // $ANTLR start "rule__Actor_Impl__ProcessTimeAssignment_5_1"
    // InternalSock.g:2264:1: rule__Actor_Impl__ProcessTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Actor_Impl__ProcessTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2268:1: ( ( ruleEInt ) )
            // InternalSock.g:2269:2: ( ruleEInt )
            {
            // InternalSock.g:2269:2: ( ruleEInt )
            // InternalSock.g:2270:3: ruleEInt
            {
             before(grammarAccess.getActor_ImplAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActor_ImplAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__ProcessTimeAssignment_5_1"


    // $ANTLR start "rule__Actor_Impl__PeriodTimeAssignment_6_1"
    // InternalSock.g:2279:1: rule__Actor_Impl__PeriodTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Actor_Impl__PeriodTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2283:1: ( ( ruleEInt ) )
            // InternalSock.g:2284:2: ( ruleEInt )
            {
            // InternalSock.g:2284:2: ( ruleEInt )
            // InternalSock.g:2285:3: ruleEInt
            {
             before(grammarAccess.getActor_ImplAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActor_ImplAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__PeriodTimeAssignment_6_1"


    // $ANTLR start "rule__Actor_Impl__ResourceAssignment_7_1"
    // InternalSock.g:2294:1: rule__Actor_Impl__ResourceAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Actor_Impl__ResourceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2298:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:2299:2: ( ( ruleEString ) )
            {
            // InternalSock.g:2299:2: ( ( ruleEString ) )
            // InternalSock.g:2300:3: ( ruleEString )
            {
             before(grammarAccess.getActor_ImplAccess().getResourceResourceCrossReference_7_1_0()); 
            // InternalSock.g:2301:3: ( ruleEString )
            // InternalSock.g:2302:4: ruleEString
            {
             before(grammarAccess.getActor_ImplAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActor_ImplAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getActor_ImplAccess().getResourceResourceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor_Impl__ResourceAssignment_7_1"


    // $ANTLR start "rule__Resource__NameAssignment_2"
    // InternalSock.g:2313:1: rule__Resource__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2317:1: ( ( ruleEString ) )
            // InternalSock.g:2318:2: ( ruleEString )
            {
            // InternalSock.g:2318:2: ( ruleEString )
            // InternalSock.g:2319:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_2"


    // $ANTLR start "rule__Resource__ActorAssignment_4_2"
    // InternalSock.g:2328:1: rule__Resource__ActorAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ActorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2332:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:2333:2: ( ( ruleEString ) )
            {
            // InternalSock.g:2333:2: ( ( ruleEString ) )
            // InternalSock.g:2334:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getActorActorCrossReference_4_2_0()); 
            // InternalSock.g:2335:3: ( ruleEString )
            // InternalSock.g:2336:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getActorActorEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getActorActorEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getActorActorCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__ActorAssignment_4_2"


    // $ANTLR start "rule__Resource__ActorAssignment_4_3_1"
    // InternalSock.g:2347:1: rule__Resource__ActorAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ActorAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2351:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:2352:2: ( ( ruleEString ) )
            {
            // InternalSock.g:2352:2: ( ( ruleEString ) )
            // InternalSock.g:2353:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getActorActorCrossReference_4_3_1_0()); 
            // InternalSock.g:2354:3: ( ruleEString )
            // InternalSock.g:2355:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getActorActorEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getActorActorEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getActorActorCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__ActorAssignment_4_3_1"


    // $ANTLR start "rule__MaliciousActor__NameAssignment_2"
    // InternalSock.g:2366:1: rule__MaliciousActor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MaliciousActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2370:1: ( ( ruleEString ) )
            // InternalSock.g:2371:2: ( ruleEString )
            {
            // InternalSock.g:2371:2: ( ruleEString )
            // InternalSock.g:2372:3: ruleEString
            {
             before(grammarAccess.getMaliciousActorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMaliciousActorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__NameAssignment_2"


    // $ANTLR start "rule__MaliciousActor__IsPriorityAssignment_4_1"
    // InternalSock.g:2381:1: rule__MaliciousActor__IsPriorityAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__MaliciousActor__IsPriorityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2385:1: ( ( ruleEInt ) )
            // InternalSock.g:2386:2: ( ruleEInt )
            {
            // InternalSock.g:2386:2: ( ruleEInt )
            // InternalSock.g:2387:3: ruleEInt
            {
             before(grammarAccess.getMaliciousActorAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMaliciousActorAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__IsPriorityAssignment_4_1"


    // $ANTLR start "rule__MaliciousActor__ProcessTimeAssignment_5_1"
    // InternalSock.g:2396:1: rule__MaliciousActor__ProcessTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__MaliciousActor__ProcessTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2400:1: ( ( ruleEInt ) )
            // InternalSock.g:2401:2: ( ruleEInt )
            {
            // InternalSock.g:2401:2: ( ruleEInt )
            // InternalSock.g:2402:3: ruleEInt
            {
             before(grammarAccess.getMaliciousActorAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMaliciousActorAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__ProcessTimeAssignment_5_1"


    // $ANTLR start "rule__MaliciousActor__PeriodTimeAssignment_6_1"
    // InternalSock.g:2411:1: rule__MaliciousActor__PeriodTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__MaliciousActor__PeriodTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2415:1: ( ( ruleEInt ) )
            // InternalSock.g:2416:2: ( ruleEInt )
            {
            // InternalSock.g:2416:2: ( ruleEInt )
            // InternalSock.g:2417:3: ruleEInt
            {
             before(grammarAccess.getMaliciousActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMaliciousActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__PeriodTimeAssignment_6_1"


    // $ANTLR start "rule__MaliciousActor__ResourceAssignment_7_1"
    // InternalSock.g:2426:1: rule__MaliciousActor__ResourceAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__MaliciousActor__ResourceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:2430:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:2431:2: ( ( ruleEString ) )
            {
            // InternalSock.g:2431:2: ( ( ruleEString ) )
            // InternalSock.g:2432:3: ( ruleEString )
            {
             before(grammarAccess.getMaliciousActorAccess().getResourceResourceCrossReference_7_1_0()); 
            // InternalSock.g:2433:3: ( ruleEString )
            // InternalSock.g:2434:4: ruleEString
            {
             before(grammarAccess.getMaliciousActorAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMaliciousActorAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMaliciousActorAccess().getResourceResourceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousActor__ResourceAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C2000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002008000L});

}