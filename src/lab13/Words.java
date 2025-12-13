package lab13;

import java.io.*;
import java.util.*;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try {
            List<String> words = readWordsFromFile(fileName);
            String result = getLine(words);
            System.out.println("Результат: " + result);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        scanner.close();
    }

    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split("\\s+"); // разделение строки по пробелам + (>=1 символу)
            for (String word : lineWords) {
                if (!word.trim().isEmpty()) {
                    words.add(word.trim());
                }
            }
        }
        reader.close();
        return words;
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        List<String> copyWords = new ArrayList<>(words);
        StringBuilder result = new StringBuilder();

        result.append(copyWords.remove(0));

        boolean f;
        do {
            f = false;
            String lastWord = result.substring(result.lastIndexOf(" ") + 1);
            char lastChar = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));

            for (int i = 0; i < copyWords.size(); i++) {
                String currentWord = copyWords.get(i);
                char firstChar = Character.toLowerCase(currentWord.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(currentWord);
                    copyWords.remove(i);
                    f = true;
                    break;
                }
            }
        } while (f && !copyWords.isEmpty());

        return result.toString();
    }
}