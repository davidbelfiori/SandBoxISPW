import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public BufferReader(String filePath) {
       try {
           // si occuupa di leggere i caratteri del file
           FileReader fr = new FileReader(filePath);
           //avvolge FileReader per leggere in modo più veloce
           BufferedReader br = new BufferedReader(fr);
              String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();

       }catch (IOException e){
              System.err.println("Errore durante la lettura del file: " + e.getMessage());

       }
    }

}
