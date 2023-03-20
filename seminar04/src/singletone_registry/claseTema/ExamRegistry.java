package singletone_registry.claseTema;
import java.util.HashSet;
import java.util.Set;

public class ExamRegistry {
    private static Set<String> students;

    private static ExamRegistry instanta = null;

    public ExamRegistry() {
        students = new HashSet<>();
    }

    public static ExamRegistry getInstance() {
        if (instanta == null) {
            instanta = new ExamRegistry();
        }
        return instanta;
    }

    public static boolean registerStudent(String studentName) {
        if (students.contains(studentName)) {
            return false; // studentul exista deja in registrul examenului
        } else {
            students.add(studentName);
            return true; // studentul a fost inregistrat cu succes la examen
        }
    }

    public static void unregisterStudent(String studentName) {
        students.remove(studentName);
    }

    public static boolean isRegistered(String studentName) {
        return students.contains(studentName);
    }

    public static int getNumRegisteredStudents() {
        return students.size();
    }
}
