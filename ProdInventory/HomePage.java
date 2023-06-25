public class HomePage {

    public static void main(String[] args) {
        
        InventoryManagement inventory = new InventoryManagement();

        Product product1 = new Product("Apple", 1.99, 100, "A red apple", "Fruit", "apple.jpg", 1);
        Product product2 = new Product("Banana", 0.99, 100, "A yellow banana", "Fruit", "banana.jpg", 2);
        Product product3 = new Product("Orange", 1.49, 100, "A juicy orange", "Fruit", "orange.jpg", 3);
        Product product4 = new Product("Pineapple", 2.99, 100, "A spiky pineapple", "Fruit", "pineapple.jpg", 4);
        Product product5 = new Product("Strawberry", 0.49, 100, "A sweet strawberry", "Fruit", "strawberry.jpg", 5);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        inventory.addProduct(product5);

        Supplier supplier1 = new Supplier("Apple Farm", "123 Apple Street", "123-456-7890", "applefarm@xyz.com, "A farm that grows apples", 1);

        inventory.addSupplier(supplier1);

        System.out.println("Products:");

        for(int i = 0; i < inventory.getProducts().size(); i++){
            System.out.println(inventory.getProducts().get(i).getName());
        }

        System.out.println("Suppliers:");

        for(int i = 0; i < inventory.getSuppliers().size(); i++){
            System.out.println(inventory.getSuppliers().get(i).getName());
        }

        System.out.println("Product 1: " + inventory.getProductById(1).getName());
        System.out.println("Supplier 1: " + inventory.getSupplierById(1).getName());

        inventory.removeProduct(product1);

        System.out.println("Products:");

        for(int i = 0; i < inventory.getProducts().size(); i++){
            System.out.println(inventory.getProducts().get(i).getName());
        }

        inventory.removeSupplier(supplier1);

        System.out.println("Suppliers:");

        for(int i = 0; i < inventory.getSuppliers().size(); i++){
            System.out.println(inventory.getSuppliers().get(i).getName());
        }

        inventory.updateProduct(product2);

        System.out.println("Products:");

        for(int i = 0; i < inventory.getProducts().size(); i++){
            System.out.println(inventory.getProducts().get(i).getName());
        }

        inventory.updateSupplier(supplier1);

        System.out.println("Suppliers:");

        for(int i = 0; i < inventory.getSuppliers().size(); i++){
            System.out.println(inventory.getSuppliers().get(i).getName());
        }

        System.out.println("Product 2: " + inventory.getProductById(2).getName());

        System.out.println("Supplier 1: " + inventory.getSupplierById(1).getName());

        product2.setName("Pear");

        inventory.updateProduct(product2);

        System.out.println("Product 2: " + inventory.getProductById(2).getName());

        System.out.println("Products:");

        for(int i = 0; i < inventory.getProducts().size(); i++){
            System.out.println(inventory.getProducts().get(i).getName());
        }

        supplier1.setName("Pear Farm");

        inventory.updateSupplier(supplier1);

        System.out.println("Supplier 1: " + inventory.getSupplierById(1).getName());

        System.out.println("Suppliers:");

        for(int i = 0; i < inventory.getSuppliers().size(); i++){
            System.out.println(inventory.getSuppliers().get(i).getName());
        }

        System.out.println("Product 2: " + inventory.getProductById(2).getName());

        System.out.println("Supplier 1: " + inventory.getSupplierById(1).getName());

    }
}