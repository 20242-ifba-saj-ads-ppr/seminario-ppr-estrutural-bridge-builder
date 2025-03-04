package bridge;

public class RestauranteBrasileiro extends Restaurante {

    protected RestauranteBrasileiro(Pizza pizza) {
            super(pizza);
        }
    
    @Override
    void adicionarMolho() {
        pizza.setMolho("Molho de tomate");
    }

    @Override
    void adicionarRecheio() {
       pizza.setRecheio("Frango, Queijo e Catupiry");
    }

    @Override
    void fazerMassa() {
        pizza.setMassa("Massa Grossa");
    }

    

 
    @Override
    void entregar() {
       System.out.println("Entregando pizza");
    }

}
