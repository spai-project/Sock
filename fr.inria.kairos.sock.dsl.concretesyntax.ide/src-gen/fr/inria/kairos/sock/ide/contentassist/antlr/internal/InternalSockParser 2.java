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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IotSystem'", "'{'", "'}'", "'ownedActor'", "','", "'ownedResource'", "'Actor'", "'isPriority'", "'processTime'", "'periodTime'", "'resource'", "'Resource'", "'actor'", "'('", "')'", "'-'"
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


    // $ANTLR start "entryRuleEString"
    // InternalSock.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSock.g:79:1: ( ruleEString EOF )
            // InternalSock.g:80:1: ruleEString EOF
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
    // InternalSock.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSock.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSock.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSock.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSock.g:94:3: ( rule__EString__Alternatives )
            // InternalSock.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleActor"
    // InternalSock.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalSock.g:104:1: ( ruleActor EOF )
            // InternalSock.g:105:1: ruleActor EOF
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
    // InternalSock.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalSock.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalSock.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalSock.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalSock.g:119:3: ( rule__Actor__Group__0 )
            // InternalSock.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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


    // $ANTLR start "entryRuleResource"
    // InternalSock.g:128:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalSock.g:129:1: ( ruleResource EOF )
            // InternalSock.g:130:1: ruleResource EOF
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
    // InternalSock.g:137:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:141:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalSock.g:142:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalSock.g:142:2: ( ( rule__Resource__Group__0 ) )
            // InternalSock.g:143:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalSock.g:144:3: ( rule__Resource__Group__0 )
            // InternalSock.g:144:4: rule__Resource__Group__0
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
    // InternalSock.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSock.g:154:1: ( ruleEInt EOF )
            // InternalSock.g:155:1: ruleEInt EOF
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
    // InternalSock.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSock.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSock.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalSock.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSock.g:169:3: ( rule__EInt__Group__0 )
            // InternalSock.g:169:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSock.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSock.g:182:2: ( RULE_STRING )
                    {
                    // InternalSock.g:182:2: ( RULE_STRING )
                    // InternalSock.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSock.g:188:2: ( RULE_ID )
                    {
                    // InternalSock.g:188:2: ( RULE_ID )
                    // InternalSock.g:189:3: RULE_ID
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
    // InternalSock.g:198:1: rule__IotSystem__Group__0 : rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1 ;
    public final void rule__IotSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:202:1: ( rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1 )
            // InternalSock.g:203:2: rule__IotSystem__Group__0__Impl rule__IotSystem__Group__1
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
    // InternalSock.g:210:1: rule__IotSystem__Group__0__Impl : ( () ) ;
    public final void rule__IotSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:214:1: ( ( () ) )
            // InternalSock.g:215:1: ( () )
            {
            // InternalSock.g:215:1: ( () )
            // InternalSock.g:216:2: ()
            {
             before(grammarAccess.getIotSystemAccess().getIotSystemAction_0()); 
            // InternalSock.g:217:2: ()
            // InternalSock.g:217:3: 
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
    // InternalSock.g:225:1: rule__IotSystem__Group__1 : rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2 ;
    public final void rule__IotSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:229:1: ( rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2 )
            // InternalSock.g:230:2: rule__IotSystem__Group__1__Impl rule__IotSystem__Group__2
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
    // InternalSock.g:237:1: rule__IotSystem__Group__1__Impl : ( 'IotSystem' ) ;
    public final void rule__IotSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:241:1: ( ( 'IotSystem' ) )
            // InternalSock.g:242:1: ( 'IotSystem' )
            {
            // InternalSock.g:242:1: ( 'IotSystem' )
            // InternalSock.g:243:2: 'IotSystem'
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
    // InternalSock.g:252:1: rule__IotSystem__Group__2 : rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3 ;
    public final void rule__IotSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:256:1: ( rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3 )
            // InternalSock.g:257:2: rule__IotSystem__Group__2__Impl rule__IotSystem__Group__3
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
    // InternalSock.g:264:1: rule__IotSystem__Group__2__Impl : ( ( rule__IotSystem__NameAssignment_2 ) ) ;
    public final void rule__IotSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:268:1: ( ( ( rule__IotSystem__NameAssignment_2 ) ) )
            // InternalSock.g:269:1: ( ( rule__IotSystem__NameAssignment_2 ) )
            {
            // InternalSock.g:269:1: ( ( rule__IotSystem__NameAssignment_2 ) )
            // InternalSock.g:270:2: ( rule__IotSystem__NameAssignment_2 )
            {
             before(grammarAccess.getIotSystemAccess().getNameAssignment_2()); 
            // InternalSock.g:271:2: ( rule__IotSystem__NameAssignment_2 )
            // InternalSock.g:271:3: rule__IotSystem__NameAssignment_2
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
    // InternalSock.g:279:1: rule__IotSystem__Group__3 : rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4 ;
    public final void rule__IotSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:283:1: ( rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4 )
            // InternalSock.g:284:2: rule__IotSystem__Group__3__Impl rule__IotSystem__Group__4
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
    // InternalSock.g:291:1: rule__IotSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:295:1: ( ( '{' ) )
            // InternalSock.g:296:1: ( '{' )
            {
            // InternalSock.g:296:1: ( '{' )
            // InternalSock.g:297:2: '{'
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
    // InternalSock.g:306:1: rule__IotSystem__Group__4 : rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5 ;
    public final void rule__IotSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:310:1: ( rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5 )
            // InternalSock.g:311:2: rule__IotSystem__Group__4__Impl rule__IotSystem__Group__5
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
    // InternalSock.g:318:1: rule__IotSystem__Group__4__Impl : ( ( rule__IotSystem__Group_4__0 )? ) ;
    public final void rule__IotSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:322:1: ( ( ( rule__IotSystem__Group_4__0 )? ) )
            // InternalSock.g:323:1: ( ( rule__IotSystem__Group_4__0 )? )
            {
            // InternalSock.g:323:1: ( ( rule__IotSystem__Group_4__0 )? )
            // InternalSock.g:324:2: ( rule__IotSystem__Group_4__0 )?
            {
             before(grammarAccess.getIotSystemAccess().getGroup_4()); 
            // InternalSock.g:325:2: ( rule__IotSystem__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSock.g:325:3: rule__IotSystem__Group_4__0
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
    // InternalSock.g:333:1: rule__IotSystem__Group__5 : rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6 ;
    public final void rule__IotSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:337:1: ( rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6 )
            // InternalSock.g:338:2: rule__IotSystem__Group__5__Impl rule__IotSystem__Group__6
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
    // InternalSock.g:345:1: rule__IotSystem__Group__5__Impl : ( ( rule__IotSystem__Group_5__0 )? ) ;
    public final void rule__IotSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:349:1: ( ( ( rule__IotSystem__Group_5__0 )? ) )
            // InternalSock.g:350:1: ( ( rule__IotSystem__Group_5__0 )? )
            {
            // InternalSock.g:350:1: ( ( rule__IotSystem__Group_5__0 )? )
            // InternalSock.g:351:2: ( rule__IotSystem__Group_5__0 )?
            {
             before(grammarAccess.getIotSystemAccess().getGroup_5()); 
            // InternalSock.g:352:2: ( rule__IotSystem__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSock.g:352:3: rule__IotSystem__Group_5__0
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
    // InternalSock.g:360:1: rule__IotSystem__Group__6 : rule__IotSystem__Group__6__Impl ;
    public final void rule__IotSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:364:1: ( rule__IotSystem__Group__6__Impl )
            // InternalSock.g:365:2: rule__IotSystem__Group__6__Impl
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
    // InternalSock.g:371:1: rule__IotSystem__Group__6__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:375:1: ( ( '}' ) )
            // InternalSock.g:376:1: ( '}' )
            {
            // InternalSock.g:376:1: ( '}' )
            // InternalSock.g:377:2: '}'
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
    // InternalSock.g:387:1: rule__IotSystem__Group_4__0 : rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1 ;
    public final void rule__IotSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:391:1: ( rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1 )
            // InternalSock.g:392:2: rule__IotSystem__Group_4__0__Impl rule__IotSystem__Group_4__1
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
    // InternalSock.g:399:1: rule__IotSystem__Group_4__0__Impl : ( 'ownedActor' ) ;
    public final void rule__IotSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:403:1: ( ( 'ownedActor' ) )
            // InternalSock.g:404:1: ( 'ownedActor' )
            {
            // InternalSock.g:404:1: ( 'ownedActor' )
            // InternalSock.g:405:2: 'ownedActor'
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
    // InternalSock.g:414:1: rule__IotSystem__Group_4__1 : rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2 ;
    public final void rule__IotSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:418:1: ( rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2 )
            // InternalSock.g:419:2: rule__IotSystem__Group_4__1__Impl rule__IotSystem__Group_4__2
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
    // InternalSock.g:426:1: rule__IotSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:430:1: ( ( '{' ) )
            // InternalSock.g:431:1: ( '{' )
            {
            // InternalSock.g:431:1: ( '{' )
            // InternalSock.g:432:2: '{'
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
    // InternalSock.g:441:1: rule__IotSystem__Group_4__2 : rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3 ;
    public final void rule__IotSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:445:1: ( rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3 )
            // InternalSock.g:446:2: rule__IotSystem__Group_4__2__Impl rule__IotSystem__Group_4__3
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
    // InternalSock.g:453:1: rule__IotSystem__Group_4__2__Impl : ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) ) ;
    public final void rule__IotSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:457:1: ( ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) ) )
            // InternalSock.g:458:1: ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) )
            {
            // InternalSock.g:458:1: ( ( rule__IotSystem__OwnedActorAssignment_4_2 ) )
            // InternalSock.g:459:2: ( rule__IotSystem__OwnedActorAssignment_4_2 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_2()); 
            // InternalSock.g:460:2: ( rule__IotSystem__OwnedActorAssignment_4_2 )
            // InternalSock.g:460:3: rule__IotSystem__OwnedActorAssignment_4_2
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
    // InternalSock.g:468:1: rule__IotSystem__Group_4__3 : rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4 ;
    public final void rule__IotSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:472:1: ( rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4 )
            // InternalSock.g:473:2: rule__IotSystem__Group_4__3__Impl rule__IotSystem__Group_4__4
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
    // InternalSock.g:480:1: rule__IotSystem__Group_4__3__Impl : ( ( rule__IotSystem__Group_4_3__0 )* ) ;
    public final void rule__IotSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:484:1: ( ( ( rule__IotSystem__Group_4_3__0 )* ) )
            // InternalSock.g:485:1: ( ( rule__IotSystem__Group_4_3__0 )* )
            {
            // InternalSock.g:485:1: ( ( rule__IotSystem__Group_4_3__0 )* )
            // InternalSock.g:486:2: ( rule__IotSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getIotSystemAccess().getGroup_4_3()); 
            // InternalSock.g:487:2: ( rule__IotSystem__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSock.g:487:3: rule__IotSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__IotSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSock.g:495:1: rule__IotSystem__Group_4__4 : rule__IotSystem__Group_4__4__Impl ;
    public final void rule__IotSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:499:1: ( rule__IotSystem__Group_4__4__Impl )
            // InternalSock.g:500:2: rule__IotSystem__Group_4__4__Impl
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
    // InternalSock.g:506:1: rule__IotSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:510:1: ( ( '}' ) )
            // InternalSock.g:511:1: ( '}' )
            {
            // InternalSock.g:511:1: ( '}' )
            // InternalSock.g:512:2: '}'
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
    // InternalSock.g:522:1: rule__IotSystem__Group_4_3__0 : rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1 ;
    public final void rule__IotSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:526:1: ( rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1 )
            // InternalSock.g:527:2: rule__IotSystem__Group_4_3__0__Impl rule__IotSystem__Group_4_3__1
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
    // InternalSock.g:534:1: rule__IotSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__IotSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:538:1: ( ( ',' ) )
            // InternalSock.g:539:1: ( ',' )
            {
            // InternalSock.g:539:1: ( ',' )
            // InternalSock.g:540:2: ','
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
    // InternalSock.g:549:1: rule__IotSystem__Group_4_3__1 : rule__IotSystem__Group_4_3__1__Impl ;
    public final void rule__IotSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:553:1: ( rule__IotSystem__Group_4_3__1__Impl )
            // InternalSock.g:554:2: rule__IotSystem__Group_4_3__1__Impl
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
    // InternalSock.g:560:1: rule__IotSystem__Group_4_3__1__Impl : ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) ) ;
    public final void rule__IotSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:564:1: ( ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) ) )
            // InternalSock.g:565:1: ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) )
            {
            // InternalSock.g:565:1: ( ( rule__IotSystem__OwnedActorAssignment_4_3_1 ) )
            // InternalSock.g:566:2: ( rule__IotSystem__OwnedActorAssignment_4_3_1 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedActorAssignment_4_3_1()); 
            // InternalSock.g:567:2: ( rule__IotSystem__OwnedActorAssignment_4_3_1 )
            // InternalSock.g:567:3: rule__IotSystem__OwnedActorAssignment_4_3_1
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
    // InternalSock.g:576:1: rule__IotSystem__Group_5__0 : rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1 ;
    public final void rule__IotSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:580:1: ( rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1 )
            // InternalSock.g:581:2: rule__IotSystem__Group_5__0__Impl rule__IotSystem__Group_5__1
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
    // InternalSock.g:588:1: rule__IotSystem__Group_5__0__Impl : ( 'ownedResource' ) ;
    public final void rule__IotSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:592:1: ( ( 'ownedResource' ) )
            // InternalSock.g:593:1: ( 'ownedResource' )
            {
            // InternalSock.g:593:1: ( 'ownedResource' )
            // InternalSock.g:594:2: 'ownedResource'
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
    // InternalSock.g:603:1: rule__IotSystem__Group_5__1 : rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2 ;
    public final void rule__IotSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:607:1: ( rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2 )
            // InternalSock.g:608:2: rule__IotSystem__Group_5__1__Impl rule__IotSystem__Group_5__2
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
    // InternalSock.g:615:1: rule__IotSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__IotSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:619:1: ( ( '{' ) )
            // InternalSock.g:620:1: ( '{' )
            {
            // InternalSock.g:620:1: ( '{' )
            // InternalSock.g:621:2: '{'
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
    // InternalSock.g:630:1: rule__IotSystem__Group_5__2 : rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3 ;
    public final void rule__IotSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:634:1: ( rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3 )
            // InternalSock.g:635:2: rule__IotSystem__Group_5__2__Impl rule__IotSystem__Group_5__3
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
    // InternalSock.g:642:1: rule__IotSystem__Group_5__2__Impl : ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) ) ;
    public final void rule__IotSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:646:1: ( ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) ) )
            // InternalSock.g:647:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) )
            {
            // InternalSock.g:647:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_2 ) )
            // InternalSock.g:648:2: ( rule__IotSystem__OwnedResourceAssignment_5_2 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_2()); 
            // InternalSock.g:649:2: ( rule__IotSystem__OwnedResourceAssignment_5_2 )
            // InternalSock.g:649:3: rule__IotSystem__OwnedResourceAssignment_5_2
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
    // InternalSock.g:657:1: rule__IotSystem__Group_5__3 : rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4 ;
    public final void rule__IotSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:661:1: ( rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4 )
            // InternalSock.g:662:2: rule__IotSystem__Group_5__3__Impl rule__IotSystem__Group_5__4
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
    // InternalSock.g:669:1: rule__IotSystem__Group_5__3__Impl : ( ( rule__IotSystem__Group_5_3__0 )* ) ;
    public final void rule__IotSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:673:1: ( ( ( rule__IotSystem__Group_5_3__0 )* ) )
            // InternalSock.g:674:1: ( ( rule__IotSystem__Group_5_3__0 )* )
            {
            // InternalSock.g:674:1: ( ( rule__IotSystem__Group_5_3__0 )* )
            // InternalSock.g:675:2: ( rule__IotSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getIotSystemAccess().getGroup_5_3()); 
            // InternalSock.g:676:2: ( rule__IotSystem__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSock.g:676:3: rule__IotSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__IotSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSock.g:684:1: rule__IotSystem__Group_5__4 : rule__IotSystem__Group_5__4__Impl ;
    public final void rule__IotSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:688:1: ( rule__IotSystem__Group_5__4__Impl )
            // InternalSock.g:689:2: rule__IotSystem__Group_5__4__Impl
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
    // InternalSock.g:695:1: rule__IotSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__IotSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:699:1: ( ( '}' ) )
            // InternalSock.g:700:1: ( '}' )
            {
            // InternalSock.g:700:1: ( '}' )
            // InternalSock.g:701:2: '}'
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
    // InternalSock.g:711:1: rule__IotSystem__Group_5_3__0 : rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1 ;
    public final void rule__IotSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:715:1: ( rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1 )
            // InternalSock.g:716:2: rule__IotSystem__Group_5_3__0__Impl rule__IotSystem__Group_5_3__1
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
    // InternalSock.g:723:1: rule__IotSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__IotSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:727:1: ( ( ',' ) )
            // InternalSock.g:728:1: ( ',' )
            {
            // InternalSock.g:728:1: ( ',' )
            // InternalSock.g:729:2: ','
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
    // InternalSock.g:738:1: rule__IotSystem__Group_5_3__1 : rule__IotSystem__Group_5_3__1__Impl ;
    public final void rule__IotSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:742:1: ( rule__IotSystem__Group_5_3__1__Impl )
            // InternalSock.g:743:2: rule__IotSystem__Group_5_3__1__Impl
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
    // InternalSock.g:749:1: rule__IotSystem__Group_5_3__1__Impl : ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) ) ;
    public final void rule__IotSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:753:1: ( ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) ) )
            // InternalSock.g:754:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) )
            {
            // InternalSock.g:754:1: ( ( rule__IotSystem__OwnedResourceAssignment_5_3_1 ) )
            // InternalSock.g:755:2: ( rule__IotSystem__OwnedResourceAssignment_5_3_1 )
            {
             before(grammarAccess.getIotSystemAccess().getOwnedResourceAssignment_5_3_1()); 
            // InternalSock.g:756:2: ( rule__IotSystem__OwnedResourceAssignment_5_3_1 )
            // InternalSock.g:756:3: rule__IotSystem__OwnedResourceAssignment_5_3_1
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


    // $ANTLR start "rule__Actor__Group__0"
    // InternalSock.g:765:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:769:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSock.g:770:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalSock.g:777:1: rule__Actor__Group__0__Impl : ( () ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:781:1: ( ( () ) )
            // InternalSock.g:782:1: ( () )
            {
            // InternalSock.g:782:1: ( () )
            // InternalSock.g:783:2: ()
            {
             before(grammarAccess.getActorAccess().getActorAction_0()); 
            // InternalSock.g:784:2: ()
            // InternalSock.g:784:3: 
            {
            }

             after(grammarAccess.getActorAccess().getActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalSock.g:792:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:796:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSock.g:797:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalSock.g:804:1: rule__Actor__Group__1__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:808:1: ( ( 'Actor' ) )
            // InternalSock.g:809:1: ( 'Actor' )
            {
            // InternalSock.g:809:1: ( 'Actor' )
            // InternalSock.g:810:2: 'Actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalSock.g:819:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:823:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSock.g:824:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalSock.g:831:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__NameAssignment_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:835:1: ( ( ( rule__Actor__NameAssignment_2 ) ) )
            // InternalSock.g:836:1: ( ( rule__Actor__NameAssignment_2 ) )
            {
            // InternalSock.g:836:1: ( ( rule__Actor__NameAssignment_2 ) )
            // InternalSock.g:837:2: ( rule__Actor__NameAssignment_2 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2()); 
            // InternalSock.g:838:2: ( rule__Actor__NameAssignment_2 )
            // InternalSock.g:838:3: rule__Actor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalSock.g:846:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:850:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalSock.g:851:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

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
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalSock.g:858:1: rule__Actor__Group__3__Impl : ( '{' ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:862:1: ( ( '{' ) )
            // InternalSock.g:863:1: ( '{' )
            {
            // InternalSock.g:863:1: ( '{' )
            // InternalSock.g:864:2: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalSock.g:873:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:877:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalSock.g:878:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

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
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalSock.g:885:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__Group_4__0 )? ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:889:1: ( ( ( rule__Actor__Group_4__0 )? ) )
            // InternalSock.g:890:1: ( ( rule__Actor__Group_4__0 )? )
            {
            // InternalSock.g:890:1: ( ( rule__Actor__Group_4__0 )? )
            // InternalSock.g:891:2: ( rule__Actor__Group_4__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_4()); 
            // InternalSock.g:892:2: ( rule__Actor__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSock.g:892:3: rule__Actor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalSock.g:900:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:904:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalSock.g:905:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__6();

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
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalSock.g:912:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__Group_5__0 )? ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:916:1: ( ( ( rule__Actor__Group_5__0 )? ) )
            // InternalSock.g:917:1: ( ( rule__Actor__Group_5__0 )? )
            {
            // InternalSock.g:917:1: ( ( rule__Actor__Group_5__0 )? )
            // InternalSock.g:918:2: ( rule__Actor__Group_5__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_5()); 
            // InternalSock.g:919:2: ( rule__Actor__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSock.g:919:3: rule__Actor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group__6"
    // InternalSock.g:927:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:931:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalSock.g:932:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__7();

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
    // $ANTLR end "rule__Actor__Group__6"


    // $ANTLR start "rule__Actor__Group__6__Impl"
    // InternalSock.g:939:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__Group_6__0 )? ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:943:1: ( ( ( rule__Actor__Group_6__0 )? ) )
            // InternalSock.g:944:1: ( ( rule__Actor__Group_6__0 )? )
            {
            // InternalSock.g:944:1: ( ( rule__Actor__Group_6__0 )? )
            // InternalSock.g:945:2: ( rule__Actor__Group_6__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_6()); 
            // InternalSock.g:946:2: ( rule__Actor__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSock.g:946:3: rule__Actor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Actor__Group__6__Impl"


    // $ANTLR start "rule__Actor__Group__7"
    // InternalSock.g:954:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl rule__Actor__Group__8 ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:958:1: ( rule__Actor__Group__7__Impl rule__Actor__Group__8 )
            // InternalSock.g:959:2: rule__Actor__Group__7__Impl rule__Actor__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__8();

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
    // $ANTLR end "rule__Actor__Group__7"


    // $ANTLR start "rule__Actor__Group__7__Impl"
    // InternalSock.g:966:1: rule__Actor__Group__7__Impl : ( ( rule__Actor__Group_7__0 )? ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:970:1: ( ( ( rule__Actor__Group_7__0 )? ) )
            // InternalSock.g:971:1: ( ( rule__Actor__Group_7__0 )? )
            {
            // InternalSock.g:971:1: ( ( rule__Actor__Group_7__0 )? )
            // InternalSock.g:972:2: ( rule__Actor__Group_7__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_7()); 
            // InternalSock.g:973:2: ( rule__Actor__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSock.g:973:3: rule__Actor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Actor__Group__7__Impl"


    // $ANTLR start "rule__Actor__Group__8"
    // InternalSock.g:981:1: rule__Actor__Group__8 : rule__Actor__Group__8__Impl ;
    public final void rule__Actor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:985:1: ( rule__Actor__Group__8__Impl )
            // InternalSock.g:986:2: rule__Actor__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__8__Impl();

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
    // $ANTLR end "rule__Actor__Group__8"


    // $ANTLR start "rule__Actor__Group__8__Impl"
    // InternalSock.g:992:1: rule__Actor__Group__8__Impl : ( '}' ) ;
    public final void rule__Actor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:996:1: ( ( '}' ) )
            // InternalSock.g:997:1: ( '}' )
            {
            // InternalSock.g:997:1: ( '}' )
            // InternalSock.g:998:2: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Actor__Group__8__Impl"


    // $ANTLR start "rule__Actor__Group_4__0"
    // InternalSock.g:1008:1: rule__Actor__Group_4__0 : rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 ;
    public final void rule__Actor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1012:1: ( rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 )
            // InternalSock.g:1013:2: rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_4__1();

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
    // $ANTLR end "rule__Actor__Group_4__0"


    // $ANTLR start "rule__Actor__Group_4__0__Impl"
    // InternalSock.g:1020:1: rule__Actor__Group_4__0__Impl : ( 'isPriority' ) ;
    public final void rule__Actor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1024:1: ( ( 'isPriority' ) )
            // InternalSock.g:1025:1: ( 'isPriority' )
            {
            // InternalSock.g:1025:1: ( 'isPriority' )
            // InternalSock.g:1026:2: 'isPriority'
            {
             before(grammarAccess.getActorAccess().getIsPriorityKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getIsPriorityKeyword_4_0()); 

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
    // $ANTLR end "rule__Actor__Group_4__0__Impl"


    // $ANTLR start "rule__Actor__Group_4__1"
    // InternalSock.g:1035:1: rule__Actor__Group_4__1 : rule__Actor__Group_4__1__Impl ;
    public final void rule__Actor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1039:1: ( rule__Actor__Group_4__1__Impl )
            // InternalSock.g:1040:2: rule__Actor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_4__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_4__1"


    // $ANTLR start "rule__Actor__Group_4__1__Impl"
    // InternalSock.g:1046:1: rule__Actor__Group_4__1__Impl : ( ( rule__Actor__IsPriorityAssignment_4_1 ) ) ;
    public final void rule__Actor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1050:1: ( ( ( rule__Actor__IsPriorityAssignment_4_1 ) ) )
            // InternalSock.g:1051:1: ( ( rule__Actor__IsPriorityAssignment_4_1 ) )
            {
            // InternalSock.g:1051:1: ( ( rule__Actor__IsPriorityAssignment_4_1 ) )
            // InternalSock.g:1052:2: ( rule__Actor__IsPriorityAssignment_4_1 )
            {
             before(grammarAccess.getActorAccess().getIsPriorityAssignment_4_1()); 
            // InternalSock.g:1053:2: ( rule__Actor__IsPriorityAssignment_4_1 )
            // InternalSock.g:1053:3: rule__Actor__IsPriorityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__IsPriorityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getIsPriorityAssignment_4_1()); 

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
    // $ANTLR end "rule__Actor__Group_4__1__Impl"


    // $ANTLR start "rule__Actor__Group_5__0"
    // InternalSock.g:1062:1: rule__Actor__Group_5__0 : rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1 ;
    public final void rule__Actor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1066:1: ( rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1 )
            // InternalSock.g:1067:2: rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_5__1();

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
    // $ANTLR end "rule__Actor__Group_5__0"


    // $ANTLR start "rule__Actor__Group_5__0__Impl"
    // InternalSock.g:1074:1: rule__Actor__Group_5__0__Impl : ( 'processTime' ) ;
    public final void rule__Actor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1078:1: ( ( 'processTime' ) )
            // InternalSock.g:1079:1: ( 'processTime' )
            {
            // InternalSock.g:1079:1: ( 'processTime' )
            // InternalSock.g:1080:2: 'processTime'
            {
             before(grammarAccess.getActorAccess().getProcessTimeKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getProcessTimeKeyword_5_0()); 

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
    // $ANTLR end "rule__Actor__Group_5__0__Impl"


    // $ANTLR start "rule__Actor__Group_5__1"
    // InternalSock.g:1089:1: rule__Actor__Group_5__1 : rule__Actor__Group_5__1__Impl ;
    public final void rule__Actor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1093:1: ( rule__Actor__Group_5__1__Impl )
            // InternalSock.g:1094:2: rule__Actor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_5__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_5__1"


    // $ANTLR start "rule__Actor__Group_5__1__Impl"
    // InternalSock.g:1100:1: rule__Actor__Group_5__1__Impl : ( ( rule__Actor__ProcessTimeAssignment_5_1 ) ) ;
    public final void rule__Actor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1104:1: ( ( ( rule__Actor__ProcessTimeAssignment_5_1 ) ) )
            // InternalSock.g:1105:1: ( ( rule__Actor__ProcessTimeAssignment_5_1 ) )
            {
            // InternalSock.g:1105:1: ( ( rule__Actor__ProcessTimeAssignment_5_1 ) )
            // InternalSock.g:1106:2: ( rule__Actor__ProcessTimeAssignment_5_1 )
            {
             before(grammarAccess.getActorAccess().getProcessTimeAssignment_5_1()); 
            // InternalSock.g:1107:2: ( rule__Actor__ProcessTimeAssignment_5_1 )
            // InternalSock.g:1107:3: rule__Actor__ProcessTimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__ProcessTimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getProcessTimeAssignment_5_1()); 

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
    // $ANTLR end "rule__Actor__Group_5__1__Impl"


    // $ANTLR start "rule__Actor__Group_6__0"
    // InternalSock.g:1116:1: rule__Actor__Group_6__0 : rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 ;
    public final void rule__Actor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1120:1: ( rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 )
            // InternalSock.g:1121:2: rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1();

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
    // $ANTLR end "rule__Actor__Group_6__0"


    // $ANTLR start "rule__Actor__Group_6__0__Impl"
    // InternalSock.g:1128:1: rule__Actor__Group_6__0__Impl : ( 'periodTime' ) ;
    public final void rule__Actor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1132:1: ( ( 'periodTime' ) )
            // InternalSock.g:1133:1: ( 'periodTime' )
            {
            // InternalSock.g:1133:1: ( 'periodTime' )
            // InternalSock.g:1134:2: 'periodTime'
            {
             before(grammarAccess.getActorAccess().getPeriodTimeKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getPeriodTimeKeyword_6_0()); 

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
    // $ANTLR end "rule__Actor__Group_6__0__Impl"


    // $ANTLR start "rule__Actor__Group_6__1"
    // InternalSock.g:1143:1: rule__Actor__Group_6__1 : rule__Actor__Group_6__1__Impl ;
    public final void rule__Actor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1147:1: ( rule__Actor__Group_6__1__Impl )
            // InternalSock.g:1148:2: rule__Actor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_6__1"


    // $ANTLR start "rule__Actor__Group_6__1__Impl"
    // InternalSock.g:1154:1: rule__Actor__Group_6__1__Impl : ( ( rule__Actor__PeriodTimeAssignment_6_1 ) ) ;
    public final void rule__Actor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1158:1: ( ( ( rule__Actor__PeriodTimeAssignment_6_1 ) ) )
            // InternalSock.g:1159:1: ( ( rule__Actor__PeriodTimeAssignment_6_1 ) )
            {
            // InternalSock.g:1159:1: ( ( rule__Actor__PeriodTimeAssignment_6_1 ) )
            // InternalSock.g:1160:2: ( rule__Actor__PeriodTimeAssignment_6_1 )
            {
             before(grammarAccess.getActorAccess().getPeriodTimeAssignment_6_1()); 
            // InternalSock.g:1161:2: ( rule__Actor__PeriodTimeAssignment_6_1 )
            // InternalSock.g:1161:3: rule__Actor__PeriodTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__PeriodTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getPeriodTimeAssignment_6_1()); 

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
    // $ANTLR end "rule__Actor__Group_6__1__Impl"


    // $ANTLR start "rule__Actor__Group_7__0"
    // InternalSock.g:1170:1: rule__Actor__Group_7__0 : rule__Actor__Group_7__0__Impl rule__Actor__Group_7__1 ;
    public final void rule__Actor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1174:1: ( rule__Actor__Group_7__0__Impl rule__Actor__Group_7__1 )
            // InternalSock.g:1175:2: rule__Actor__Group_7__0__Impl rule__Actor__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Actor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_7__1();

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
    // $ANTLR end "rule__Actor__Group_7__0"


    // $ANTLR start "rule__Actor__Group_7__0__Impl"
    // InternalSock.g:1182:1: rule__Actor__Group_7__0__Impl : ( 'resource' ) ;
    public final void rule__Actor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1186:1: ( ( 'resource' ) )
            // InternalSock.g:1187:1: ( 'resource' )
            {
            // InternalSock.g:1187:1: ( 'resource' )
            // InternalSock.g:1188:2: 'resource'
            {
             before(grammarAccess.getActorAccess().getResourceKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getResourceKeyword_7_0()); 

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
    // $ANTLR end "rule__Actor__Group_7__0__Impl"


    // $ANTLR start "rule__Actor__Group_7__1"
    // InternalSock.g:1197:1: rule__Actor__Group_7__1 : rule__Actor__Group_7__1__Impl ;
    public final void rule__Actor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1201:1: ( rule__Actor__Group_7__1__Impl )
            // InternalSock.g:1202:2: rule__Actor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_7__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_7__1"


    // $ANTLR start "rule__Actor__Group_7__1__Impl"
    // InternalSock.g:1208:1: rule__Actor__Group_7__1__Impl : ( ( rule__Actor__ResourceAssignment_7_1 ) ) ;
    public final void rule__Actor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1212:1: ( ( ( rule__Actor__ResourceAssignment_7_1 ) ) )
            // InternalSock.g:1213:1: ( ( rule__Actor__ResourceAssignment_7_1 ) )
            {
            // InternalSock.g:1213:1: ( ( rule__Actor__ResourceAssignment_7_1 ) )
            // InternalSock.g:1214:2: ( rule__Actor__ResourceAssignment_7_1 )
            {
             before(grammarAccess.getActorAccess().getResourceAssignment_7_1()); 
            // InternalSock.g:1215:2: ( rule__Actor__ResourceAssignment_7_1 )
            // InternalSock.g:1215:3: rule__Actor__ResourceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__ResourceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getResourceAssignment_7_1()); 

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
    // $ANTLR end "rule__Actor__Group_7__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalSock.g:1224:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1228:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSock.g:1229:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
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
    // InternalSock.g:1236:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1240:1: ( ( () ) )
            // InternalSock.g:1241:1: ( () )
            {
            // InternalSock.g:1241:1: ( () )
            // InternalSock.g:1242:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalSock.g:1243:2: ()
            // InternalSock.g:1243:3: 
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
    // InternalSock.g:1251:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1255:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSock.g:1256:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalSock.g:1263:1: rule__Resource__Group__1__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1267:1: ( ( 'Resource' ) )
            // InternalSock.g:1268:1: ( 'Resource' )
            {
            // InternalSock.g:1268:1: ( 'Resource' )
            // InternalSock.g:1269:2: 'Resource'
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
    // InternalSock.g:1278:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1282:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSock.g:1283:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
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
    // InternalSock.g:1290:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__NameAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1294:1: ( ( ( rule__Resource__NameAssignment_2 ) ) )
            // InternalSock.g:1295:1: ( ( rule__Resource__NameAssignment_2 ) )
            {
            // InternalSock.g:1295:1: ( ( rule__Resource__NameAssignment_2 ) )
            // InternalSock.g:1296:2: ( rule__Resource__NameAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_2()); 
            // InternalSock.g:1297:2: ( rule__Resource__NameAssignment_2 )
            // InternalSock.g:1297:3: rule__Resource__NameAssignment_2
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
    // InternalSock.g:1305:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1309:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSock.g:1310:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSock.g:1317:1: rule__Resource__Group__3__Impl : ( '{' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1321:1: ( ( '{' ) )
            // InternalSock.g:1322:1: ( '{' )
            {
            // InternalSock.g:1322:1: ( '{' )
            // InternalSock.g:1323:2: '{'
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
    // InternalSock.g:1332:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1336:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSock.g:1337:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSock.g:1344:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__Group_4__0 )? ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1348:1: ( ( ( rule__Resource__Group_4__0 )? ) )
            // InternalSock.g:1349:1: ( ( rule__Resource__Group_4__0 )? )
            {
            // InternalSock.g:1349:1: ( ( rule__Resource__Group_4__0 )? )
            // InternalSock.g:1350:2: ( rule__Resource__Group_4__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_4()); 
            // InternalSock.g:1351:2: ( rule__Resource__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSock.g:1351:3: rule__Resource__Group_4__0
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
    // InternalSock.g:1359:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1363:1: ( rule__Resource__Group__5__Impl )
            // InternalSock.g:1364:2: rule__Resource__Group__5__Impl
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
    // InternalSock.g:1370:1: rule__Resource__Group__5__Impl : ( '}' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1374:1: ( ( '}' ) )
            // InternalSock.g:1375:1: ( '}' )
            {
            // InternalSock.g:1375:1: ( '}' )
            // InternalSock.g:1376:2: '}'
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
    // InternalSock.g:1386:1: rule__Resource__Group_4__0 : rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 ;
    public final void rule__Resource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1390:1: ( rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 )
            // InternalSock.g:1391:2: rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSock.g:1398:1: rule__Resource__Group_4__0__Impl : ( 'actor' ) ;
    public final void rule__Resource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1402:1: ( ( 'actor' ) )
            // InternalSock.g:1403:1: ( 'actor' )
            {
            // InternalSock.g:1403:1: ( 'actor' )
            // InternalSock.g:1404:2: 'actor'
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
    // InternalSock.g:1413:1: rule__Resource__Group_4__1 : rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2 ;
    public final void rule__Resource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1417:1: ( rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2 )
            // InternalSock.g:1418:2: rule__Resource__Group_4__1__Impl rule__Resource__Group_4__2
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
    // InternalSock.g:1425:1: rule__Resource__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Resource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1429:1: ( ( '(' ) )
            // InternalSock.g:1430:1: ( '(' )
            {
            // InternalSock.g:1430:1: ( '(' )
            // InternalSock.g:1431:2: '('
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
    // InternalSock.g:1440:1: rule__Resource__Group_4__2 : rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3 ;
    public final void rule__Resource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1444:1: ( rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3 )
            // InternalSock.g:1445:2: rule__Resource__Group_4__2__Impl rule__Resource__Group_4__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSock.g:1452:1: rule__Resource__Group_4__2__Impl : ( ( rule__Resource__ActorAssignment_4_2 ) ) ;
    public final void rule__Resource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1456:1: ( ( ( rule__Resource__ActorAssignment_4_2 ) ) )
            // InternalSock.g:1457:1: ( ( rule__Resource__ActorAssignment_4_2 ) )
            {
            // InternalSock.g:1457:1: ( ( rule__Resource__ActorAssignment_4_2 ) )
            // InternalSock.g:1458:2: ( rule__Resource__ActorAssignment_4_2 )
            {
             before(grammarAccess.getResourceAccess().getActorAssignment_4_2()); 
            // InternalSock.g:1459:2: ( rule__Resource__ActorAssignment_4_2 )
            // InternalSock.g:1459:3: rule__Resource__ActorAssignment_4_2
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
    // InternalSock.g:1467:1: rule__Resource__Group_4__3 : rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4 ;
    public final void rule__Resource__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1471:1: ( rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4 )
            // InternalSock.g:1472:2: rule__Resource__Group_4__3__Impl rule__Resource__Group_4__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSock.g:1479:1: rule__Resource__Group_4__3__Impl : ( ( rule__Resource__Group_4_3__0 )* ) ;
    public final void rule__Resource__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1483:1: ( ( ( rule__Resource__Group_4_3__0 )* ) )
            // InternalSock.g:1484:1: ( ( rule__Resource__Group_4_3__0 )* )
            {
            // InternalSock.g:1484:1: ( ( rule__Resource__Group_4_3__0 )* )
            // InternalSock.g:1485:2: ( rule__Resource__Group_4_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_4_3()); 
            // InternalSock.g:1486:2: ( rule__Resource__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSock.g:1486:3: rule__Resource__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSock.g:1494:1: rule__Resource__Group_4__4 : rule__Resource__Group_4__4__Impl ;
    public final void rule__Resource__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1498:1: ( rule__Resource__Group_4__4__Impl )
            // InternalSock.g:1499:2: rule__Resource__Group_4__4__Impl
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
    // InternalSock.g:1505:1: rule__Resource__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Resource__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1509:1: ( ( ')' ) )
            // InternalSock.g:1510:1: ( ')' )
            {
            // InternalSock.g:1510:1: ( ')' )
            // InternalSock.g:1511:2: ')'
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
    // InternalSock.g:1521:1: rule__Resource__Group_4_3__0 : rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1 ;
    public final void rule__Resource__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1525:1: ( rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1 )
            // InternalSock.g:1526:2: rule__Resource__Group_4_3__0__Impl rule__Resource__Group_4_3__1
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
    // InternalSock.g:1533:1: rule__Resource__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1537:1: ( ( ',' ) )
            // InternalSock.g:1538:1: ( ',' )
            {
            // InternalSock.g:1538:1: ( ',' )
            // InternalSock.g:1539:2: ','
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
    // InternalSock.g:1548:1: rule__Resource__Group_4_3__1 : rule__Resource__Group_4_3__1__Impl ;
    public final void rule__Resource__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1552:1: ( rule__Resource__Group_4_3__1__Impl )
            // InternalSock.g:1553:2: rule__Resource__Group_4_3__1__Impl
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
    // InternalSock.g:1559:1: rule__Resource__Group_4_3__1__Impl : ( ( rule__Resource__ActorAssignment_4_3_1 ) ) ;
    public final void rule__Resource__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1563:1: ( ( ( rule__Resource__ActorAssignment_4_3_1 ) ) )
            // InternalSock.g:1564:1: ( ( rule__Resource__ActorAssignment_4_3_1 ) )
            {
            // InternalSock.g:1564:1: ( ( rule__Resource__ActorAssignment_4_3_1 ) )
            // InternalSock.g:1565:2: ( rule__Resource__ActorAssignment_4_3_1 )
            {
             before(grammarAccess.getResourceAccess().getActorAssignment_4_3_1()); 
            // InternalSock.g:1566:2: ( rule__Resource__ActorAssignment_4_3_1 )
            // InternalSock.g:1566:3: rule__Resource__ActorAssignment_4_3_1
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
    // InternalSock.g:1575:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1579:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSock.g:1580:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSock.g:1587:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1591:1: ( ( ( '-' )? ) )
            // InternalSock.g:1592:1: ( ( '-' )? )
            {
            // InternalSock.g:1592:1: ( ( '-' )? )
            // InternalSock.g:1593:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSock.g:1594:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSock.g:1594:3: '-'
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
    // InternalSock.g:1602:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1606:1: ( rule__EInt__Group__1__Impl )
            // InternalSock.g:1607:2: rule__EInt__Group__1__Impl
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
    // InternalSock.g:1613:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1617:1: ( ( RULE_INT ) )
            // InternalSock.g:1618:1: ( RULE_INT )
            {
            // InternalSock.g:1618:1: ( RULE_INT )
            // InternalSock.g:1619:2: RULE_INT
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


    // $ANTLR start "rule__IotSystem__NameAssignment_2"
    // InternalSock.g:1629:1: rule__IotSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IotSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1633:1: ( ( ruleEString ) )
            // InternalSock.g:1634:2: ( ruleEString )
            {
            // InternalSock.g:1634:2: ( ruleEString )
            // InternalSock.g:1635:3: ruleEString
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
    // InternalSock.g:1644:1: rule__IotSystem__OwnedActorAssignment_4_2 : ( ruleActor ) ;
    public final void rule__IotSystem__OwnedActorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1648:1: ( ( ruleActor ) )
            // InternalSock.g:1649:2: ( ruleActor )
            {
            // InternalSock.g:1649:2: ( ruleActor )
            // InternalSock.g:1650:3: ruleActor
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
    // InternalSock.g:1659:1: rule__IotSystem__OwnedActorAssignment_4_3_1 : ( ruleActor ) ;
    public final void rule__IotSystem__OwnedActorAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1663:1: ( ( ruleActor ) )
            // InternalSock.g:1664:2: ( ruleActor )
            {
            // InternalSock.g:1664:2: ( ruleActor )
            // InternalSock.g:1665:3: ruleActor
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
    // InternalSock.g:1674:1: rule__IotSystem__OwnedResourceAssignment_5_2 : ( ruleResource ) ;
    public final void rule__IotSystem__OwnedResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1678:1: ( ( ruleResource ) )
            // InternalSock.g:1679:2: ( ruleResource )
            {
            // InternalSock.g:1679:2: ( ruleResource )
            // InternalSock.g:1680:3: ruleResource
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
    // InternalSock.g:1689:1: rule__IotSystem__OwnedResourceAssignment_5_3_1 : ( ruleResource ) ;
    public final void rule__IotSystem__OwnedResourceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1693:1: ( ( ruleResource ) )
            // InternalSock.g:1694:2: ( ruleResource )
            {
            // InternalSock.g:1694:2: ( ruleResource )
            // InternalSock.g:1695:3: ruleResource
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


    // $ANTLR start "rule__Actor__NameAssignment_2"
    // InternalSock.g:1704:1: rule__Actor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Actor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1708:1: ( ( ruleEString ) )
            // InternalSock.g:1709:2: ( ruleEString )
            {
            // InternalSock.g:1709:2: ( ruleEString )
            // InternalSock.g:1710:3: ruleEString
            {
             before(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_2"


    // $ANTLR start "rule__Actor__IsPriorityAssignment_4_1"
    // InternalSock.g:1719:1: rule__Actor__IsPriorityAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Actor__IsPriorityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1723:1: ( ( ruleEInt ) )
            // InternalSock.g:1724:2: ( ruleEInt )
            {
            // InternalSock.g:1724:2: ( ruleEInt )
            // InternalSock.g:1725:3: ruleEInt
            {
             before(grammarAccess.getActorAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActorAccess().getIsPriorityEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Actor__IsPriorityAssignment_4_1"


    // $ANTLR start "rule__Actor__ProcessTimeAssignment_5_1"
    // InternalSock.g:1734:1: rule__Actor__ProcessTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Actor__ProcessTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1738:1: ( ( ruleEInt ) )
            // InternalSock.g:1739:2: ( ruleEInt )
            {
            // InternalSock.g:1739:2: ( ruleEInt )
            // InternalSock.g:1740:3: ruleEInt
            {
             before(grammarAccess.getActorAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActorAccess().getProcessTimeEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Actor__ProcessTimeAssignment_5_1"


    // $ANTLR start "rule__Actor__PeriodTimeAssignment_6_1"
    // InternalSock.g:1749:1: rule__Actor__PeriodTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Actor__PeriodTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1753:1: ( ( ruleEInt ) )
            // InternalSock.g:1754:2: ( ruleEInt )
            {
            // InternalSock.g:1754:2: ( ruleEInt )
            // InternalSock.g:1755:3: ruleEInt
            {
             before(grammarAccess.getActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActorAccess().getPeriodTimeEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Actor__PeriodTimeAssignment_6_1"


    // $ANTLR start "rule__Actor__ResourceAssignment_7_1"
    // InternalSock.g:1764:1: rule__Actor__ResourceAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Actor__ResourceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1768:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:1769:2: ( ( ruleEString ) )
            {
            // InternalSock.g:1769:2: ( ( ruleEString ) )
            // InternalSock.g:1770:3: ( ruleEString )
            {
             before(grammarAccess.getActorAccess().getResourceResourceCrossReference_7_1_0()); 
            // InternalSock.g:1771:3: ( ruleEString )
            // InternalSock.g:1772:4: ruleEString
            {
             before(grammarAccess.getActorAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActorAccess().getResourceResourceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getResourceResourceCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Actor__ResourceAssignment_7_1"


    // $ANTLR start "rule__Resource__NameAssignment_2"
    // InternalSock.g:1783:1: rule__Resource__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1787:1: ( ( ruleEString ) )
            // InternalSock.g:1788:2: ( ruleEString )
            {
            // InternalSock.g:1788:2: ( ruleEString )
            // InternalSock.g:1789:3: ruleEString
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
    // InternalSock.g:1798:1: rule__Resource__ActorAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ActorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1802:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:1803:2: ( ( ruleEString ) )
            {
            // InternalSock.g:1803:2: ( ( ruleEString ) )
            // InternalSock.g:1804:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getActorActorCrossReference_4_2_0()); 
            // InternalSock.g:1805:3: ( ruleEString )
            // InternalSock.g:1806:4: ruleEString
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
    // InternalSock.g:1817:1: rule__Resource__ActorAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ActorAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSock.g:1821:1: ( ( ( ruleEString ) ) )
            // InternalSock.g:1822:2: ( ( ruleEString ) )
            {
            // InternalSock.g:1822:2: ( ( ruleEString ) )
            // InternalSock.g:1823:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getActorActorCrossReference_4_3_1_0()); 
            // InternalSock.g:1824:3: ( ruleEString )
            // InternalSock.g:1825:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002008000L});

}