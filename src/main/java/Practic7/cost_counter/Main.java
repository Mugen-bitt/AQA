package Practic7.cost_counter;
//Задача: разработать систему учета расходов в котором хранятся расходы по месяцам,
// иметь доступ к расходам и считать минимальный расход

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1,100.23);
        costCounter.addCosts(2,1092.23);
        costCounter.addCosts(3,2323.66);
        costCounter.addCosts(4,3323.66);
        costCounter.addCosts(5,103430.23);

        System.out.println(costCounter.getCosts(5));
        System.out.println(costCounter.minMinCostsMonth());
    }
}
