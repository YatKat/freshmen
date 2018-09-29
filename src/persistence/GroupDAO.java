package persistence;

import service.Group;
import service.Student;

import java.util.ArrayList;

public class GroupDAO {
    ArrayList<Student> groupList = new ArrayList<>();
    int count = (int)(Math.random()*10) + 1;

    /**
     * method return Group object with ArrayList of Student objects and initialized another fields.
     * @return
     */

    public Group formGroup(){
        count++;
        int groupNumber = (int)(Math.random()*10) + count;
        for (int i = 0; i < 26 ; i++) {
            groupList.add(new StudentDAO().formStudentInfo());
        }
        return new Group(groupNumber,groupList);
    }
}
