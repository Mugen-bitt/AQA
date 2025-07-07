package Practic5.Task7;

class RollerCoaster extends Attraction {
    @Override
    void maintenance(){
        System.out.println("Американские горки требуют смазки и осмотра рельсов.");
    }
    @Override
    void safetyCheck(){
        System.out.println("Американские горки проходят регулярную проверку безопасности.");
    }
}
