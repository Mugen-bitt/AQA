package Practic7.user_monitor;
//разработать систему для отслеживания уникальных посетителей сайта и хранить информацию о посещении.

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("155");
        userMonitor.addNewSession("155");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");
        userMonitor.addNewSession("133");

        userMonitor.printSessions();
    }
}