# Bridge

## Intenção

Desacoplar uma abstração da sua implementação, de modo que as duas possam variar
independentemente.

## Também conhecido como
Handle/Body

## Motivação 

**Use o padrão Bridge quando:**

- desejar evitar um vínculo permanente entre uma abstração e sua implementação.
Isso pode ocorrer, por exemplo, quando a implementação deve ser selecionada
ou alterada em tempo de execução;

- quando as abstrações como suas implementações tiverem de ser extensíveis por
meio de subclasses. Neste caso, o padrão Bridge permite combinar as diferentes
abstrações e implementações e estendê-las independentemente;

-  mudanças na implementação de uma abstração não puderem ter impacto sobre
os clientes; ou seja, quando o código dos mesmos não puder ser recompilado.

- tiver uma proliferação de classes, como foi mostrado no primeiro diagrama da
seção Motivação. Tal hierarquia de classes indica necessidade de separar um
objeto em duas partes. 

- desejar compartilhar uma implementação entre múltiplos objetos (talvez usan-
do a contagem de referências) e este fato deve estar oculto do cliente. Um exemplo

  

## Estrutura

![alt text](image-1.png)



## Participantes:

- **Abstraction (Restaurante)**  
  - define a interface da abstração;
  -  mantém uma referência para um objeto do tipo Implementor.
  
- **RefinedAbstraction (RestauranteBrasileiro,RestauranteItaliano).**
  -  estende a interface definida por Abstraction.

- **Implementor (Pizza)**
  - define a interface para as classes de implementação. Essa interface não precisa corresponder exatamente à interface de Abstraction; de fato, as duas interfaces podem ser bem diferentes. A interface de Implementor fornece somente operações primitivas e Abstraction define operações de nível mais alto baseadas nessas primitivas.

- **ConcreteImplementor (PizzaNapolitana, PizzaItaliana)**
  - implementa a interface de Implementor e define sua implementação concreta.
 


## Colaborações: 
• Abstraction repassa as solicitações dos clientes para o seu objeto Implementor.

## Consequências:

1. Desacopla a interface da implementação. Uma implementação não fica permanentemente presa a uma interface. A implementação de uma abstração pode ser configurada em tempo de execução. É até mesmo possível para um objeto mudar sua implementação em tempo de execução. O desacoplamento de Abstraction e Implementor também elimina dependências em tempo de compilação da implementação. Mudar uma classe de implementação não requer a recompilação da classe Abstraction e seus clientes. Essa propriedade é essencial quando você quer assegurar compatibilidade no nível binário entre diferentes versões de uma biblioteca de classes.
        Além disso, esse desacoplamento encoraja o uso de camadas que podem
melhorar a estruturação de um sistema. A parte de alto nível de um sistema
somente tem que ter conhecimento de Abstraction e   Implementor.


2. Extensibilidade melhorada. Você pode estender as hierarquias de Abstraction
e Implementor independentemente.
3. Ocultação de detalhes de implementação dos clientes. Você pode proteger e isolar
os clientes de detalhes de implementação, tais como o compartilhamento de
objetos Implementor e o mecanismo de contagem de referências que os
acompanham (se houver).

## Implementação:

1️⃣ Um único Implementor: Se houver apenas uma implementação, a classe abstrata Implementor pode ser desnecessária. No entanto, a separação ainda é útil para evitar recompilações ao alterar a implementação.

2️⃣ Criando o Implementor correto: A escolha da implementação pode ser feita no construtor, com base em parâmetros, ou delegada a um Factory, garantindo desacoplamento entre Abstraction e Implementor.

3️⃣ Compartilhamento de Implementors: Pode-se usar a técnica Handle/Body para compartilhar implementações entre objetos, utilizando um contador de referências.

4️⃣ Herança Múltipla (C++): Em C++, herança múltipla pode combinar interface e implementação, mas fixa a implementação à interface, impedindo um verdadeiro Bridge.



### Exemplo:


#### Classe Restaurante - Abstraction
```java
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
```
#### Classe RestauranteBrasileiro - RefinedAbstraction:
```java
package bridge;

public class RestauranteBrasileiro extends Restaurante {
    protected RestauranteBrasileiro(Pizza pizza) {
            super(pizza);
        }
    
    @Override
    void adicionarMolho() {
        pizza.setMolho("Molho de tomate");
    }

    @Override
    void adicionarRecheio() {
       pizza.setRecheio("Frango, Queijo e Catupiry");
    }

    @Override
    void fazerMassa() {
        pizza.setMassa("Massa Grossa");
    }

    
    @Override
    void entregar() {
       System.out.println("Entregando pizza");
    }

}
```

#### Classe RestauranteItaliano - RefinedAbstraction
```java
package bridge;

public class RestauranteItaliano extends Restaurante {

    protected RestauranteItaliano(Pizza pizza) {
            super(pizza);
        }
    
        @Override
    void adicionarMolho() {
        pizza.setMolho("Molho de tomate");
    }

    @Override
    void adicionarRecheio() {
       pizza.setRecheio("Frango");
    }

    @Override
    void fazerMassa() {
        pizza.setMassa("Massa fina");
    }


    @Override
    void entregar() {
       System.out.println("Entregando pizza italiana");
    }
}

```
#### Classe Pizza - Implementor

```java
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
```
#### Classe PizzaItaliana - ConcretImplementorA
```java
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
```

#### Classe PizzaNapolitana - ConcretImplementorB

```java
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
```

## Conclusão




## Usos conhecidos:


## Padrões relacionados
Um padrão Abstract Factory pode criar e configurar uma Bridge específicar.







