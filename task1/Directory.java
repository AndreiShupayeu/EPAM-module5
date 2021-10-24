package by.epam.module5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private String title;
    private List<File> fileList = new ArrayList<>();

    public Directory(String title, List<File> fileList) {
        this.title = title;
        this.fileList = fileList;
    }

    public Directory(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void rename(String title) {
        this.title = title;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public void deleteDirectory() {
        title = null;
        fileList = null;
    }

    public void deleteFiles() {
        fileList = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(title, directory.title) && Objects.equals(fileList, directory.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, fileList);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "title='" + title + '\'' +
                ", fileList=" + fileList +
                '}';
    }
}
