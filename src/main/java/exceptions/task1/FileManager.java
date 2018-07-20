package exceptions.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileManager {

    Path path;

    public FileManager(Path path) {
        this.path = path;
    }

    public FileManager() {
        this.path = Paths.get("e:\\");
    }

    public void changeDiretory(String path){
        this.path = Paths.get(path);
    }

    public void moveTo(String file){
        this.path = Paths.get(path + File.separator + file);
    }

    public void moveBack(String file){
        this.path = path.getParent();
    }

    public String getDirectory(){
        return path.toString();
    }

    public void listFiles() throws NotDirectoryException {
        if (!Files.isDirectory(path))
            throw new NotDirectoryException("Unable operation for NotDirectory object");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path file: stream)
                System.out.println(file.getFileName());
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
    }

    public void addFile(String file){
        try {
            Files.createFile(Paths.get(path + File.separator + file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String text) throws NotFileException {
        if (Files.isDirectory(path))
            throw new NotFileException("Unable operation for NotFile object");
        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(text);
        } catch (IOException e){
            e.printStackTrace();
        }
    }



}
