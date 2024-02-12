package Konular_Level2.Concurrency;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

public class AcquireLocks {
    public static void main(String[] args) throws ParseException, IOException {

        Path path = Paths.get("turtle.txt");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path entry : directoryStream)
                System.out.println(entry.getFileName());
        }
        /*
           *A. It compiles and runs without issue.
            B. The code will not compile because of line 2.
            C. The code will not compile because of line 3.
            D. It compiles but throws an InterruptedException at runtime.
           *E. It compiles but throws an IOException at runtime

         */
    }


}

