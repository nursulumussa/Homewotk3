public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("A dark cave with dim light.");
        Room room2 = new Room("A bright open field.");
        room1.setAdjacentRoom("forward", room2);

        Item sword = new Item("sword");
        room1.addItem(sword);

        Player player = new Player(room1);
        MUDController controller = new MUDController(player);
        controller.runGameLoop();
    }
}
