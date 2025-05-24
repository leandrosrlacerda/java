/**
 * Um programa que imprime "Hello World!" na tela.
 *
 * @author <Leandro>
 * @version 1.0
 */
public class HelloWorld {
    /**
     * Método principal do programa. Todas as classes Java executáveis devem conter esse método.
     *
     * @param args Argumentos passados para o programa na linha de comando.
      */
    public static void main(String[] args) {

        HelloWorld helloTest = new HelloWorld();
        System.out.println(helloTest.sayHello());
        System.out.println();
        System.out.println(helloTest.sayHi());
    }

    /**
     * Construtor da classe padrão.
     */
    public HelloWorld() {
    }

    /**
     * Método para dizer hello para o chamador
     * @return String dizendo "Hello"
     */
    public String sayHello() {
        return "Hello";
    }

    /**
     * Método para dizer Hi para o chamador
     * @return String dizendo "Hi"
     */
    public String sayHi(){
        return "Hi";
    }

}
