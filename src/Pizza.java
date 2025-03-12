public abstract class Pizza {
    protected PizzaImplementor implementor;

    public Pizza(PizzaImplementor implementor) {
        this.implementor = implementor;
    }

    public void montar() {
        implementor.montar();
    }

    public void verificarQualidade() {
        implementor.verificarQualidade();
    }

    public abstract void entregar();
}
