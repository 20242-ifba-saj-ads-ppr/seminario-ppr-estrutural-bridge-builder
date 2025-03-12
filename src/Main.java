public class Main {
    public static void main(String[] args) {
        // Criando uma pizza calabresa ao estilo italiano
        Pizza pizza1 = new PizzaCalabresa(new PizzaItalianaImplementor());
        pizza1.montar();
        pizza1.verificarQualidade();
        pizza1.entregar();

        System.out.println("----------------------");

        // Criando uma pizza quatro queijos ao estilo brasileiro
        Pizza pizza2 = new PizzaQuatroQueijos(new PizzaBrasileiraImplementor());
        pizza2.montar();
        pizza2.verificarQualidade();
        pizza2.entregar();

        System.out.println("----------------------");

        // Criando uma pizza calabresa ao estilo chinês
        Pizza pizza3 = new PizzaCalabresa(new PizzaChinesaImplementor());
        pizza3.montar();
        pizza3.verificarQualidade();
        pizza3.entregar();
    }
}
