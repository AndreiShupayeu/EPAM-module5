package by.epam.module5.task1;

public class UI {
    private final Directory directory;

    public UI(Directory directory) {
        this.directory = directory;
    }

    public void printDirectory() {

        System.out.println("Directory: "+directory.getTitle());
        for (File file : directory.getFileList()) {
            System.out.println("File: "+file.getTitle());
            System.out.println(file.getFileList());

        }
    }
}