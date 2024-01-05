package Hw23;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.io.IOException;

public class MongoDB {

    public static void main(String[] args) throws IOException {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/Person")) {
            MongoDatabase database = mongoClient.getDatabase("Person");
            MongoCollection<Document> collection = database.getCollection("Collection");
            Document documentToAdd = new Document
                    ("name", "Oleg")
                    .append("age", 13)
                    .append("city", "Kyiv");

            collection.insertOne(documentToAdd);
            System.out.println("Добавление документа:\n " + documentToAdd.toJson());

            Document documentToRead = collection.find(new Document("name", "Oleg")).first();
            System.out.println("\nСчитывание документа:\n " + documentToRead.toJson());

            Document filter = new Document("name", "Oleg");
            Document update = new Document("$set", new Document("age", 31));

            collection.updateOne(filter, update);
            System.out.println("\nОбновление документа:\n" + documentToRead.toJson());

            collection.deleteOne(new Document("name", "Oleg"));
            System.out.println("\n`Документ удалено");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
