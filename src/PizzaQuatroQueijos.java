public class PizzaQuatroQueijos extends Pizza {
    public PizzaQuatroQueijos(PizzaImplementor implementor) {
        super(implementor);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pizza de Quatro Queijos!");
    }
}
