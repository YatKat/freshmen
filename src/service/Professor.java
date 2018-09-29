package service;

public class Professor {
    int idCard;
    String name;
    String Subject;

    public Professor(int idCard, String name, String subject) {
        this.idCard = idCard;
        this.name = name;
        Subject = subject;
    }

    public String getName() {
        return name;
    }

    /**
     * method print to the console list of absent students from the given group
     * @param group
     */
    public void makeRollCall (Group group){
        System.out.println("В групі № "+group.number+" відсутні наступні студенти: ");
        for (Student student: group.studentList) {
           if (student.isAbsent){
               System.out.println(student.idCard +" "+student.name);
           }
        }
    }
}
