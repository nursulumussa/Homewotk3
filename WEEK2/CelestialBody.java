abstract class CelestialBody {
    protected String name;
    protected double coordinateX;
    protected double coordinateY;

    public CelestialBody(String name, double x, double y) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public double distanceTo(CelestialBody other) {
        double dx = this.coordinateX - other.coordinateX;
        double dy = this.coordinateY - other.coordinateY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String getName() {
        return name;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public abstract void showDetails();
}
