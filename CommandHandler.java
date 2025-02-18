class CommandHandler {
    private final Player player;
    private final MUDController controller;

    public CommandHandler(Player player, MUDController controller) {
        this.player = player;
        this.controller = controller;
    }

    public void handleInput(String input) {
        String[] parts = input.split(" ", 2);
        String command = parts[0];
        String argument = parts.length > 1 ? parts[1] : "";

        switch (command) {
            case "look":
                lookAround();
                break;
            case "move":
                move(argument);
                break;
            case "pick":
                if (argument.startsWith("up ")) {
                    pickUp(argument.substring(3));
                } else {
                    System.out.println("Invalid pick up command. Use: 'pick up <item name>'");
                }
                break;
            case "inventory":
                checkInventory();
                break;
            case "help":
                showHelp();
                break;
            case "quit":
            case "exit":
                controller.stopGame();
                break;
            default:
                System.out.println("Unknown command. Type 'help' for a list of commands.");
        }
    }

    private void lookAround() {
        Room currentRoom = player.getCurrentRoom();
        System.out.println(currentRoom.getDescription());
        System.out.println("Items here: " + currentRoom.listItems());
    }

    private void move(String direction) {
        if (player.move(direction)) {
            lookAround();
        } else {
            System.out.println("You can't go that way!");
        }
    }

    private void pickUp(String itemName) {
        Room currentRoom = player.getCurrentRoom();
        Item item = currentRoom.getItem(itemName);
        if (item != null) {
            player.addItem(item);
            currentRoom.removeItem(item);
            System.out.println("You picked up the " + itemName + ".");
        } else {
            System.out.println("No item named '" + itemName + "' here!");
        }
    }

    private void checkInventory() {
        System.out.println("You are carrying: " + player.listInventory());
    }

    private void showHelp() {
        System.out.println("Available commands:");
        System.out.println("look - Describe the current room");
        System.out.println("move <forward|back|left|right> - Move in a direction");
        System.out.println("pick up <itemName> - Pick up an item");
        System.out.println("inventory - Show inventory");
        System.out.println("help - Show available commands");
        System.out.println("quit/exit - End the game");
    }
}
