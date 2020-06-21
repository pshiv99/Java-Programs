import java.util.Scanner;

class Shop {
    private String[] productName;
    private int[] productQuantity;
    private float[] productPrice;

    public Shop(String[] productName, int[] productQuantity, float[] productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String[] search(int searchQuantity) {
        int length = 0, j = 0;
        for(int i = 0; i<productName.length; i++) {
            if(this.productQuantity[i] == searchQuantity)
                length++;
        }
        String[] productDetails = new String[length];
        for(int i=0; i<productName.length; i++) {
            if(this.productQuantity[i] == searchQuantity) {
                productDetails[j] = productName[i] + ":" + productPrice[i];
                j++;
            }
        }
        return productDetails;
    }

    public String[] search(float searchPrice) {
        int length = 0, j = 0;
        for(int i = 0; i<productName.length; i++) {
            if(this.productPrice[i] == searchPrice)
                length++;
        }
        String[] productDetails = new String[length];
        for(int i=0; i<productName.length; i++) {
            if(this.productPrice[i] == searchPrice) {
                productDetails[j] = productName[i] + ":" + productQuantity[i];
                j++;
            }
        }
        return productDetails;
    }

    public String[] search() {
        int length = 0, j = 0;
        for(int i = 0; i<productName.length; i++) {
            if(this.productQuantity[i] < 10)
                length++;
        }
        String[] productDetails = new String[length];
        for(int i=0; i<productName.length; i++) {
            if(this.productQuantity[i] < 10) {
                productDetails[j] = productName[i];
                j++;
            }
        }
        return productDetails;
    }
}

class DepartmentalStore {
    public static void main(String[] args) {
        int noOfProducts, searchQuantity;
        String[] productName, resultProductDetail;
        float[] productPrice; 
        int[] productQuantity;
        float searchPrice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        noOfProducts = sc.nextInt();

        productName = new String[noOfProducts];
        productPrice = new float[noOfProducts];
        productQuantity = new int[noOfProducts];

        sc.nextLine();
        System.out.println("Enter product names:");
        for(int i=0; i<noOfProducts; i++)
            productName[i] = sc.nextLine();
        System.out.println("Enter the price of each product:");
        for(int i=0; i<noOfProducts; i++)
            productPrice[i] = sc.nextFloat();
        System.out.println("Enter the quantity of each product:");
        for(int i=0; i<noOfProducts; i++)
            productQuantity[i] = sc.nextInt();

        System.out.println("Enter the product price to be searched:");
        searchPrice = sc.nextFloat();
        System.out.println("Enter the product quantity to be searched:");
        searchQuantity = sc.nextInt();

        Shop store = new Shop(productName, productQuantity, productPrice);

        System.out.print("Search based on price");
        resultProductDetail = store.search(searchPrice);
        for(String i : resultProductDetail)
            System.out.print("\n" + i);

        System.out.print("\nSearch based on quantity");
        resultProductDetail = store.search(searchQuantity);
        for(String i : resultProductDetail)
            System.out.print("\n" + i);

        System.out.print("\nProducts below re-ordered level");
        resultProductDetail = store.search();
        for(String i : resultProductDetail)
            System.out.print("\n" + i);
        
        sc.close();
    }
}