/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.sock.tests

import com.google.inject.Inject
import fr.inria.kairos.sock.dsl.model.sock.IotSystem
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(SockInjectorProvider)
class SockParsingTest {
	@Inject
	ParseHelper<IotSystem> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
