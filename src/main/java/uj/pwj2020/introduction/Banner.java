package uj.pwj2020.introduction;

import java.util.ArrayList;
import java.util.List;

public class Banner {

    public static String[] toBanner(String input) {
        if (input == null) {
            return new String[]{};
        } else {
            List<String> result= new ArrayList<String>(List.of("", "", "", "", "", "", ""));

            char[] chars = input.toUpperCase().toCharArray();
            for (char ch : chars) {
                switch (ch) {
                    case 'A' -> addLetter(result, a);
                    case 'B' -> addLetter(result, b);
                    case 'C' -> addLetter(result, c);
                    case 'D' -> addLetter(result, d);
                    case 'E' -> addLetter(result, e);
                    case 'F' -> addLetter(result, f);
                    case 'G' -> addLetter(result, g);
                    case 'H' -> addLetter(result, h);
                    case 'I' -> addLetter(result, i);
                    case 'J' -> addLetter(result, j);
                    case 'K' -> addLetter(result, k);
                    case 'L' -> addLetter(result, l);
                    case 'M' -> addLetter(result, m);
                    case 'N' -> addLetter(result, n);
                    case 'O' -> addLetter(result, o);
                    case 'P' -> addLetter(result, p);
                    case 'Q' -> addLetter(result, q);
                    case 'R' -> addLetter(result, r);
                    case 'S' -> addLetter(result, s);
                    case 'T' -> addLetter(result, t);
                    case 'U' -> addLetter(result, u);
                    case 'W' -> addLetter(result, w);
                    case 'V' -> addLetter(result, v);
                    case 'X' -> addLetter(result, x);
                    case 'Y' -> addLetter(result, y);
                    case 'Z' -> addLetter(result, z);
                    case ' '-> {
                        addSpace(result);
                        addSpace(result);
                        addSpace(result);
                    }

                }
            }

            for(int i = 0; i < result.size(); i++){
                result.set(i, result.get(i).substring(0, result.get(i).length() - 1));
            }

            String[] arrayResult = result.toArray(String[]::new);
            return arrayResult;
        }
    }

    private static void addSpace(List<String> one) {
        for (int i = 0; i < one.size(); i++) {
            String result = one.get(i).concat(" ");
            one.set(i, result);
        }
    }


    private static void addLetter(List<String> one, List<String> two) {
        for (int i = 0; i < one.size(); i++) {
            String result = one.get(i).concat(two.get(i));
            one.set(i, result);
        }
        addSpace(one);
    }
    public static List<String> a = new ArrayList<>(List.of(
            "   #   ",
            "  # #  ",
            " #   # ",
            "#     #",
            "#######",
            "#     #",
            "#     #"));
    public static List<String> b = new ArrayList<>(List.of("###### ", "#     #", "#     #", "###### ", "#     #", "#     #", "###### "));
    public static List<String> c = new ArrayList<>(List.of(" ##### ", "#     #", "#      ", "#      ", "#      ", "#     #", " ##### "));
    public static List<String> d = new ArrayList<>(List.of("###### ", "#     #", "#     #", "#     #", "#     #", "#     #", "###### "));
    public static List<String> e = new ArrayList<>(List.of("#######", "#      ", "#      ", "#####  ", "#      ", "#      ", "#######"));
    public static List<String> f = new ArrayList<>(List.of("#######", "#      ", "#      ", "#####  ", "#      ", "#      ", "#      "));
    public static List<String> g = new ArrayList<>(List.of(" ##### ", "#     #", "#      ", "#  ####", "#     #", "#     #", " ##### "));
    public static List<String> h = new ArrayList<>(List.of("#     #", "#     #", "#     #", "#######", "#     #", "#     #", "#     #"));
    public static List<String> i = new ArrayList<>(List.of("###", " # ", " # ", " # ", " # ", " # ", "###"));
    public static List<String> j = new ArrayList<>(List.of("      #", "      #", "      #", "      #", "#     #", "#     #", " ##### "));
    public static List<String> k = new ArrayList<>(List.of("#    #", "#   # ", "#  #  ", "###   ", "#  #  ", "#   # ", "#    #"));
    public static List<String> l = new ArrayList<>(List.of("#      ", "#      ", "#      ", "#      ", "#      ", "#      ", "#######"));
    public static List<String> m = new ArrayList<>(List.of("#     #", "##   ##", "# # # #", "#  #  #", "#     #", "#     #", "#     #"));
    public static List<String> n = new ArrayList<>(List.of("#     #", "##    #", "# #   #", "#  #  #", "#   # #", "#    ##", "#     #"));
    public static List<String> o = new ArrayList<>(List.of("#######", "#     #", "#     #", "#     #", "#     #", "#     #", "#######"));
    public static List<String> p = new ArrayList<>(List.of("###### ", "#     #", "#     #", "###### ", "#      ", "#      ", "#      "));
    public static List<String> q = new ArrayList<>(List.of(" ##### ", "#     #", "#     #", "#     #", "#   # #", "#    # ", " #### #"));
    public static List<String> r = new ArrayList<>(List.of("###### ", "#     #", "#     #", "###### ", "#   #  ", "#    # ", "#     #"));
    public static List<String> s = new ArrayList<>(List.of(" ##### ", "#     #", "#      ", " ##### ", "      #", "#     #", " ##### "));
    public static List<String> t = new ArrayList<>(List.of("#######", "   #   ", "   #   ", "   #   ", "   #   ", "   #   ", "   #   "));
    public static List<String> u = new ArrayList<>(List.of("#     #", "#     #", "#     #", "#     #", "#     #", "#     #", " ##### "));
    public static List<String> w = new ArrayList<>(List.of("#     #", "#  #  #", "#  #  #", "#  #  #", "#  #  #", "#  #  #", " ## ## "));
    public static List<String> v = new ArrayList<>(List.of("#     #", "#     #", "#     #", "#     #", " #   # ", "  # #  ", "   #   "));
    public static List<String> x = new ArrayList<>(List.of("#     #", " #   # ", "  # #  ", "   #   ", "  # #  ", " #   # ", "#     #"));
    public static List<String> y = new ArrayList<>(List.of("#     #", " #   # ", "  # #  ", "   #   ", "   #   ", "   #   ", "   #   "));
    public static List<String> z = new ArrayList<>(List.of("#######", "     # ", "    #  ", "   #   ", "  #    ", " #     ", "#######"));
}