package org.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Utils {

    private Utils() {

    }

    public static String readFile(String inputPath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(inputPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static String readFileFromLine(String inputPath, int lineNumber) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(inputPath)).skip(lineNumber)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch(IOException e){
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
