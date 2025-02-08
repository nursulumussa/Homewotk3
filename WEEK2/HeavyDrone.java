class HeavyDrone extends Drone {
    public HeavyDrone(String id, double cargoCapacity) {
        super(id, cargoCapacity);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 30; // Примерная скорость
    }
}
