import java.util.HashMap;
import java.util.Map;

class CodecTinyURL {
    private final Map<Integer, String> db = new HashMap<>();
    private int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        db.put(id, longUrl);
        return "http://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int id = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf('/') + 1));
        return db.get(id);
    }
}