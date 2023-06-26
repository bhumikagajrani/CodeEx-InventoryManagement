package ProdInventory.codeex;
public class Product{
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String category;
    private String image;
    private int id;

    public Product(String name, double price, int quantity, String description, String category, String image, int id){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.category = category;
        this.image = image;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public String getImage(){
        return image;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setImage(String image){
        this.image = image;
    }

    public void setId(int id){
        this.id = id;
    }
}