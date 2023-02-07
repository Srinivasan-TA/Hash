package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {

    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer, String> Students = new HashMap<Integer, String>();
        l.log(Level.INFO,()->"The names added are " + Students);
        Students.put(100, "Abisha");
        Students.put(101, "Srini");
        Students.put(102, "Ruchi");

        l.info("After invoking put() method ");
        for (Map.Entry m : Students.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }

        Students.putIfAbsent(103, "Bargavi");
        l.info("After invoking putIfAbsent() method ");
        for (Map.Entry m : Students.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(104, "Priya");
        map.putAll(Students);
        l.info("After invoking putAll() method ");
        for (Map.Entry m : map.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }
    }
}
