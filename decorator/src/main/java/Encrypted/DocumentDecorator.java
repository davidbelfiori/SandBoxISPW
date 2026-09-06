package Encrypted;

public abstract class DocumentDecorator implements DocumentOperation{

    DocumentOperation documentOperation;

    public DocumentDecorator(DocumentOperation documentOperation) {
        this.documentOperation = documentOperation;
    }


    @Override
    public String export() {
        return documentOperation.export();
    }
}
