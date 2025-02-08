class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, double x, double y, String atmosphereType) {
        super(name, x, y);
        this.atmosphereType = atmosphereType;
    }

    @Override
    public void showDetails() {
        System.out.println("Planet: " + name + ", Atmosphere: " + atmosphereType);
    }
}
