import java.util.ArrayList;
import java.util.List;

class Player {
    private Room currentRoom;
    private List<Item> inventory;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.inventory = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public boolean move(String direction) {
        Room nextRoom = currentRoom.getAdjacentRoom(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public String listInventory() {
        return inventory.isEmpty() ? "Nothing" : inventory.toString();
    }
}
