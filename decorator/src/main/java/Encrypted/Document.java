package Encrypted;

public class Document implements DocumentOperation{

    private String text;

    public Document (String txt){
        this.text = txt;
    }

    @Override
    public String export() {
        return "Esporto documento : "+ text;
    }
}
