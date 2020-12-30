package by.jonline.grow.basicsofoop.exercise1;

import java.util.Objects;

public class File {

    private String fileName;
    private String extension;
    private Directory directory;

    public File(){

    }

    public File(String fileName, String extension, Directory directory) {
        this.fileName = fileName;
        this.extension = extension;
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(fileName, file.fileName) &&
                Objects.equals(extension, file.extension) &&
                Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, extension, directory);
    }

    @Override
    public String toString() {
        return  "name='" + fileName + '\'' +
                ", extension='" + extension + '\'' +
                ", directory=" + directory.getPath();
    }
}
