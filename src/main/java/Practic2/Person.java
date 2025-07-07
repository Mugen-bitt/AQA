package Practic2;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    //Контруктор
    public Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    //Геттер для получения имени
    public String getFirstName(){
        return firstName;
    }
    //Геттер для получения фамилии
    public String getLastName(){
        return lastName;
    }
    //Геттер для получения ssn
    public String getSsn(){
        return ssn;
    }
    //Сеттер для изменения имени
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //Сеттер для изменения фамилии
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }
    public static void main(String[] args){
        Person person1 = new Person("Саша", "Иванов", "123-45-6789");
        Person person2 = new Person("Ваня", "Петров", "123-45-6790");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setFirstName("Алексей");
        person1.setLastName("Иванов");

        person1.printPersonInfo();
    }
}
