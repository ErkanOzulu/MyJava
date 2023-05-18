package day38_Inheritance.replitQuiz;

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module>modules;

    public Canvas(String topic) {
        this.topic = topic;
        this.quizzes = new ArrayList<Quiz>();
        this.modules = new ArrayList<Module>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return  topic + " course\n" +
                "Quizzes:\n" + quizzes +
                "\nModules:\n" + modules ;
    }
}
