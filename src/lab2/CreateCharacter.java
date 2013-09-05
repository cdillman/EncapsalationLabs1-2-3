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
public class CreateCharacter extends Character{
    
    private String name;
    private String race;
    private int pickRace;
    private String fightStyle;
    private int pickFightStyle;
    private final String orc = "orc";
    private final String elf = "elf";
    private final String zombie = "zombie";
    private final String human = "human";
    private final String mage = "Magical Powers";
    private final String archer = "Distance Fighter";
    private final String barbairian = "Hand to Hand Combat";
    private boolean goodName = false;
    private boolean goodRace = false;
    private boolean goodFight = false;
    

    
    public void buildCharacter(){
        
        setName();
        setRace();
        setFightStyle();
                
           
    }
    public String getName() {
        return name;
    }

    public void setName() {
//       while (goodName == false){
        name = JOptionPane.showInputDialog("Enter your characters name");
//       }
        if(name == null || name.length() == 0){
            
            System.out.println("name cannot be null or 0.");
            
        }
        else{
        this.name = name;
        
        }
        goodName=true;
        }

    public String getRace() {
        
        return race;
    }

    public void setRace() {
//        while(goodRace == false){
        String ask1 = JOptionPane.showInputDialog("PICK A RACE: 1 = ORC, 2 = ELF, 3 = ZOMBIE, 4 = HUMAN");
        pickRace = Integer.parseInt(ask1);
//        }
        
        if(pickRace < 1 || pickRace > 5){
            System.out.println("invalid race");
        }
        else if(pickRace == 1){
           this.race = orc;
           goodRace=true;
            
        }
        
        else if(pickRace == 2){
            this.race = elf;
            goodRace=true;
        }
        else if(pickRace == 3){
            this.race = zombie;
            goodRace=true;
        }
        else if(pickRace == 4){
            this.race = human;
            goodRace=true;
        }
        
        
    }

    public String getFightStyle() {
        return fightStyle;
    }

    public void setFightStyle() {
//        while(goodFight = false){
        String ask1 = JOptionPane.showInputDialog("PICK A FIGHTING STYLE: 1 = MAGE, 2 = ARCHER, 3 = BARBAIRIAN");
        pickFightStyle = Integer.parseInt(ask1);
//        }
        
        if(pickFightStyle < 1 || pickFightStyle > 3){
            System.out.println("Invalid Entery.");
        }
        else if (pickFightStyle == 1){
            this.fightStyle = mage;
            goodFight=true;
        }
        else if (pickFightStyle == 2){
            this.fightStyle = archer;
            goodFight=true;
        }
        else if (pickFightStyle == 3){
            this.fightStyle = barbairian;
            goodFight=true;
        }
        
    }
    
    
}
