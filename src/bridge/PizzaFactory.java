package bridge;


//Classe Utilizada apenas para facilitar a construção das pizzas
public class PizzaFactory {
    public static Pizza criarPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "italiana":
                return new PizzaItaliana();
            case "napolitana":
                return new PizzaNapolitana();
            default:
                throw new IllegalArgumentException("Tipo de pizza desconhecido");
        }
    }
}
