package ucu.edu.ua;
import ucu.edu.ua.Decorator.MockedDocument;
import ucu.edu.ua.Decorator.SmartDocument;
import ucu.edu.ua.Decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        MockedDocument mockedDocument = new MockedDocument("gs://cv-examples/wiki.png");
        System.out.println(mockedDocument.parse());

        TimedDocument timedDocument = new TimedDocument(mockedDocument);
        System.out.println(timedDocument.parse());
    }
}