/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstategies;

/**
 *
 * @author andrew
 */
public class NoDiscount implements DiscountStrategy {
    
    public double applyDiscount(){
        return 1;
    }
    
}
