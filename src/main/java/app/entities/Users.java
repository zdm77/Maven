package app.entities;

import java.util.Arrays;
import java.util.List;

public class Users {
    public static void main(String[] args) {
        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");
        mList
                .stream()
                .filter(s -> s.contains("c"))
                .forEach(System.out::println);
    }
}
