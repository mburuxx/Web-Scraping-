
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class EmptyFileDeleter {
 
    public static void deleteEmptyFiles(String dirName) throws IOException {
 
        if(!(Files.isDirectory(Paths.get(dirName)))) {
            throw new IOException("Not a directory");
        }
 
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirName));
 
        for (Path path : directoryStream) {
            if(!(Files.isDirectory(path)) && (Files.size(path) == 0)) {
                Files.delete(path);
            }
        }
    }
 
    public static void main(String[] args, String string) {
        try {
            deleteEmptyFiles(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}