package persistence;

import service.Professor;

import java.util.ArrayList;

public class ProfessorDAO {
    int count = (int)(Math.random()*10) + 1;;

    public Professor formProfessorInfo(){
        count++;
        int idCard = (int)(Math.random()*(200 + 1)) +100;
        String name = "Mark" + count;
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Law");
        subjects.add("History");
        subjects.add("Computer Science");
        subjects.add("Philosophy");
        subjects.add("Phsyhology");
        subjects.add("Geography");
        subjects.add("Programming Java");
        subjects.add("Health Care");
        subjects.add("Philology");
        String subject = subjects.get((int)Math.random()*10);
        return new Professor(idCard, name, subject);
    }
}
