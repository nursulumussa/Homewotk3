public class Main {
    public static void main(String[] args) {
        CelestialBody earth = new Planet("Earth", 0, 0, "Oxygen-rich");
        CelestialBody mars = new Planet("Mars", 100, 200, "CO2-rich");

        Drone lightDrone = new LightDrone("LD-01", 50);
        Drone heavyDrone = new HeavyDrone("HD-01", 200);

        Cargo cargo = new Cargo(30, "Food Supplies");

        DeliveryTask task = new DeliveryTask(earth, mars, cargo);
        if (task.assignDrone(lightDrone)) {
            task.startDelivery();
            task.completeDelivery();
        } else {
            System.out.println("Drone cannot carry this cargo.");
        }
    }
}
