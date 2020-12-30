package by.jonline.grow.basicsofoop.exercise1;

import java.util.Objects;

public class TextFile extends File {


    private String title;
    private String text;

    {
        title = "";
        text = "";
    }

    private TextFile(String fileName, String extension, Directory directory) {
        super(fileName, extension, directory);
    }

    public static TextFile create(String fileName, Directory directory) {
        return new TextFile(fileName, ".txt", directory);
    }

    public void rename(String newFileName) {
        setFileName(newFileName);
    }

    public void delete() {
        setFileName(null);
        setDirectory(null);
        setExtension(null);
    }

    public void add(String sentence) {
        text += sentence;
    }

    public void out() {
        System.out.println("\t" + title);
        System.out.println(text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(title, textFile.title) &&
                Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, text);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString();
    }
}
