package Practic3;

public class Teacher {
    private String name;
    private String subject;

    //Конструктор
    public  Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    //Геттер для получения имени
    public  String getName(){
        return name;
    }
    //Геттер для поучения предмета
    public String getSubject(){
        return subject;
    }
    //Сеттер для изменения имени
    public  void setName(String namr){
        this.name = name;
    }
    //Сеттер для изменения предмета
    public void setSubject(String subject){
        this.subject = subject;
    }
    //Метод printInfo для вывода инфы препод
    public void printInfo(){
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }
    //метод main
    public static void main(String[] args){
        Teacher teacher = new Teacher("Анна Ивановна", "Математика");
        teacher.printInfo();
        teacher.setSubject("Биологию");
        teacher.printInfo();
    }


}
