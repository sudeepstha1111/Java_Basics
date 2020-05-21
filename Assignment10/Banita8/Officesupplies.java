public class Officesupplies {
    String computer;
    String monitors;
    String stationary;
    String furnitures;

    public Officesupplies(){
        super();
    }
    public Officesupplies(String computer,String monitors,String stationary, String furnitures){
        super();
        this.computer=computer;
        this.monitors=monitors;
        this.stationary=stationary;
        this.furnitures=furnitures;
    }
    public void getOfficesupplies(String supplies){
        System.out.println("your item is ready:" + supplies);
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getMonitors() {
        return monitors;
    }

    public void setMonitors(String monitors) {
        this.monitors = monitors;
    }

    public String getStationary() {
        return stationary;
    }

    public void setStationary(String stationary) {
        this.stationary = stationary;
    }

    public String getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(String furnitures) {
        this.furnitures = furnitures;
    }
    @Override
    public String toString(){
        return "Officesupplies [computer="+ computer+", monitor=" + monitors+", stationary=" + stationary+", furniture=" +furnitures+"]";

    }
}
