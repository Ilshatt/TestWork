
public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product);
        product.setClothes("shirt");
        System.out.println(product.getClothes());
        product.mayPurchases();
        System.out.println("-----------------");

        Product copy = (Product) CopyUtils.deepCopy(product);
        System.out.println(copy);
        System.out.println(copy.getClothes());
        copy.mayPurchases();
    }
}

