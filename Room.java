import java.util.HashMap;
import java.util.Map;

class Room {
    private String description;
    private Map<String, Room> adjacentRooms;
    private Map<String, Item> items;

    public Room(String description) {
        this.description = description;
        this.adjacentRooms = new HashMap<>();
        this.items = new HashMap<>();
    }

    public void setAdjacentRoom(String direction, Room room) {
        adjacentRooms.put(direction, room);
    }

    public Room getAdjacentRoom(String direction) {
        return adjacentRooms.get(direction);
    }

    public String getDescription() {
        return description;
    }

    public void addItem(Item item) {
        items.put(item.getName(), item);
    }

    public Item getItem(String name) {
        return items.get(name);
    }

    public void removeItem(Item item) {
        items.remove(item.getName());
    }

    public String listItems() {
        return items.isEmpty() ? "None" : String.join(", ", items.keySet());
    }
}
