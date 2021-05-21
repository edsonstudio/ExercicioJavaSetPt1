import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploExercicioLinkedHashSet {
    public static void main(String[] args) {

        //Crie um Set e execute as seguintes operações:
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3;
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println("Elementos no LinkedHashSet: " + numeros);

        //Navegue no Set exibindo cada número no console;
        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext()) {
            System.out.println("Numero no LinkedHashSet: " + iterator.next());
        }

        //Remova o primeiro item do Set;
        numeros.remove(3);
        System.out.println("Elementos no LinkedHashSet após remoção do primeiro elemento: " + numeros);

        //Adicione um novo número no Set: 23;
        numeros.add(23);
        System.out.println("Elementos no LinkedHashSet após adição do novo elemento (23): " + numeros);

        //Verifique o tamanho do Set;
        System.out.println("Quantidade de elementos no LinkedHashSet: " + numeros.size());

        //Verifique se o Set está vazio.
        System.out.println("Verificando se o LinkedHashSet está vazio: " + numeros.isEmpty());

        //Verifique se o Set está vazio.
        numeros.clear();
        System.out.println("Verificando se o LinkedHashSet está vazio: " + numeros.isEmpty());
    }
}
