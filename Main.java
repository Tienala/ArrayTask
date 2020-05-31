/* Array Task
 * Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 */
package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\Harry.txt")));
        String cleanedText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll(";", "")
                .replaceAll("!", "")
                .replaceAll("\n|\r\n", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\'", "")
                .replaceAll("-", "")
                .replaceAll("\\\\","")
                .replaceAll(":","")
                .toLowerCase();
        String[] words = cleanedText.split(" ");
        String distinctString = "";
        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])) {
                distinctString += words[i]+" ";
            }
        }
        String [] wordsDistinct = distinctString.split(" ");
        Arrays.sort(wordsDistinct);
        for(int i = 0; i <  wordsDistinct.length; i++) {
            System.out.println(wordsDistinct[i] + "  ");
            }
        }
    }
