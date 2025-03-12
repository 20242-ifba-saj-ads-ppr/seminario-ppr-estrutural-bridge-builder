public class PizzaCalabresa extends Pizza {
   
    public PizzaCalabresa(PizzaImplementor implementor) {
        super(implementor);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pizza de Calabresa!");
    }
}
