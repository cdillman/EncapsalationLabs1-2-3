/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Corbin
 */
public class ReviewDepart extends Employee{
    private Employee employee;
    
    public void Review(){
        employee.setReviewedDeptPolicies(true);
    }
    
}
