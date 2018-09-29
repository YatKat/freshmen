package service;

import java.util.Collections;

public class Student {
    int idCard;
    String name;
    int voices;
    int authorityLevel;
    boolean isCaptain;
    boolean isAbsent;

    public int getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public int getVoices() {
        return voices;
    }

    public int getAuthorityLevel() {
        return authorityLevel;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    public Student(int idCard, String name, int voices, int authorityLevel, boolean isAbsent) {
        this.idCard = idCard;
        this.name = name;
        this.voices = voices;
        this.authorityLevel = authorityLevel;
        this.isAbsent = isAbsent;
    }

    /**
     * method choose the captain of group from given group by comparing the authority level
     * of students with random choosing from the 4 students with the highest level of authority
     * and give +1 to field voice of chosen student.
     * @param group
     */
    public void chooseCap(Group group){
        Collections.sort(group.studentList, (student1, student2) -> {
            if(student1.authorityLevel > student2.authorityLevel) return 1;
            else if (student1.authorityLevel < student2.authorityLevel) return -1;
            else return 0;
        });
        int randomNumber = (int)(Math.random()*2) + 1;
        group.studentList.get(group.studentList.size()- randomNumber).voices = voices+1;
    }
}
