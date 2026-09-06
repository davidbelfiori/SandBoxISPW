package temperatura;

public class DisplayPrezzo implements Observer2 {
    @Override
    public void update(Subject2 subject) {
        if(subject instanceof StazioneServizio){
            System.out.println("StazioneServizio prezzo: "+((StazioneServizio) subject).getPrezzo());
        }else {
            System.out.println("Non me serve so prezzo");
        }
    }
}
