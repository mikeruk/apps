package tema10StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class P08GetFolderSize {

    public static void main(String[] args) {

        String path = "filepath\Exercises Resources";
        File folder = new File(path);

        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);

    }
}
