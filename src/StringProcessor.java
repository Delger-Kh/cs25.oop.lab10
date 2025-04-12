import java.util.*;
import java.util.function.*;

public class StringProcessor {
	public static void processStrings(List<String> strings,
                                      Predicate<String> filter,
                                      Function<String, String> transformer,
                                      Consumer<String> printer) {
         // Шүүж, урвуулаад хэвлэнэ
		 strings.stream()
		 .filter(filter)                 // Шүүх
		 .map(transformer)                // Урвуулах
		 .forEach(printer);               // Хэвлэх
}

public static void main(String[] args) {
	// Үгсийн жагсаалт
	List<String> words = Arrays.asList("Java", "Програмчлал", "Код");

	// Predicate: 5-аас их урттай үгсийг шүүх
	Predicate<String> filter = s -> s.length() > 5;

	// Function: Шүүсэн үгсийг урвуулна
	Function<String, String> transformer = s -> new StringBuilder(s).reverse().toString();

	// Consumer: "ГАРШИЛ: " угтвартай, том үсгээр хэвлэх
	Consumer<String> printer = s -> System.out.println("ГАРШИЛ: " + s.toUpperCase());

	// processStrings методыг дуудна
	processStrings(words, filter, transformer, printer);
}
}