package Practic6.Task7;

public class Park {
    private Attraction attraction;

    public void addAttraction(Attraction attraction){
        this.attraction = attraction;
        System.out.println("Аттракцион добавлен в парк.");
    }
    public void serviceAttraction(){
        if (attraction != null){
            attraction.maintenance();
        }else {
            System.out.println("В парке пока нет аттракционов.");
        }
    }
    public void checkAttraction(){
        if (attraction != null){
            attraction.safetyCheck();
        }else {
            System.out.println("В парке пока нет аттракционов.");
        }
    }
}
