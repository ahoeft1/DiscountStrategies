/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstategies;

/**
 *
 * @author andrew
 */
public class Product {
    private String productName;
    private String productId;
    private double cost;
    private DiscountStrategy discountStrategy;
    
    Product(String productName, String productId, double cost, DiscountStrategy discountStrategy) {
        this.productName = productName;
        this.productId = productId;
        this.cost = cost;
        this.discountStrategy = discountStrategy;
        
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the discountStrategy
     */
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * @param discountStrategy the discountStrategy to set
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
}
