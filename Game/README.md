# Simple Game Project

##  Overview
This is a simple Java-based game that demonstrates the application of **SOLID principles** in game design. The project includes a player, enemies, an inventory system, and a level manager.

##  Technologies Used
- Java
- Object-Oriented Programming (OOP)
- SOLID Principles

##  Features
- **Combat System**: The player can attack enemies.
- **Inventory Management**: Players can add and use items.
- **Enemy Management**: Spawning and managing enemies.
- **Level System**: Players can gain experience and level up.

##  Project Structure
```
GameProject/
│── src/
│   ├── CombatHandler.java
│   ├── InventoryManager.java
│   ├── Entity.java
│   ├── Player.java
│   ├── Enemy.java
│   ├── EnemyManager.java
│   ├── ItemManager.java
│   ├── LevelManager.java
│   ├── Game.java
│── README.md
```

##  SOLID Principles Applied
- **Single Responsibility Principle (SRP)**: Each class has a distinct responsibility (e.g., `EnemyManager` manages enemies, `ItemManager` handles items).
- **Open/Closed Principle (OCP)**: New functionality can be added via interfaces without modifying existing code.
- **Liskov Substitution Principle (LSP)**: `Player` and `Enemy` both inherit from `Entity` and maintain expected behavior.
- **Interface Segregation Principle (ISP)**: Separate interfaces (`CombatHandler`, `InventoryManager`) prevent unused methods in classes.
- **Dependency Inversion Principle (DIP)**: The game depends on abstractions (`CombatHandler`, `InventoryManager`) rather than concrete implementations.

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/nursulumussa/Homework1.git
   ```
2. Navigate to the project folder:
   ```sh
   cd Homework1
   ```
3. Compile and run the game:
   ```sh
   javac src/*.java
   java src.Game
   ```

##  Future Improvements
- Add a graphical user interface (GUI).
- Implement enemy AI for smarter combat.
- Introduce saving and loading game progress.

##  License
This project is licensed under the MIT License.

