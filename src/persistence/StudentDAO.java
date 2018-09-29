package persistence;

import service.Student;

public class StudentDAO {
    int count = (int)(Math.random()*10) + 1;

    /**
     * method return Student object with initialized fields by random info.
     * it could be changed to take info from Database with select query.
     * @return
     */
    public Student formStudentInfo(){
        int id = (int)(Math.random()*(200 + 1)) +100;
        String name = "Steve"+count;
        int authorityLevel = (int)(Math.random()*10) + 1;
        boolean isAbsent;
        if(authorityLevel > 8) isAbsent = true;
        else isAbsent = false;
        return new Student(id, name, 0, authorityLevel, isAbsent);
    }
}
