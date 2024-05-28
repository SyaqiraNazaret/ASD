/**
 * DragonMain28
 */
public class DragonMain28 {
public static void main(String[] args) {
    Dragon28 dragon = new Dragon28(5, 5, 10, 10);
    dragon.printPosition(); 
    dragon.moveLeft();
    dragon.printPosition(); 
    dragon.moveRight();
    dragon.printPosition(); 
    dragon.moveUp();
    dragon.printPosition(); 
    dragon.moveDown();
}
}