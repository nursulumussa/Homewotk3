class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
        this.assignedDrone = null;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.loadCargo(cargo.getWeight())) {
            this.assignedDrone = drone;
            drone.setStatus("IN_FLIGHT");
            return true;
        }
        return false;
    }

    public void startDelivery() {
        if (assignedDrone != null) {
            double distance = origin.distanceTo(destination);
            double time = assignedDrone.calculateFlightTime(distance);
            System.out.println("Delivery started. Estimated time: " + time + " hours.");
        } else {
            System.out.println("No drone assigned for delivery.");
        }
    }

    public void completeDelivery() {
        if (assignedDrone != null) {
            assignedDrone.unloadCargo();
            assignedDrone.setStatus("IDLE");
            System.out.println("Delivery completed.");
        } else {
            System.out.println("No drone assigned for delivery.");
        }
    }
}
