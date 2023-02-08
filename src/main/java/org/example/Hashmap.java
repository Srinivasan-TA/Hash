package org.example;
import java.util.*;
import java.util.logging.Logger;

public class Hashmap {

    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        l.info("The names added are " + students);
        students.put(100, "Abisha");
        students.put(101, "Srini");
        students.put(102, "Ruchi");
        l.info("After invoking put() method ");
        for (Map.Entry m : students.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }

        students.putIfAbsent(103, "Bargavi");
        l.info("After invoking putIfAbsent() method ");
        for (Map.Entry m : students.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(104, "Priya");
        map.putAll(students);
        l.info("After invoking putAll() method ");
        for (Map.Entry m : map.entrySet()) {
            l.info(m.getKey() + " " + m.getValue());
        }
    }
}
