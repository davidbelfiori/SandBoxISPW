import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWrite {
    public void BufferedWrite(String filePath, String content) {
        // Implementazione del metodo per scrivere contenuti su un file utilizzando BufferedWriter
            try {
                FileWriter fw = new FileWriter(filePath);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.newLine();
                bw.close();
            }catch (Exception e){
                System.err.println("Errore durante la scrittura del file: " + e.getMessage());
            }


    }
}
