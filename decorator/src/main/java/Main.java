import Encrypted.Compression;
import Encrypted.Document;
import Encrypted.DocumentOperation;
import Encrypted.Entryption;
import notifiche.Email;
import notifiche.Notifica;
import notifiche.Sms;
import notifiche.Whatsapp;

public class Main {
    public static void main(String[] args) {
//            Bevanda caffe = new Caffe();
//            System.out.println(caffe.descrizione());
//            caffe = new Latte(caffe);
//            System.out.println(caffe.descrizione());
//            caffe = new Panna(caffe); //caffe ora è di tipo latte
//            System.out.println(caffe.descrizione());
//            System.out.println(caffe.costo());


//            Bevanda iced = new IcedCaffe();
//            System.out.println("Descrizione: "+iced.descrizione() +" Costo: "+iced.costo());
//            iced = new Panna(iced);
//            System.out.println("Descrizione: "+iced.descrizione() +" Costo: "+iced.costo());
//            iced = new Latte(iced);
//            System.out.println("Descrizione: "+iced.descrizione() +" Costo: "+iced.costo());


//        Notifica notifica = new Email("pippi@gmail.com");
//        //notifica.invia("Ciao raga");
//        notifica = new Sms(notifica, "1234");
//     //   notifica.invia("Ciao raga");
//        notifica = new Whatsapp(notifica,"david");
//        notifica.invia("Ciao raga");

        DocumentOperation documento = new Document("Palle");
        documento.export();
        documento = new Compression(documento);
        documento.export();
        documento = new Entryption(documento);
        System.out.println(documento.export());

    }
}
