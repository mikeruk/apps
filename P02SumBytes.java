package tema10StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P02SumBytes {

    public static void main(String[] args) throws IOException {

        String path = "filepath\inputLineNumbers.txt";
        long sum = 0;
        for(byte value : Files.readAllBytes(Path.of(path))){
            if (value != 10 && value != 13){
                sum += value;
            }
        }

        System.out.println(sum);


    }
}
