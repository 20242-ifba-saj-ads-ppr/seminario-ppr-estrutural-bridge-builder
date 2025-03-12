public class PizzaChinesaImplementor implements PizzaImplementor {
    @Override
    public void montar() {
        System.out.println("Montando pizza ao estilo chinês...");
    }

    @Override
    public void verificarQualidade() {
        System.out.println("Verificando qualidade dos ingredientes chineses...");
    }
}

