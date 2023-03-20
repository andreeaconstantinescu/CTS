package singletone_registry.claseTema;

public class Main {

    public static void main(String[] args) {
        ExamRegistry examRegistry = ExamRegistry.getInstance();
        ExamRegistry.registerStudent("Ditanu");
        ExamRegistry.registerStudent("Ditanu");
        ExamRegistry.registerStudent("Alexandru");
        System.out.println(ExamRegistry.isRegistered("Alexandru"));
        System.out.println(ExamRegistry.getNumRegisteredStudents());
    }
}
