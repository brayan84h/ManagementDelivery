package Utils;

import java.util.ArrayList;
import java.util.List;

public class JavaDelivery {

    public List<Shop> catalogue;

    public JavaDelivery(){
        this.catalogue = new ArrayList<Shop>();
    }

    public void addshop(Shop shop){
        this.catalogue.add(shop);
    }

    public void show_category() {
        System.out.println("\t CATEGORIAS DE COMERCIOS");
        System.out.println(" - Pizza");
        System.out.println(" - Comida Rapida");
        System.out.println(" - Hamburguesas");
    }

    public void search(String categoria){
        System.out.println("\n\tFILTRO DE BUSQUEDA\nCategoria Ingresada: "+categoria);
        System.out.println("NOMBRE DEL COMERCIO \t\t\t CATEGORIA");
        int z=0;
        for (Shop shop : catalogue) {
            if (shop.category.compareToIgnoreCase(categoria) == 0) {
                shop.printline();
            } else {
                z = 1;
            }
        }
        if (z==1){
            System.out.println("NO EXISTE LA CATEGORIA INGRESADA");
        }
    }

    public void show_shops(){
        for (Shop s: catalogue) {
            s.printline();
        }
    }

    public void saludo(){
        System.out.println("Bienvenido esto es un servicio de delivery donde puedes \nencontrar diversidas de comercios de comida\n");
    }
}
