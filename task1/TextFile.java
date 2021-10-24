package by.epam.module5.task1;

import java.util.Objects;

public class TextFile {
    private String title;
    private String text;

    public TextFile(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public TextFile(String title) {
        this.title = title;
    }

    public TextFile() {
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void renameText(String title) {
        this.title = title;
    }

    public void createText(String text) {
        this.text = text;
    }

    public void addText(String additionalText) {
        this.text += " " + additionalText;
    }
    public void deleteText(){
        text = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(title, textFile.title) && Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

