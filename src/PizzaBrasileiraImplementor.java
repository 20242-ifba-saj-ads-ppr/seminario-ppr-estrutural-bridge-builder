public class PizzaBrasileiraImplementor implements PizzaImplementor {
    @Override
    public void montar() {
        System.out.println("Montando pizza ao estilo brasileiro...");
    }

    @Override
    public void verificarQualidade() {
        System.out.println("Verificando qualidade dos ingredientes brasileiros...");
    }
}

