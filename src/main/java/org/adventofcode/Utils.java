package org.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
}
