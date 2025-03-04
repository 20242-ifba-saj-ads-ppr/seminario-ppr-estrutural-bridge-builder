package bridge;

public class RestauranteItaliano extends Restaurante {

    protected RestauranteItaliano(Pizza pizza) {
            super(pizza);
        }
    
        @Override
    void adicionarMolho() {
        pizza.setMolho("Molho de tomate");
    }

    @Override
    void adicionarRecheio() {
       pizza.setRecheio("Frango");
    }

    @Override
    void fazerMassa() {
        pizza.setMassa("Massa fina");
    }


    @Override
    void entregar() {
       System.out.println("Entregando pizza italiana");
    }

}
