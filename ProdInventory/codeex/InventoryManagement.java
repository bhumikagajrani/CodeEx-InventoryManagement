package ProdInventory.codeex;
import java.util.*;

public class InventoryManagement {
    private List<Product> products;
    private List<Supplier> suppliers;
    
    public InventoryManagement(){
        products = new ArrayList<Product>();
        suppliers = new ArrayList<Supplier>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void addSupplier(Supplier supplier){
        suppliers.add(supplier);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void removeSupplier(Supplier supplier){
        suppliers.remove(supplier);
    }

    public void updateProduct(Product product){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == product.getId()){
                products.set(i, product);
                break;
            }
        }
    }

    public boolean isProductAvailable(Product product)
    {
        //checks if the product is available or out of stock
        return product!=null && product.getQuantity()>0; 
        
    }

    public void updateSupplier(Supplier supplier){
        for(int i = 0; i < suppliers.size(); i++){
            if(suppliers.get(i).getId() == supplier.getId()){
                suppliers.set(i, supplier);
                break;
            }
        }
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Supplier> getSuppliers(){
        return suppliers;
    }

    public Product getProductById(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                return products.get(i);
            }
        }
        return null;
    }

    public Supplier getSupplierById(int id){
        for(int i = 0; i < suppliers.size(); i++){
            if(suppliers.get(i).getId() == id){
                return suppliers.get(i);
            }
        }
        return null;
    }

    public List<Product> getProductsByCategory(String category){
        List<Product> productsByCategory = new ArrayList<Product>();
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getCategory().equals(category)){
                productsByCategory.add(products.get(i));
            }
        }
        return productsByCategory;
    }

    public List<Product> getProductsBySupplier(int supplierId){
        List<Product> productsBySupplier = new ArrayList<Product>();
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getSupplierId() == supplierId){
                productsBySupplier.add(products.get(i));
            }
        }
        return productsBySupplier;
    }

    public List<Product> getProductsByCategoryAndSupplier(String category, int supplierId){
        List<Product> productsByCategoryAndSupplier = new ArrayList<Product>();
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getCategory().equals(category) && products.get(i).getSupplierId() == supplierId){
                productsByCategoryAndSupplier.add(products.get(i));
            }
        }
        return productsByCategoryAndSupplier;
    }
}