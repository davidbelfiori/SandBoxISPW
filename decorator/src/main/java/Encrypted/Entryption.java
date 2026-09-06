package Encrypted;

public class Entryption extends DocumentDecorator{
    public Entryption(DocumentOperation documentOperation) {
        super(documentOperation);
    }

    @Override
    public String export() {
        return "Entryotion( " +  super.export();

    }
}
