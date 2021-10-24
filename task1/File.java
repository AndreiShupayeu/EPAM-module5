package by.epam.module5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class File {
    private String title;
    private List<TextFile> fileList= new ArrayList<>();

    public File(String title, List<TextFile> fileList) {
        this.title = title;
        this.fileList = fileList;
    }

    public File(String title) {
        this.title = title;
    }

    public File() {
    }

    public String getTitle() {
        return title;
    }

    public void rename(String title) {
        this.title = title;
    }

    public List<TextFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<TextFile> fileList) {
        this.fileList = fileList;
    }
    public void addTextFile(TextFile textFile){
        fileList.add(textFile);
    }
    public void deleteTextFiles(){
        fileList = null;
    }
    public void deleteFile(){
        title=null;
        fileList =null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return title.equals(file.title) && fileList.equals(file.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, fileList);
    }

    @Override
    public String toString() {
        return "File{" +
                "title='" + title + '\'' +
                ", fileList=" + fileList +
                '}';
    }
}


