/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstategies;

/**
 *
 * @author andrew
 */
public class Receipt {
    Customer customer;
    LineItem[] lineItems = new LineItem[1];
    private int i; //counter used in array manipulation.
    private double subTotal;
    private double total;
    private double discountSubTotal;
    private double moneySaved;
    
     public Customer[] customerDataBase = {
        new Customer("101", "Big Bob"),
        new Customer("102", "McHammer"),
        new Customer("103", "Big Bird")
            
    };
     
     
     private Customer findCustomerById(String id) {
        Customer customer = null;
        
        for(Customer c : customerDataBase) {
            if(id.equals(c.getCustomerNo())) {
                customer = c;
                break;
            }
        }
        return customer;
    }
     
    public void startNewSale(String customerNo){
       customer = findCustomerById(customerNo);
        
    }
    
    
    public void addNewLineItem(String productId, double qty) {
        
        LineItem lineItem = new LineItem(productId, qty);
        
        i++;
        lineItems = (LineItem[])resizeArray(lineItems, i);
        
        lineItems[i-1] = lineItem;
        subTotal = (lineItems[i-1].getQty() * lineItems[i-1].getProduct().getCost());
        discountSubTotal = subTotal * (lineItems[i-1].getProduct().getDiscountStrategy().applyDiscount());
        moneySaved = (subTotal - discountSubTotal) + moneySaved;
        total = discountSubTotal + total;
        
        //Okay, there's probably a better way to do this but atleast this is start.  What it does: takes the qty and multiplies it by the cost.  Then it multiplies that number by the discount.  Then it adds all this to the running subtotal.
    }
    public void displayReceipt(){
        System.out.println("Thank you " + customer.getCustomerName() + " for shopping today!");
        for (int j = 0; j<lineItems.length; j++)
            System.out.println(lineItems[j]);
        System.out.println("Your total comes to " + total);
        System.out.println("You saved " + moneySaved);
    }
     private static Object resizeArray (Object oldArray, int newSize) {
      int oldSize = java.lang.reflect.Array.getLength(oldArray);
      Class elementType = oldArray.getClass().getComponentType();
      Object newArray = java.lang.reflect.Array.newInstance(
         elementType,newSize);
      int preserveLength = Math.min(oldSize,newSize);
      if (preserveLength > 0)
         System.arraycopy (oldArray,0,newArray,0,preserveLength);
      return newArray; }
  

}
