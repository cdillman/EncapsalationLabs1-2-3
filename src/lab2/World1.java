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
public class World1 extends GameBoard{
    private boolean pass = true;
    private final double maxPoints = 5;
    private double points;
    private double score = points/maxPoints;

    public double getScore() {
        return score;
    }
    
    public void world1(){
        question1();
        question2();
        question3();
        question4();
        question5();
    }
    public void question1(){
        String quest = JOptionPane.showInputDialog("4+4=");
        double answer = Double.parseDouble(quest);
        if(answer == 8){
            points++;
        }
        
    }
    public void question2(){
        String quest = JOptionPane.showInputDialog("4+4=");
        double answer = Double.parseDouble(quest);
        if(answer == 8){
            points++;
        }
    }
    public void question3(){
        String quest = JOptionPane.showInputDialog("4+4=");
        double answer = Double.parseDouble(quest);
        if(answer == 8){
            points++;
        }
    }
    public void question4(){
        String quest = JOptionPane.showInputDialog("3+3=");
        double answer = Double.parseDouble(quest);
        if(answer == 6){
            points++;
        }
    } 
    public void question5(){
        String quest = JOptionPane.showInputDialog("2*2=");
        double answer = Double.parseDouble(quest);
        if(answer == 4){
            points++;
        }
    }
    
    
    
    public static void main(String[] args) {
        World1 world = new World1();
        
        world.world1();
        System.out.println(world.getScore());
    }
}
