package se.almstudio.genericsmanager.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapManager {

    public static void main(String[] args) {
        Map<String, Integer> id = new HashMap<String, Integer>();
        id.put("Statlig sektor", 38600 );
        id.put( "kommunal sektor", 36000);
        id.put("Landstingssektorn", 37600 );
        id.put("Privat sektor", 42300);
        id.put("Privatanställda tjänstemän", 42300);
        id.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue() + " kr");
        });
        //show the whole list on the screen and calculate the average salary
        System.out.println();
        Integer[] valueInt = id.values().toArray(new Integer[id.size()]);
        int sum = 0;
        for (int i = 0; i<valueInt.length;i++) {
            sum = sum + valueInt[i];
        }
        System.out.println("average salary: " + sum/valueInt.length);
        //sorting salaries in ascending order
        System.out.println();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < valueInt.length - 1; i++) {
                if (valueInt[i] > valueInt[i+1]) {
                    temp = valueInt[i];
                    valueInt[i] = valueInt[i+1];
                    valueInt[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("salaries in ascending order : " + Arrays.toString(valueInt));
        //salaries which are more than 40000 kr
        System.out.println();
        System.out.println("salaries which are more than 40000:");
        for(int j = 0; j < valueInt.length; j++) {
            if(valueInt[j]>40000) {
                System.out.println(+ valueInt[j]);
            }
        }
    }
}




