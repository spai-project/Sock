/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.sock.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SockAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/inria/kairos/sock/parser/antlr/internal/InternalSock.tokens");
	}
}