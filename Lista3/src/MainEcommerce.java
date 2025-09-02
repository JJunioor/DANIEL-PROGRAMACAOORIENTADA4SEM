import exe1.Product;
import exe1.ShoppingCart;

public class MainEcommerce {
    public static void main(String[] args){
        //Criação dos produtos
        Product objProd1 = new Product("A", 100);
        Product objProd2 = new Product("B", 50);
        Product objProd3 = new Product("C", 500);

        //Criação do carrinho de compras
        ShoppingCart objShoppingCart = new ShoppingCart(1);

        //Adiciona items ao carrinho
        System.out.println("\n" + "-".repeat(80) + "\n");
        objShoppingCart.addCarItem(3,objProd1);
        System.out.println("\n" + "-".repeat(80) + "\n");

        objShoppingCart.addCarItem(5,objProd2);
        System.out.println("\n" + "-".repeat(80) + "\n");

        objShoppingCart.addCarItem(1,objProd3);
        System.out.println("\n" + "-".repeat(80) + "\n");


        System.out.println(objShoppingCart.toString());
        System.out.println("\n" + "-".repeat(80) + "\n");

        objShoppingCart.calcularTotal();
        System.out.println("\n" + "-".repeat(80) + "\n");

        objShoppingCart.removeCarItem(5,objProd2);
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println(objShoppingCart.toString());
        System.out.println("\n" + "-".repeat(80) + "\n");

    }
}
