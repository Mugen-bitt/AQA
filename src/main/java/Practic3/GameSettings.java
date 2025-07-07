package Practic3;

public class GameSettings {
    static int maxPlayers = 5;
    final String gameName;
    private int currentPlayers;

    //Консруктор для начального количества игроков
    public GameSettings(String getGameName, int currentPlayers){
        this.gameName = getGameName;
        this.currentPlayers = Math.min(currentPlayers, maxPlayers);
    }
    //Геттер для получения текущего количества игроков
    public int getCurrentPlayers(){
        return currentPlayers;
    }
    public static void setMaxPlayers(int newMax){
        maxPlayers = newMax;
    }
    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers = currentPlayers + 1;
            System.out.println("Добавлен игрок в " + gameName + ". Текущие игроки: " + currentPlayers);
        } else {
            System.out.println("Нельзя добавить игрока в " + gameName + ". Достигнут лимит: " + maxPlayers);
        }
    }
    public void printGameStatus(){
        System.out.println("Игра: " + gameName + ", Текущие игроки: " + currentPlayers + ", Максимум игроков: " + maxPlayers);
    }
    //Main
    public static void main(String[] args){
        GameSettings game1 = new GameSettings("CS2", 4);
        GameSettings game2 = new GameSettings("Fortnite", 5);
        game1.printGameStatus();
        game2.printGameStatus();

        GameSettings.setMaxPlayers(7);

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();
    }
}
