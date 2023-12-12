import models.Student;

public class Main {
    public static void main(String[] args) {
        int[] marks1 = {85, 78, 92, 88, 90};
        int[] marks2 = {70, 65, 72, 68, 75};
        int[] marks3 = {95, 88, 90, 92, 87};

        Student student1 = new Student("Raghav", 18, marks1);
        Student student2 = new Student("Bob", 17, marks2);
        Student student3 = new Student("Charlie", 19, marks3);

        student1.displayResults();
        student2.displayResults();
        student3.displayResults();
    }
}
