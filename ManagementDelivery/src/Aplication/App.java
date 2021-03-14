package Aplication;

import Utils.Client;
import Utils.JavaDelivery;
import Utils.Product;
import Utils.Shop;

public class App {
    public static void main(String[] args) {
        //Creacion de JavaDelivery
        JavaDelivery javaDelivery = new JavaDelivery();

        javaDelivery.saludo();

        //Creacion de los comercios
        Shop shop1 = new Shop("Pizza Hut", "Pizza");
        Shop shop2 = new Shop("Dennys", "Comida Rapida");
        Shop shop3 = new Shop("Wendy's", "Hamburguesas");
        Shop shop4 = new Shop("McDonald's", "Hamburguesas");
        Shop shop5 = new Shop("Little Caesars", "Pizza");
        Shop shop6 = new Shop("La Esquina Italiana", "Pizza");
        Shop shop7 = new Shop("Coco Baleadas", "Comida Rapida");
        Shop shop8 = new Shop("KFC", "Comida Rapida");
        Shop shop9 = new Shop("Popeyes", "Comida Rapida");
        Shop shop10 = new Shop("Matambritas", "Comida Rapida");

        //Agregar ala catalogo de JavaDelivery
        javaDelivery.addshop(shop1);
        javaDelivery.addshop(shop2);
        javaDelivery.addshop(shop3);
        javaDelivery.addshop(shop4);
        javaDelivery.addshop(shop5);
        javaDelivery.addshop(shop6);
        javaDelivery.addshop(shop7);
        javaDelivery.addshop(shop8);
        javaDelivery.addshop(shop9);
        javaDelivery.addshop(shop10);

        //Mostrando las categorias
        javaDelivery.show_category();

        //Creacion de Productos
        Product product1 = new Product("Baleadas Sencillas", "Dos baleadas", 32.5);
        Product product2 = new Product("Gringas Sencillas", "Una orden de dos gringas", 60.50);
        Product product3 = new Product("Flauta", "Flauta de harina con quesillo", 115.99);
        Product product4 = new Product("4 Estanciones Suprema", "Pizza Gigante con 4 sabores", 199.9);
        Product product5 = new Product("Pizza Mia", "Pizza de peperoni", 99.99);
        Product product6 = new Product("Alitas hut", "6 alitas con salsa", 150);
        Product product7 = new Product("PIzzaChesse", "PIzza con orilla de queso", 136.50);
        Product product8 = new Product("Calzone", "Un calzone de queso con carne", 100.32);
        Product product9 = new Product("Deditos de Queso", "8 deditos con salsa", 95.99);
        Product product10 = new Product("Tambo Sumpremo", "30 piezas de pollo", 400.99);
        Product product11 = new Product("Camarones Empanizados", "10 Camaraones empanizados", 139.99);
        Product product12 = new Product("Hamburguesa Sencilla", "Combo de papas y refresco", 100);
        Product product13 = new Product("Bacon", "Combo de 2 hamburguesas,pasp y refresco", 196.99);
        Product product14 = new Product("Chuleta's", "Combo de 4 chuletas,con plato de comida", 636.99);
        Product product15 = new Product("Costilla de Res", "Con salsa Barbacoa", 600.99);
        Product product16 = new Product("Plato Tipico", "Comida tipica 'Burritas'", 100);
        Product product17 = new Product("Desayuno", "Desayuno con Cafe", 100);
        Product product18 = new Product("Asado", "Combo de 5 pinchos", 330);
        Product product19 = new Product("Pan de Ajo", "8 panes de ajo", 199.99);
        Product product20 = new Product("Hot Dog", "2 hotdogs", 99.99);
        Product product21 = new Product("Tajeada", "Orden de tajadas con carne", 149.99);

        //Asignacion de los productos a los menus de los comercios
        //Asignacion a Pizza Hut
        shop1.addmenu(product4);
        shop1.addmenu(product5);
        shop1.addmenu(product6);
        shop1.addmenu(product7);
        shop1.addmenu(product8);
        shop1.addmenu(product9);
        shop1.addmenu(product19);
        //Asignacion a CocoBaledas
        shop7.addmenu(product1);
        shop7.addmenu(product2);
        shop7.addmenu(product3);
        //Asigancion a Matambritas
        shop10.addmenu(product21);
        shop10.addmenu(product20);
        shop10.addmenu(product17);
        shop10.addmenu(product16);
        shop10.addmenu(product15);
        shop10.addmenu(product14);
        shop10.addmenu(product18);


        //Mostrar el menu de un comercio en este caso Matambritas
        shop10.show_menu();

        //Creacion de clientes
        Client clientA = new Client("Juana Hernandez", "Col.Roberto Suazo Cordova");
        Client clientB = new Client("Gaudy Ortiz", "Col.Brisas de Valle");


        //Busqueda por Categorias
        javaDelivery.search("Pizza");
        //Busqueda Erronea
        javaDelivery.search("hola");


        //ASIGNACION AL CARRITO DE LOS CLIENTES
            //Cliente A
            clientA.carrito.add(product1);
            clientA.carrito.add(product2);
            clientA.carrito.add(product3);
            //Cliente B
            clientB.carrito.add(product1);
            clientB.carrito.add(product18);


        //Mostrando los carritos de los clientes

            //Cliente A
            clientA.show_car(1);
            clientB.show_car(2);
    }
}
