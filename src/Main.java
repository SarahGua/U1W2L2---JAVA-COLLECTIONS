import javax.security.sasl.SaslClient;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //****************************************ESERCIZIO 1*****************************************
//        Set<String> paroleInseirite = new HashSet<>();
//
//        System.out.println("Inserisci un numero intero da 1 a 3");
//        int numero = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Il numero scelto è " + numero +", adesso devi scegliere " + numero + " parole da inserire");
//        System.out.println("Inserisci la prima parola");
//        String primaParola = scanner.nextLine();
//        System.out.println("Ecco la prima parola scelta: " + primaParola);
//        paroleInseirite.add(primaParola);
//        System.out.println("Inserisci la seconda parola");
//        String secondaParola = scanner.nextLine();
//        System.out.println("Ecco la seconda parola scelta: " + secondaParola);
//        paroleInseirite.add(secondaParola);
//
//        for (String parola: paroleInseirite) {
//            System.out.println("Ecco tutte le parole inserite: " + parola);
//        }
//        scanner.close();

        //***************************************ESERCIZIO 2 *****************************************
        List<Integer> listaNumeri = new ArrayList<>();
//        List<Integer> listaNumeri2 = new ArrayList<>(Arrays.asList(listaNumeri)); ** NON FUNZIONA??

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Scegli un numero intero da 1 a 5");
        int numeroscelto = scanner2.nextInt();

        Random random = new Random();
        for (int i = 0; i < numeroscelto; i++){
            int numeroCasuale = random.nextInt(5, 100);
            listaNumeri.add(numeroCasuale);
        }
            System.out.println("Ecco i numeri generati : " + listaNumeri);

        //**************

        //**************************************ESERCIZIO 3****************************************
        Map<String, String> listaNumeriTelefonici = new HashMap<>();
        listaNumeriTelefonici.put("Sarah", "3319495603");
        listaNumeriTelefonici.put("Andrea", "3319400603");
        listaNumeriTelefonici.put("Alessandra", "3316695603");

        Set<String> elencoChiavi = listaNumeriTelefonici.keySet();
        for(String chiave: elencoChiavi){
            System.out.println("Chiave " + chiave);
            System.out.println("Valore " + listaNumeriTelefonici.get(chiave));
        }
    }
}