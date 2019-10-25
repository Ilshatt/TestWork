import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {

    private String clothes;
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
    public String getClothes() {
        return clothes;
    }

public void mayPurchases(){
        ArrayList<String> products = new ArrayList<>();
    products.add("Milk");
    products.add("Apple");
    products.add("bread");
    products.add("rice");
    for (String purchases : products){
        System.out.println(purchases);
    }
}


}
