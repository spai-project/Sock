package fr.inria.kairos.sock.dsl.example.butterfly.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IOUtils {
	
	public static String BASE_PATH_OUTPUT = "/Users/stephaniechallita/Desktop/runtime-EclipseApplication/";
	
	public static String PATH_OUTPUT = "";
	
	public static final String NEW_LINE = System.lineSeparator();
	
	public static int get(List<String> list, int offset, int index) {
		final int indexInList = (list.size() - offset) < 0 ? 0 : list.size() - offset;
		if (indexInList >= list.size()) {
			return list.isEmpty() ? 0 : Integer.parseInt(list.get(indexInList - 1).split(" ")[index]);
		}
		return list.isEmpty() ? 0 : Integer.parseInt(list.get(indexInList).split(" ")[index]);
	}
	
	public static List<String> readFile(String path) {
		try (BufferedReader reader = new BufferedReader(new FileReader(PATH_OUTPUT + path))) {
			return reader.lines().collect(Collectors.toList());
		} catch (Exception ignored) {
		}
		return Collections.emptyList();
	}
	
	public static void write(int time, int toBeWritten, String path) {
		write(time, toBeWritten + "" , path);
	}
	
	public static void write(int time, String toBeWritten, String path) {
		try (FileWriter writer = new FileWriter(new File(PATH_OUTPUT + path), true)) {
			writer.write(time + " " + toBeWritten + NEW_LINE);
		} catch (Exception ignored) {
		}
	}
	
}
