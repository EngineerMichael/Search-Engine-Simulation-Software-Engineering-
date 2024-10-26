
import java.util.ArrayList;  
import java.util.List;  
class Document {  
    private int id;  
    private String content;  
    public Document(int id, String content) {  
        this.id = id;  
        this.content = content;  
    }  
    public int getId() {  
        return id;  
    }  
    public String getContent() {  
        return content;  
    }  
}  
public class SimpleSearchEngine {  
    private List<Document> documents;  
    public SimpleSearchEngine() {  
        documents = new ArrayList<>();  
    }  
    public void addDocument(Document document) {  
        documents.add(document);  
    }  
    public List<Document> search(String query) {  
        List<Document> results = new ArrayList<>();  
        for (Document document : documents) {  
            if (document.getContent().toLowerCase().contains(query.toLowerCase())) {  
                results.add(document);  
            }  
        }  
        return results;  
    }  
    public static void main(String[] args) {  
        SimpleSearchEngine searchEngine = new SimpleSearchEngine();  
        // Create some sample documents  
        Document doc1 = new Document(1, "Java is a popular programming language.");  
        Document doc2 = new Document(2, "Python is known for its simplicity.");  
        Document doc3 = new Document(3, "Search engines help users find information.");  
        Document doc4 = new Document(4, "Java and Python are both used for web development.");  
        searchEngine.addDocument(doc1);  
        searchEngine.addDocument(doc2);  
        searchEngine.addDocument(doc3);  
        searchEngine.addDocument(doc4);  
        // Perform a search  
        String query = "Java";  
        List<Document> results = searchEngine.search(query);  
        // Display the search results  
        if (results.isEmpty()) {  
            System.out.println("No documents found for the query: " + query);  
        } else {  
            System.out.println("Search results for query: " + query);  
            for (Document result : results) {  
                System.out.println("Document #" + result.getId() + ": " + result.getContent());  
            }  
        }  
    }  
}  
