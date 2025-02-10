import entities.Player;
import entities.Enemy;
import managers.EnemyManager;
import managers.ItemManager;
import managers.LevelManager;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        EnemyManager enemyManager = new EnemyManager();
        enemyManager.spawnEnemy("Goblin", 30);

        ItemManager itemManager = new ItemManager();
        itemManager.addItem("Health Potion");

        LevelManager levelManager = new LevelManager();

        // Simulating game events
        player.addItem("Health Potion");
        player.useItem("Health Potion");

        for (Enemy enemy : enemyManager.getEnemies()) {
            player.attack(enemy);
        }

        player.gainExperience(50);
        levelManager.levelUp();
    }
}
