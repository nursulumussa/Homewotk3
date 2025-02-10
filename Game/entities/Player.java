package entities;

import interfaces.CombatHandler;
import interfaces.InventoryManager;
import java.util.ArrayList;
import java.util.List;

public class Player extends Entity implements CombatHandler, InventoryManager {
    private int experience;
    private List<String> inventory = new ArrayList<>();

    public Player(String name) {
        super(name, 100);
        this.experience = 0;
    }

    @Override
    public void attack(Entity target) {
        if (target instanceof Enemy) {
            target.takeDamage(10);
            System.out.println(name + " attacks " + target.getName() + " for 10 damage!");
        }
    }

    @Override
    public void addItem(String item) {
        inventory.add(item);
        System.out.println(item + " added to inventory.");
    }

    @Override
    public void useItem(String item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
            System.out.println(name + " used " + item);
        } else {
            System.out.println(name + " does not have " + item);
        }
    }

    public void gainExperience(int amount) {
        experience += amount;
        System.out.println(name + " gained " + amount + " XP!");
    }
}
