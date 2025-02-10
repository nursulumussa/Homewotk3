package managers;

import entities.Enemy;
import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    private List<Enemy> enemies = new ArrayList<>();

    public void spawnEnemy(String name, int health) {
        enemies.add(new Enemy(name, health));
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
