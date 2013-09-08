/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Corbin
 */
public abstract class Game extends Gui{
    private Character character;
    private GameBoard world;
    
    public void runGame(){
        character.newOrLoad();
        world.game();
    }
}
