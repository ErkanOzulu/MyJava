package day38_Inheritance.replitQuiz;

public class Quiz {

    // Finish the Quiz class

    String topic;
    int totalQuestions;
    double totalPoints;

    public Quiz(String topic, int totalQuestions, double totalPoints) {
        this.topic = topic;
        this.totalQuestions = totalQuestions;
        this.totalPoints = totalPoints;
    }
    public  void takeQuiz(){
        System.out.println(topic);
    }

    @Override
    public String toString() {
        return "Quiz | " +
                 topic + " quiz with " +
                 totalQuestions +
                " questions for a total of " + totalPoints +
                " total points";
    }
}
