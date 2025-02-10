package managers;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<String> availableItems = new ArrayList<>();

    public void addItem(String item) {
        availableItems.add(item);
    }

    public boolean isItemAvailable(String item) {
        return availableItems.contains(item);
    }
}
