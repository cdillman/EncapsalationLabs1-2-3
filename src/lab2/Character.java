/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import javax.swing.JOptionPane;
/**
 *
 * @author Corbin
 */
public  class Character extends Game{
    private CreateCharacter create;
    private LoadCharacter load;
    
    

    public void newOrLoad(){
       String det = JOptionPane.showInputDialog("NEW GAME = NEW, LOAD GAME = LOAD");
       if(det == null || det.length() == 0){
           System.out.println("invalid entery");
           newOrLoad();
       }
       else {
           if(det == "new" || det == "NEW"){
               setNewCharacter();
           }
           else if(det == "load" || det == "LOAD"){
               setLoadCharacter();
           }
               
       }
    }

    public void setNewCharacter() {
        create.buildCharacter();
    }

    

    public void setLoadCharacter() {
        load.loadCharacter();
    }
    
    
    public static void main(String[] args) {
        Character cha = new Character();
        
    }
}
