package managers;

public class LevelManager {
    private int level = 1;

    public void levelUp() {
        level++;
        System.out.println("Level Up! New Level: " + level);
    }
}
