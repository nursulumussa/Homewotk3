package entities;

public abstract class Entity {
    protected String name;
    protected int health;

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
