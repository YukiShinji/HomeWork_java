package Programmer.familiarityWithJava.hw6_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Seminar6 {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        List<Seminar6_2> nb = initListNotebooks();
        List<Seminar6_2> filtered = new ArrayList<>();
        Map<String, String> params = new HashMap<>();
        params.put("color", "Black");
        params.put("ram", "4");
        params.put("os", "Windows");
        params.put("diagonal", "14");
        filtered = filter(params, nb);
        for (Seminar6_2 tmp: filtered){
            System.out.println(tmp.toString());
        }
    }

    public static List<Seminar6_2> initListNotebooks(){
        List<Seminar6_2> nb = new ArrayList<>(Arrays.asList());
        nb.add(new Seminar6_2("Asus", "Black", "14", "Intel", "Intel", "4", "2000", "Windows"));
        nb.add(new Seminar6_2("Acer", "Gray", "21", "AMD", "Nvidia", "4", "250", "Linux"));
        nb.add(new Seminar6_2("Asus", "White", "14", "Intel", "Nvidia", "16", "250", "Windows"));
        nb.add(new Seminar6_2("Acer", "Blue", "15", "AMD", "Intel", "4", "250", "Windows"));
        nb.add(new Seminar6_2("Lenovo", "Black", "14", "Intel", "Nvidia", "4", "500", "Windows"));
        nb.add(new Seminar6_2("Samsung", "Black", "17", "AMD", "Nvidia", "8", "500", "Linux"));
        nb.add(new Seminar6_2("Asus", "Gray", "19", "Intel", "Intel", "8", "1000", "Linux"));
        nb.add(new Seminar6_2("Acer", "Blue", "19", "AMD", "Nvidia", "8", "1000", "Windows"));
        nb.add(new Seminar6_2("Asus", "Red", "17", "Intel", "Nvidia", "4", "500", "Windows"));
        nb.add(new Seminar6_2("Asus", "White", "24", "AMD", "Intel", "16", "250", "Linux"));
        nb.add(new Seminar6_2("Lenovo", "Black", "21", "Intel", "Nvidia", "2", "500", "Linux"));
        nb.add(new Seminar6_2("Samsung", "Black", "21", "AMD", "Intel", "8", "750", "Windows"));
        return nb;
    }

    public static List<Seminar6_2> filter(Map<String, String> params, List<Seminar6_2> notebooks){
        List<Seminar6_2> filtered = notebooks.stream().filter(p -> {
            for (String key: params.keySet()){
                if (!p.getParam(key).equals(params.get(key))) return false;
            }
            return true;
        }).collect(Collectors.toList());
        return filtered;
    }

}