/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstategies;

/**
 *
 * @author andrew
 */
public class LineItem {
    
    private Product product;
    private String productId;
    private int qty;
    
    private Product[] productsDataBase = {
        new Product("Hammer", "HW1002", 19.99, null),
        new Product("BoxOfNails", "HW1003", 10.99, null),
        new Product("Chainsaw", "HW1004", 79.99, null)
            
    };
    
    public LineItem(String productId, int qty) {
        this.productId = productId;
        this.qty = qty;
        product = findProductById(productId);
    }
    
    private Product findProductById(String id) {
        Product product = null;
        
        for(Product p : productsDataBase) {
            if(id.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        return product;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
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
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
    
    
    
}
