import java.util.ArrayList;
import java.util.List;
public class Game {
    public interface IDungeonBuilder {
        void setDungeonName(String name);
        void addRoom(Room room);
        void addNPC(NPC npc);
        Dungeon build();
    }


    public static class Dungeon {
        private String name;
        private List<Room> rooms;
        private List<NPC> npcs;

        public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
            this.name = name;
            this.rooms = rooms;
            this.npcs = npcs;
        }

        public String getName() {
            return name;
        }

        public List<Room> getRooms() {
            return rooms;
        }

        public List<NPC> getNpcs() {
            return npcs;
        }
    }


    public static class Room implements Cloneable {
        private String name;
        private String description;

        public Room(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Room cloneEntity() {
            try {
                return (Room) this.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public static class NPC implements Cloneable {
        private String name;
        private String description;

        public NPC(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public NPC cloneEntity() {
            try {
                return (NPC) this.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public static class SimpleDungeonBuilder implements IDungeonBuilder {
        private String dungeonName;
        private List<Room> rooms;
        private List<NPC> npcs;

        public SimpleDungeonBuilder() {
            rooms = new ArrayList<>();
            npcs = new ArrayList<>();
        }

        @Override
        public void setDungeonName(String name) {
            this.dungeonName = name;
        }

        @Override
        public void addRoom(Room room) {
            rooms.add(room);
        }

        @Override
        public void addNPC(NPC npc) {
            npcs.add(npc);
        }

        @Override
        public Dungeon build() {
            return new Dungeon(dungeonName, rooms, npcs);
        }
    }


    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        builder.setDungeonName("Old Cave");

        Room room1 = new Room("Entrance", "The dark entrance of the cave.");
        builder.addRoom(room1);

        Room room2 = room1.cloneEntity();
        room2.setName("Hallway");
        builder.addRoom(room2);

        NPC npc1 = new NPC("Goblin", "A sneaky little creature.");
        builder.addNPC(npc1);

        Dungeon dungeon = builder.build();

        System.out.println("Dungeon Name: " + dungeon.getName());
        for (Room room : dungeon.getRooms()) {
            System.out.println("Room: " + room.getName() + " - " + room.getDescription());
        }
        for (NPC npc : dungeon.getNpcs()) {
            System.out.println("NPC: " + npc.getName() + " - " + npc.getDescription());
        }
    }
}
