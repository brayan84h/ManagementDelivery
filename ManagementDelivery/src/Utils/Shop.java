package Utils;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public String nameshop;
    public String category;
    public List<Product> menu;

    public Shop(String nameshop, String category) {
        this.nameshop = nameshop;
        this.category = category;
        this.menu = new ArrayList<Product>();
    }

    public void addmenu(Product product){
        this.menu.add(product);
    }

    public void show_menu(){
        System.out.println("\n\tMENU DE "+this.nameshop);
        for (Product s: menu) {
            s.printline();
        }
    }

    public void printline(){
        System.out.println("- "+this.nameshop+"\t\t\t"+this.category);

    }

}
