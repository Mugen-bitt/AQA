package Practic5.Task7;

class Carousel extends Attraction {
    @Override
    void maintenance(){
        System.out.println("Карусель требует частого технического обслуживания.");
    }
    @Override
    void safetyCheck(){
        System.out.println("Карусель проходит визуальный осмотр и тестовый запуск.");
    }
}
