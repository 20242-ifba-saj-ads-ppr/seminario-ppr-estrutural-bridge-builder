package bridge;

public class PizzaItaliana extends Pizza {
    @Override
    public void montar() {
        System.out.println("Montando pizza italiana com molho: " + molho + ", recheio: " + recheio + " e massa: " + massa);
    }

    @Override
    public void verificarQualidade() {
        System.out.println("Verificando qualidade da pizza italiana");
    }
    
}
