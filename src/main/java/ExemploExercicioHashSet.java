import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploExercicioHashSet {
    public static void main(String[] args) {

        //Crie um Set e execute as seguintes operações:
        Set<Integer> numeros = new HashSet<>();

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3;
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println("Elementos no HashSet: " + numeros);

        //Navegue no Set exibindo cada número no console;
        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext()) {
            System.out.println("Numero no HashSet: " + iterator.next());
        }

        //Remova o primeiro item do Set;
        numeros.remove(3);
        System.out.println("Elementos no HashSet após remoção do primeiro elemento: " + numeros);

        //Adicione um novo número no Set: 23;
        numeros.add(23);
        System.out.println("Elementos no HashSet após adição do novo elemento (23): " + numeros);

        //Verifique o tamanho do Set;
        System.out.println("Quantidade de elementos no HashSet: " + numeros.size());

        //Verifique se o Set está vazio.
        System.out.println("Verificando se o Set está vazio: " + numeros.isEmpty());

        //Verifique se o Set está vazio.
        numeros.clear();
        System.out.println("Verificando se o Set está vazio: " + numeros.isEmpty());
    }
}
