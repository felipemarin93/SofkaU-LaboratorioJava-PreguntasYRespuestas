package domain;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class Conexion {

    ConnectionString connectionString = new ConnectionString("mongodb://user_bd:qBZl3uWjYM5gT3ur@cluster0-shard-00-00.f9cte.mongodb.net:27017,cluster0-shard-00-01.f9cte.mongodb.net:27017,cluster0-shard-00-02.f9cte.mongodb.net:27017/?ssl=true&replicaSet=atlas-lrfycd-shard-0&authSource=admin&retryWrites=true&w=majority");
    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .codecRegistry(codecRegistry)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase dataBase = mongoClient.getDatabase("playerDB");
    MongoCollection collection = dataBase.getCollection("playerCollection");

    public MongoDatabase Conexion(){
        return dataBase;
    }
    public void crearusuario(String nombre,int puntaje){
        Document sampleDocumentAdd = new Document("nombre",nombre).append("dineroAcumulado",puntaje);
        collection.insertOne(sampleDocumentAdd);
    }
}