package bridge;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaItaliana();
        Restaurante restauranteitaliano = new RestauranteItaliano(pizza);
        restauranteitaliano.prepararPedido();

        System.out.println("====================================");

        Pizza pizza2 = new PizzaNapolitana();
        Restaurante restaurantebrasileiro = new RestauranteBrasileiro(pizza2);
        restaurantebrasileiro.prepararPedido();

        System.out.println("====================================");


        restaurantebrasileiro = new RestauranteBrasileiro(new PizzaItaliana());
        restaurantebrasileiro.prepararPedido();
    }
}
