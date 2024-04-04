import java.util.*;

public class Collections_uzduotis_3 {
    public static void main(String[] args) {
    List<Integer> sk8 = new ArrayList<>();
    List<Integer> skMaziau = new ArrayList<>();
    List<Integer> skDaugiau = new ArrayList<>();
    Random random = new Random();
    int suma = 0;
    for (int i = 0; i < 8; i++){
        sk8.add(random.nextInt(1,10));
        suma = suma + sk8.get(i);
        if (sk8.get(i) > 4){
            skDaugiau.add(sk8.get(i));
        }
        else{
            skMaziau.add(sk8.get(i));
        }

    }
        System.out.println("Pirmas listas: " +sk8);
        System.out.println("Daugiau 4: " +skDaugiau);
        System.out.println("Maziau arba lygu 4: " +skMaziau);
        System.out.println("Pirmo listo suma: " +suma);
        System.out.println("Pirmo listo vidurkis: " +suma / sk8.size());
    }
}
