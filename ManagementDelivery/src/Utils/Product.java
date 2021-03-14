package Utils;

public class Product {

    public String nameproduct;
    public String descrip;
    public double price;

    public Product(String nameproduct, String descrip, double price) {
        this.nameproduct = nameproduct;
        this.descrip = descrip;
        this.price = price;
    }

    public void printline(){
        System.out.println("- "+this.nameproduct+"\t\t\t"+this.descrip+"\t\t\t"+String.valueOf(this.price));
    }
}
