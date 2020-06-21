import java.util.Scanner;

class Category {
    private int categoryId;
    private String categoryName;

    public Category() {
        categoryId = 0;
        categoryName = null;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

class Product {
    private int productId;
    private String productName;
    private double price;
    private Category categoryObj;

    public Product() {
        productId = 0;
        productName = null;
        price = 0;
        categoryObj = null;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategoryObj() {
        return categoryObj;
    }

    public void setCategoryObj(Category categoryObj) {
        this.categoryObj = categoryObj;
    }

    public void applyCoupon() {
        String temp = categoryObj.getCategoryName();

        if(temp.equals("Electronic"))
            price = price * 0.90;
        else if(temp.equals("Furniture"))
            price = price * 0.95;
        else if(temp.equals("Cosmetics"))
            price = price * 0.98;
    }
}

class LeeLee {
    public static void main(String[] args) {

        int productId, price, categoryId;
        String productName, categoryName;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product id:");
        productId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product name:");
        productName = sc.nextLine();
        System.out.println("Enter the price:");
        price = sc.nextInt();
        System.out.println("Enter the category id:");
        categoryId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the category name:");
        categoryName = sc.nextLine();

        Product product = new Product();
        Category category = new Category();

        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);

        category.setCategoryId(categoryId);
        category.setCategoryName(categoryName);
        product.setCategoryObj(category);
        product.applyCoupon();
        System.out.printf("You need to pay %.2f for the %s - %s", product.getPrice(), category.getCategoryName(), product.getProductName());
        
        sc.close();
    }
}