package Encrypted;

public class Compression extends DocumentDecorator{

    public Compression(DocumentOperation documentOperation) {
        super(documentOperation);
    }


    @Override
    public String export() {
        return "Export( "+ super.export();

    }
}
