package Practic5.Task8;

public class Main {
    public static void main(String[] args){
        Museum museum = new Museum();
        museum.addExhibit(new Manuscript());
        museum.presentExhibit();

        museum.addExhibit(new Sculpture());
        museum.presentExhibit();
    }
}
