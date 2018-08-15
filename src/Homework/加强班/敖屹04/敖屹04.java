package Homework.加强班.敖屹04;

import java.util.*;

public class 敖屹04 {
    public static void main(String[] args) {
        System.out.println("第一题\nMap集合中的元素成对存在，分为键、值，通过获取键找到相应的值。");

        System.out.println("\n第二题\nEntry方法将Map元素转换成Entry类键值对的形式，存在集合中。通过打印该集合，实现对Map的遍历。");

        System.out.println("\n第三题");
        HashMap<Integer, Integer> map3 = new HashMap<>();
        map3.put(1, 101);
        map3.put(2, 102);
        map3.put(3, 103);
        System.out.println("操作前" + map3);
        System.out.println("删除键值为2的元素" + map3.remove(2) + "\n删除后" + map3);
        System.out.println("获取键值为3的元素" + map3.get(3));


        System.out.println("\n第四题");
        HashMap<Integer, Character> abc = new HashMap<>();
        abc.put(1, 'a');
        abc.put(2, 'b');
        abc.put(3, 'c');
        Set<Integer> num = abc.keySet();
        System.out.println("迭代器遍历");
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(abc.get(it.next()));
        }
        System.out.println("加强For循环遍历");
        for (Integer integer : num) {
            System.out.println(abc.get(integer));
        }

        System.out.println("\n第五题");
        HashMap<Car, String> car = new HashMap<>();
        car.put(new Car("本田", "广汽本田"), "奥德赛");
        car.put(new Car("大众", "上汽大众"), "朗逸");
        System.out.println("keySet方式遍历");
        Set<Car> brand = car.keySet();
        for (Car car1 : brand) {
            System.out.println(car1 + " 车型：" + car.get(car1));
        }
        System.out.println("entrySet方式遍历");
        Set<Map.Entry<Car, String>> carBrand = car.entrySet();
        for (Map.Entry<Car, String> carStringEntry : carBrand) {
            System.out.println(carStringEntry.getKey() + " 车型：" + carStringEntry.getValue());
        }

        System.out.println("\n第六题");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        Set<Integer> peopleCode = map.keySet();
        System.out.println("修改前：");
        for (Integer integer : peopleCode) {
            System.out.println("序号：" + integer + " 姓名：" + map.get(integer));
        }
        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "周林");
        System.out.println("修改后：");
        for (Integer integer : peopleCode) {
            System.out.println("序号：" + integer + " 姓名：" + map.get(integer));
        }

        System.out.println("\n第七题");
        List<String> province = List.of("黑龙江省", "浙江省", "江西省", "广东省", "福建省");
        List<String> provincialCapital = List.of("哈尔滨", "杭州", "南昌", "广州", "福州");
        HashMap<String, String> map1 = new HashMap<>();
        for (int i = 0; i < province.size(); i++) {
            map1.put(province.get(i), provincialCapital.get(i));
        }
        System.out.println(map1);

        System.out.println("\n第八题");
        List<String> list = List.of("asasbf", "asgh", "jbvkdn", "sg16h32ds2");
        HashMap<Character, Integer> chMap = new HashMap<>();
        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            for (int i = 0; i < s.length(); i++) {
                if (!chMap.containsKey(s.charAt(i))) chMap.put(s.charAt(i), 1);
                else chMap.put(s.charAt(i), chMap.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(chMap);

        System.out.println("\n第九题");
        System.out.println("请输入年份");
        Integer years = new Scanner(System.in).nextInt();
        HashMap<Integer, Champion> worldCup = new HashMap<>();
        worldCup.put(1930, new Champion("第一届", "乌拉圭", "乌拉圭"));
        worldCup.put(1934, new Champion("第二届", "意大利", "意大利"));
        worldCup.put(1938, new Champion("第三届", "法国", "意大利"));
        worldCup.put(1950, new Champion("第四届", "巴西", "乌拉圭"));
        worldCup.put(1954, new Champion("第五届", "瑞士", "西德"));
        worldCup.put(1958, new Champion("第六届", "瑞典", "巴西"));
        worldCup.put(1962, new Champion("第七届", "智利", "巴西"));
        worldCup.put(1966, new Champion("第八届", "英格兰", "英格兰"));
        worldCup.put(1970, new Champion("第九届", "墨西哥", "巴西"));
        worldCup.put(1974, new Champion("第十届", "前西德", "前西德"));
        worldCup.put(1978, new Champion("第十一届", "阿根廷", "阿根廷"));
        worldCup.put(1982, new Champion("第十二届", "西班牙", "意大利"));
        worldCup.put(1986, new Champion("第十三届", "墨西哥", "阿根廷"));
        worldCup.put(1990, new Champion("第十四届", "意大利", "前西德"));
        worldCup.put(1994, new Champion("第十五届", "美国", "巴西"));
        worldCup.put(1998, new Champion("第十六届", "法国", "法国"));
        worldCup.put(2002, new Champion("第十七届", "韩日", "巴西"));
        worldCup.put(2006, new Champion("第十八届", "德国", "意大利"));
        worldCup.put(2010, new Champion("第十九届", "南非", "西班牙"));
        worldCup.put(2014, new Champion("第二十届", "巴西", "德国"));
        worldCup.put(2018, new Champion("第二十一届", "俄罗斯", "法国"));
        if (years > 2018) System.out.println(years + "年，还没到");
        else if (worldCup.containsKey(years)) System.out.println(years + "年，" + worldCup.get(years));
        else System.out.println(years + "年没有举办世界杯");

        System.out.println("\n第十题");
        System.out.println("请输入国家");
        String country = new Scanner(System.in).nextLine();
        ArrayList<Integer> list1 = new ArrayList<>(worldCup.keySet());
        ArrayList<Integer> yearList = new ArrayList<>();
        for (Integer integer : list1) {
            if (country.equals(worldCup.get(integer).getCountry())) yearList.add(integer);
        }
        if (yearList.size() != 0) {
            System.out.println("夺冠年份：");
            for (int i = 0; i < yearList.size(); i++) {
                System.out.print(yearList.get(i) + " ");
            }
        } else System.out.println("没有获得过世界杯");
    }
}
