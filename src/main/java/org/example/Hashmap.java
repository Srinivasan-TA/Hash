package org.example;
import java.util.*;
import java.util.logging.Logger;

public class Hashmap {

    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(100, "Abisha");
        students.put(101, "Srini");
        students.put(102, "Ruchi");
        l.info("After invoking put() method ");
        l.info("The names added are " + students);
        String length =String.valueOf(students.size());
        l.info(length);
        students.remove(101, "Srini");
        l.info("After invoking putIfAbsent() method ");
        l.info("The names added are " + students);
    }
}
