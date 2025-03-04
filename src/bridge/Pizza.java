package bridge;

public abstract class Pizza {
    protected String molho;
    protected String recheio;
    protected String massa;

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void montar() {
        System.out.println("Montando pizza com molho: " + molho + ", recheio: " + recheio + " e massa: " + massa);
    }

    public void verificarQualidade() {
        System.out.println("Verificando qualidade da pizza");
    }

    public void entregar() {
        System.out.println("Entregando pizza");
    }
}
