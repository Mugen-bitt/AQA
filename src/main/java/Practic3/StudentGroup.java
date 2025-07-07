package Practic3;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    //Конструктор
    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = Math.max(studentCount, 0);
    }
    //Геттер для получения названия группы
    public  String getGroupName(){
        return  groupName;
    }
    //Геттер для получения количества студентов
    public  int getStudentCount(){
        return studentCount;
    }
    //Сеттер для изменения названия группы
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    //Сеттер для изменения количества студентов
    public void setStudentCount(int studentCount){
        this.studentCount = Math.max(studentCount, 0);
    }
    //Метод printInfo для вывода инфы о группе
    public void printInfo(){
        System.out.println("Группа: " + groupName + ", Количество студентов: " + studentCount);
    }
    //Метод main
    public static void main(String[] args){
        StudentGroup studentGroup = new StudentGroup("QA", 25);
        studentGroup.printInfo();
        studentGroup.setStudentCount(70);
        studentGroup.printInfo();
    }





}
