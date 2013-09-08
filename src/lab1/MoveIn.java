/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Corbin
 */
public class MoveIn extends Employee{
    private Employee employee;
    private String cubeId;
    
    public void moveIn(){
        employee.setMovedIn(true);
        this.cubeId = cubeId;
    }
    
}
