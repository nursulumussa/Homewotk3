abstract class Drone {
    protected String id;
    protected String status;
    protected double cargoCapacity;
    protected double currentCargoWeight;

    public Drone(String id, double cargoCapacity) {
        this.id = id;
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
        this.status = "IDLE";
    }

    public boolean loadCargo(double weight) {
        if (currentCargoWeight + weight <= cargoCapacity) {
            currentCargoWeight += weight;
            return true;
        }
        return false;
    }

    public void unloadCargo() {
        currentCargoWeight = 0;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public abstract double calculateFlightTime(double distance);
}
