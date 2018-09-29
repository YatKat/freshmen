import persistence.GroupDAO;
import persistence.ProfessorDAO;
import service.Group;
import service.Professor;
import service.Student;

/**
 * class start the programm (view layer in MVC pattern)
 */

public class Main {

    public static void main(String[] args) {
        Group group = new GroupDAO().formGroup();
        System.out.println("Студенти голосують за старосту групи.");
        for (int i = 0; i < group.getStudentList().size()-1; i++) {
            group.getStudentList().get(i).chooseCap(group);
            System.out.println("Студент "+group.getStudentList().get(i).getName()+" проголосував.");
        }
        int max = 0;
        for (Student student : group.getStudentList()) {
            if (student.getVoices() > max) {
                max = student.getVoices();
            }
        }
        for (Student student : group.getStudentList()) {
            if (student.getVoices() == max) {
                group.setCaptain(student.getName());
            }
        }
        System.out.println("Старостою групи обрали: " + group.getCaptain());
        System.out.println("_____________________________________________");
        Professor professor = new ProfessorDAO().formProfessorInfo();
        System.out.println("Професор "+professor.getName()+ " проводить перекличку.");
        professor.makeRollCall(group);
    }
}
