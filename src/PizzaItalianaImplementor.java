public class PizzaItalianaImplementor implements PizzaImplementor {
    @Override
    public void montar() {
        System.out.println("Montando pizza ao estilo italiano...");
    }

    @Override
    public void verificarQualidade() {
        System.out.println("Verificando qualidade dos ingredientes italianos...");
    }
}
