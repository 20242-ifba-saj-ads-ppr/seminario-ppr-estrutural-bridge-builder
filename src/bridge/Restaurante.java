package bridge;

public abstract class Restaurante {

    protected Pizza pizza;

    protected Restaurante(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void adicionarMolho();
    abstract void adicionarRecheio();
    abstract void fazerMassa();
    abstract void entregar();
    

    public void prepararPedido() {
        adicionarMolho();
        adicionarRecheio();
        fazerMassa();
        pizza.montar();
        pizza.verificarQualidade();
        System.out.println("Pizza pronta para ser entregue");    
    }
}
