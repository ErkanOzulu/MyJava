package day38_Inheritance.replitQuiz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Module {

    String name;
    ArrayList<File> files;

    public Module(String name) {
        this.name = name;
        this.files = new ArrayList<>();

    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void addFile(File file) {

        files.add(file);

    }


    public void removeFile(File file) {
        for (File file1 : files) {
            if (file.name.equals(file1.name)&&file.size==file1.size)
                files.removeIf(p -> p==file1);
        }



    }

    @Override
    public String toString() {
        return name + "\n"
                +
                "Files:\n" + files;
    }
}
