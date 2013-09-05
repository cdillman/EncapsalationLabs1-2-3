/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Corbin
 */
public interface Person {
    
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getSsn();
    
    public abstract void setFirstName();
    public abstract void setLastName();
    public abstract void setSsn();
    public abstract void performOri();
    
}
