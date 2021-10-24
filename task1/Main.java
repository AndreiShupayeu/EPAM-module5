package by.epam.module5.task1;
//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Directory notebook = createDirectory();
        UI ui = new UI(notebook);

        ui.printDirectory();

        notebook.rename("My old notebook");

        notebook.deleteFiles();

        notebook.deleteDirectory();

    }

    public static Directory createDirectory() {
        TextFile textFile = new TextFile("Dima's address", "Minsk, Harkovskaya,80");
        TextFile textFile1 = new TextFile("Vova's address", "Minsk, Pushkina, 60");
        TextFile textFile2 = new TextFile("Lena's address", "Minsk, Krupskoy,44");
        TextFile textFile3 = new TextFile("Reminder 1", "Water the flowers");

        List<TextFile> address = new ArrayList<>();
        address.add(textFile);
        address.add(textFile1);
        address.add(textFile2);
        List<TextFile> reminder = new ArrayList<>();
        reminder.add(textFile3);
        File addresses = new File("Addresses", address);
        File reminders = new File("Reminders", reminder);
        List<File> notes = new ArrayList<>();
        notes.add(addresses);
        notes.add(reminders);
        return new Directory("My notebook", notes);
    }
}
