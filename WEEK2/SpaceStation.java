class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, double x, double y, int level) {
        super(name, x, y);
        this.stationLevel = level;
    }

    @Override
    public void showDetails() {
        System.out.println("Space Station: " + name + ", Level: " + stationLevel);
    }
}
