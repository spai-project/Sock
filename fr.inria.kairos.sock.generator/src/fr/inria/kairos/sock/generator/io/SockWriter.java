package fr.inria.kairos.sock.generator.io;

import java.io.FileWriter;
import java.io.IOException;

import fr.inria.kairos.sock.generator.model.IotSystem;

public class SockWriter {
	
	private final String outputPath;
	
	public static final String TSOCK_EXTENSION = ".tsock";
	
	public SockWriter(String outputPath) {
		this.outputPath = outputPath;
	}
	
	public void write(String fileName, IotSystem system) {
		try (FileWriter writer = new FileWriter(this.outputPath + "/" + fileName + TSOCK_EXTENSION, false)) {
			writer.write(system.toTSock());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
