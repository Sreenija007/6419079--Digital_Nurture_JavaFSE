public class mainapp {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document doc1 = factory.createDocument();
        doc1.open();

        factory = new PdfDocumentFactory();
        Document doc2 = factory.createDocument();
        doc2.open();

        factory = new ExcelDocumentFactory();
        Document doc3 = factory.createDocument();
        doc3.open();
    }
}
