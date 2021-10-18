
package uj.pwj2020.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Reverser {

    public static String reverse(String input) {
        if(input != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(input.stripLeading().stripTrailing());
            stringBuilder.reverse();
            return stringBuilder.toString();
        } else {
            return input;
        }
    }

    public static String reverseWords(String input) {
        List<String> list = new ArrayList<>(List.of(input.split("\\s+")));
        Collections.reverse(list);

        return list.stream()
                .map(word -> String.valueOf(word))
                .collect(Collectors.joining(" "));
    }


}

