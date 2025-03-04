package bridge;

public class PizzaNapolitana extends Pizza {

    @Override
    public void montar() {
        System.out.println("Montando pizza napolitana com molho: " + molho + ", recheio: " + recheio + " e massa: " + massa);
    }

    @Override
    public void verificarQualidade() {
        System.out.println("Verificando qualidade da pizza napolitana");
    }

    
}