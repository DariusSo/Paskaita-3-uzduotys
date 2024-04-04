import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Collections_uzduotis_1_ir_2 {
    public static void main(String[] args) {
        byte[] skaiciai = new byte[8];

        List<Byte> skaiciaiMazesni = new ArrayList<>();

        int suma = 0;
        Random random = new Random();
        for (int i = 0; i < 8; i++){
            skaiciai[i] = (byte) random.nextInt(1,10);
            suma = suma + skaiciai[i];
            if (skaiciai[i] > 4){
                System.out.println("Skaicius " + skaiciai[i] + " yra daugiau uz 4");
            }
            else{
                skaiciaiMazesni.add(skaiciai[i]);

            }

        }
        System.out.println(("Pirmas masyvas: " + Arrays.toString(skaiciai)));
        System.out.println("Mazesnis arba lygus 4 yra: " + skaiciaiMazesni);
        System.out.println("Pirmo masyvo skaiciu suma yra: " + suma);
        }



    }
