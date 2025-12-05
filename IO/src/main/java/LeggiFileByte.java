import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeggiFileByte {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Users/David/Documents/SandBoxISPW/SandBoxISPW/IO/testo.txt");
        ) {
            int dato;
            while ((dato = fis.read()) != -1) {
                System.out.print((char) dato);
            }
            fis.close();
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("C:/Users/David/Documents/SandBoxISPW/SandBoxISPW/IO/testo1.txt");) {
            String dato = "bella a tutti";

            fos.write(dato.getBytes());

            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
