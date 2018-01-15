public class Ship extends Vehicle {


    private Boolean canTransportHazardousMaterials;

    public Ship(String name, int minSpeed, int maxSpeed) {
        super(name, minSpeed, maxSpeed);
    }

    public Boolean getCanTransportHazardousMaterials() {
        return canTransportHazardousMaterials;
    }
}
