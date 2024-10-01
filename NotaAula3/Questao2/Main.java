package NotaAula3.Questao2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        Gato g = new Gato("Inácio", "Siâmes", "caminha", "mia");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: " + c.setNome());
        System.out.println("Raça: " + c.setRaca());
        System.out.println("Locomoção: " + c.setLocomocao());
        System.out.println("Late: " + c.setLate());

        System.out.println("Informações da Gato:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raça: " + g.getRaca());
        System.out.println("Locomoção: " + g.getLocomocao());
        System.out.println("Mia: " + g.getMia());






    }
}
