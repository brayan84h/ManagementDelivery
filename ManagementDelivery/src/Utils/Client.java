package Utils;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public String nameclient;
    public String location;
    public List<Product> carrito;

    public Client(String nameclient, String location) {
        this.nameclient = nameclient;
        this.location = location;
        this.carrito = new ArrayList<Product>();
    }

    public void aggcarrito(Product product){
        this.carrito.add(product);
    }

    public void removeproduc(Product product){
        this.carrito.remove(product);
    }

    public void show_car(int numco){
        int pricedelivery =70;
        double subtotal=0;
        double totalpagar;
        System.out.println("\n\tCARRITO DE "+this.nameclient);
        System.out.println("\nPRODUCTO\t\t\t DESCRIPCION\t\t\tPRECIO");
        for (Product p: carrito) {
            p.printline();
            subtotal=subtotal+p.price;
        }
        totalpagar=subtotal+(pricedelivery*numco);

        System.out.println("\n\tTOTAL A PAGAR POR EL SERVICIO ES: "+totalpagar);
    }
}
