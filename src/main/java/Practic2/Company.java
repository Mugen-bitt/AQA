package Practic2;

public class Company {
    static String companyName = "Mugen Corp";

    final int employeeID;

    private String employeeName;

    //Конструктор
    public Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = companyName;
    }
    //Статический метод
    public static void printCompanyName(){
        System.out.println("Компания: " + companyName);
    }
    //Геттер для получения имени сотрудника
    public String getEmployeeName(){
        return employeeName;
    }
    //Сеттер для изменения имени сотрудника
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    //Метод main
    public static void main(String[] args){
        Company employee1 = new Company(1, "Павел");
        Company employee2 = new Company(2, "Иван");

        Company.printCompanyName();
        Company.companyName = "Global Mugen Corp";
        Company.printCompanyName();

        System.out.println("Сотрудник: " + employee1.getEmployeeName() + ", ID: " + employee1.employeeID);
        System.out.println("Сотрудник: " + employee2.getEmployeeName() + ", ID: " + employee2.employeeID);

        employee1.setEmployeeName("Василий");
        System.out.println("Новый сотрудник 1: " + employee1.getEmployeeName());




    }



}
