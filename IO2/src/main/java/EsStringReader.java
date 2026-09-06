import java.io.IOException;
import java.io.StringReader;

public class EsStringReader {

    public void stringReader(String input) {

        try {
            StringReader reader = new StringReader(input);
            int data;
            while ((data=reader.read())!=-1) {

                System.out.print((char) data);
            }
            reader.close();
        }catch (IOException e){
            System.err.println("Errore durante la lettura della stringa: " + e.getMessage());
        }

    }
}
