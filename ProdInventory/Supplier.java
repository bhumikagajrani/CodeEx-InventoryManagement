public class Supplier {
    //gives all details of a supplier
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private int id;

    public class Supplier(String name, String address, String phone, String email, String description, int id){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.id = id;
    }

    //getter and setter functions for supplier details
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }
    
    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setId(int id){
        this.id = id;
    }
}