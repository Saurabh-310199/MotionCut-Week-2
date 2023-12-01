package TaskOfWeek2;

import java.util.HashMap;
import java.util.Map;

public class ShortClass {
	
	private static final String BASE62_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE = BASE62_CHARS.length();
    private static final Map<String, String> shortToLongMap = new HashMap<>();
    private static final Map<String, String> longToShortMap = new HashMap<>();
	
	public static String generateShortURL(String longURL) {
        // In a real-world scenario, you may want to implement a more robust algorithm
        // This is a simple base conversion example
        int hashCode = longURL.hashCode();  // Using hashCode as a starting point
        StringBuilder shortURL = new StringBuilder();
        
        while (hashCode > 0) {
            shortURL.insert(0, BASE62_CHARS.charAt(hashCode % BASE));
            hashCode /= BASE;
        }
        
        return shortURL.toString();
    }

	public static void main(String []args) {
		ShortClass obj = new ShortClass();
		
	}
	
}
