import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        
   String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }

        String keyWord = "Россия";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText){
            if (!keyWord.toLowerCase().equals(currentWord.toLowerCase())){
                continue;
            }

            int count = map.getOrDefault(keyWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Количество зкземпляров искомого слова: " + map.getOrDefault(keyWord.toLowerCase(), 0));

    }
}
