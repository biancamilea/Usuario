import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String nombre;
        int edad;
        String contenido = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = scanner.next();

        System.out.println("Introduce tu edad");
        edad= scanner.nextInt();

        File datos = new File("datos.txt");
        if(!datos.exists()){
            datos.createNewFile();
        }
        FileWriter fw = new FileWriter(datos);
        BufferedWriter bw = new BufferedWriter(fw);
        contenido = nombre + "\n" + edad;
        bw.write(contenido);
        bw.close();
    }
}