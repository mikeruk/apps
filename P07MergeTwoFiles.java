package tema10StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class P07MergeTwoFiles {

    public static void main(String[] args) throws IOException {

        String pathOne = "filepath\inputOne.txt";
        String pathTwo = "filepath\inputTwo.txt";
        String outputPath = "outputMerge.txt";

        PrintWriter writer = new PrintWriter(outputPath);
        Files.readAllLines(Path.of(pathOne))
                .forEach(writer::println);
        Files.readAllLines(Path.of(pathTwo))
                .forEach(writer::println);

        writer.close();
    }

}