/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstategies;

/**
 *
 * @author ahoeft1
 */
public class Customer {
    private String customerName;
    private String customerNo;

    
    Customer (String customerNo, String customerName){
        this.customerNo = customerNo;
        this.customerName = customerName;
    }
    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerNo
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * @param customerNo the customerNo to set
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
    
    
}
