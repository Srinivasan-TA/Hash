package org.example;

import java.util.HashSet;
import java.util.logging.Logger;

public class Hashset {
        public static void main(String[] args) {
            Logger l = Logger.getLogger("com.api.jar");
            HashSet<String> cites=new HashSet<String>();
            cites.add("Tanjore");
            cites.add("Palakad");
            cites.add("Madurai");
            cites.add("Chennai");
            l.info("An initial list of Cities in TN: "+cites);
            cites.remove("Chennai");
            l.info("After invoking remove method: "+cites);
            HashSet<String> set1=new HashSet<String>();
            set1.add("Coimbatore");
            set1.add("Trichy");
            cites.addAll(set1);
            l.info("Updated Cites in TN: "+cites);
            cites.removeAll(set1);
            l.info("After invoking removeAll() method: "+cites);
            cites.removeIf(str->str.contains("Palakad"));
            l.info("After invoking "+cites);
            cites.clear();
            l.info("After invoking clear() method: "+cites);
        }

    }

