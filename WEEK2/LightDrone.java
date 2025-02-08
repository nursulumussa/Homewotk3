class LightDrone extends Drone {
    public LightDrone(String id, double cargoCapacity) {
        super(id, cargoCapacity);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 50; // Примерная скорость
    }
}
