/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author NARENDER KESWANI
 */
public class q3 {

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1,
                    Map.Entry<String, Integer> o2) {

                return (o1.getValue()).compareTo(o2.getValue());

            }

        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> aa : list) {

            temp.put(aa.getKey(), aa.getValue());

        }

        return temp;

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Sharven Angne", 97);
        hm.put("Ronal Mukherjee", 55);
        hm.put("Jason Phlip", 44);
        hm.put("Christy Vyapari", 77);


        Map<String, Integer> hm1 = sortByValue(hm);

        for (Map.Entry<String, Integer> en : hm1.entrySet()) {

            System.out.println("Key = " + en.getKey()+ ", Value = " + en.getValue());

        }
    }
}
