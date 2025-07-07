package Practic5.Task8;

class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Экспонат добавлен в музей.");
    }
    public void presentExhibit(){
        if (exhibit != null){
            exhibit.showHistory();
            exhibit.storageConditions();
        }else {
            System.out.println("В музее пока нет экспонатов.");
        }
    }
}
