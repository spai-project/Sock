package fr.inria.kairos.sock.generator.example.groovy;

public class DCMotorGroovy {
	
	public static final String DCMOTOR_GROOVY_SCRIPT = 
			"import fr.inria.kairos.sock.dsl.example.butterfly.DCMotor;\n" +
			"import fr.inria.kairos.sock.dsl.example.butterfly.utils.IOUtils;\n" +
			"IOUtils.PATH_OUTPUT = outputFolder;\n" +
			"DCMotor.instance.accelerate(time);\n";
	
	public static String getDCMotorGroovyScript() {
		return (DCMOTOR_GROOVY_SCRIPT).replace("\"","'");
	}
	
}
