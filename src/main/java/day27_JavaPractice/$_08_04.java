package day27_JavaPractice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class $_08_04 {
    public static void main(String[] args) {
//            arrangeFile("src/day27_JavaPractice/Atasozu.txt");
//        System.out.println(getRandomLineFromInputFile("src/day27_JavaPractice/proverb.txt"));
        theWordGame("la belle vie");
    }

    /*
    This method returns String that is a random line from the Input File...
    It acn be usea for The Wheel Of Fortune Game ...
    */
    static String getRandomLineFromInputFile(String file) {
        List<String> list = null;
        int randomLocation = 0;
        String randomLine = "", result = "örnek";
        try {
            list = Files.readAllLines(Paths.get(file));
            randomLocation = Math.abs(new Random().nextInt(list.size()));
            result = list.get(randomLocation);
        } catch (NoSuchFileException e) {
            System.out.println("NoSuchFileException aldık");
            result = "boş yapma";
        } catch (IOException e) {
            System.out.println("yakaladım");
            e.printStackTrace();
            System.out.println("hala içerdeyim");
        } catch (NullPointerException e) {
            System.out.println("Null pointer aldık.");
        }
        System.out.println("çıktım");
        return result;
    }

    /*
    I googled "atasozleri" and found a web site that has a couple of turkish atasozleri and their meanings.
    but I need only atasozu without meaning and empty lines.
    I wrote a method is named arrangeFile() that returns an proverbs.txt has only atasozleri

    Input file: Atasozu.txt.
    Output file: Output.txt

    */
    static List<String> arrangeFile(String file) {
        List<String> list = new ArrayList<>();
        String line = null;
        try {
            FileWriter writer = new FileWriter("src/day27_JavaPractice/proverbs.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            do {
                line = br.readLine();
                if (line == null) break;
                if (line.isEmpty()) continue;
                if (Character.isDigit(line.charAt(0))) {
                    list.add(line.split("\\.")[1].trim());
                    writer.write(line.split("\\.")[1].trim() + System.lineSeparator());
                    System.out.println(line.split("\\.")[1].trim());
                }
            } while (true);
            writer.close();
        } catch (Exception e) {
            System.out.println(line);
        }
        return list;
    }

    /*
     * Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
     * the maximum value, decreasing constantly after the maximum value
     *
     * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
     * the maximum value, decreasing and increasing after the maximum value
     *
     * Create a method to check if it is Mountain Array or not. Use as possible as
     * Functional Programming
     */
    public static boolean isMountain(int[] input) {
        if (input.length % 2 == 0) {
            return false;
        }
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1])
                return false;
        }
        for (int i = input.length / 2; i < input.length - 1; i++) {
            if (input[i] < input[i + 1])
                return false;
        }
        return true;
    }

    /*
	 							The Wheel Of Fortune Game (TWOF):
	 1)You have tree lives at the beginnig of the game. If you can't find correct letter
	  You will loose a live.
	 2)The points that are likely to come from TWOF are
	  {100,200,300,400,500,600,700,800,900,1000,5000,10000,BANKRUPT,PASS};
	 3)The point you get from TWOF should be multiplied by the number of letters you find
	 4)If Bankrupt comes, you lose the game straight away.
	 5)theWordGame("la belle vie"); When we call this method, the game is installed
	  on this sentence

	 */
    static void theWordGame(String word) {

        Scanner scan = new Scanner(System.in);

        word = word.toUpperCase();
        StringBuilder unknownword = new StringBuilder(word.replaceAll("\\S", "-"));
        String live = "♥♥♥";
        boolean ifCorrect = false;
        int wof = 0;
        int score = 0;

        System.out.println(live);

        while (unknownword.toString().contains("-")) {


            System.out.println("****** Your score is " + score + " ******");

            wof = wheelOfFortune();

            if (wof == 0) {
                System.out.println("The wheel of fortune is BANKRAPT");
                System.out.println("You lost!!!");
                break;
            }
            if (wof == 1) {
                System.out.println("The wheel of fortune is PASS");
                live = lostLive(live);
                System.out.println(live);
                continue;

            }
            System.out.println("The wheel of fortune is " + wof);
            System.out.println(unknownword);

            System.out.println("Enter a letter...");
            char l = scan.next().toUpperCase().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == l) {
                    unknownword.setCharAt(i, l);
                    ifCorrect = true;
                    score = score + wof;
                }
            }

            if (ifCorrect == false) {
                live = lostLive(live);
                if (live.length() == 0) {
                    System.out.println("You lost!!!");
                    break;
                }
                System.out.println(live);
            }

            ifCorrect = false;
        }
        if (!unknownword.toString().contains("-")) {
            System.out.println(unknownword);
            System.out.println("Congrulations, you did it, your score is " + score);
        }
        scan.close();
    }

    public static int wheelOfFortune() {
        Random rdm = new Random();
        int[] wof = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 5000, 10000, 0, 1};
        int idx = rdm.nextInt(14);
        return wof[idx];
    }

    public static String lostLive(String s) {
        StringBuilder live = new StringBuilder(s);
        live.deleteCharAt(0);
        return live.toString();
    }
}

