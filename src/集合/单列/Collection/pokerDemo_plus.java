package 集合.单列.Collection;

import java.util.*;

public class pokerDemo_plus {
    public static void main(String[] args) {

        ArrayList<String> card=new ArrayList<>();
        String color[]= new String[]{"♦", "♣", "♠", "❤"};
        String number[]= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String num:number){
            for(String col:color){
                card.add(col+num);
            }
        }
        card.add("King");
        card.add("King");
        //构建扑克牌

        HashMap<Integer ,String> Card_Map=new HashMap<Integer, String>();
        for(int i=0;i<card.size();i++){
            Card_Map.put(i,card.get(i));
        }
        //填充hashMap

        Set<Integer> key=Card_Map.keySet();
        ArrayList<Integer> Card_Key=new ArrayList<>();
        for(Integer k:key)
            Card_Key.add(k);
        //获取Key
        Collections.shuffle(Card_Key);

        ArrayList<TreeSet<Integer>> player=new ArrayList<>();
        TreeSet<Integer> p1=new TreeSet<>();
        TreeSet<Integer> p2=new TreeSet<>();
        TreeSet<Integer> p3=new TreeSet<>();
        player.add(p1);
        player.add(p2);
        player.add(p3);

        int record=0;
        for(TreeSet<Integer> pl:player){
            for(int i=record;i<record+17;i++){
                pl.add(Card_Key.get(i));
            }
            record=record+17;
        }

        TreeSet<Integer> Gift=new TreeSet<>();
        for(int i=record;i<record+3;i++)
            Gift.add(Card_Key.get(i));
        System.out.println("Gift is:");
        for(int temp:Gift)
            System.out.print(Card_Map.get(temp)+" ");
        System.out.println(" ");
        //地主牌

        for(TreeSet<Integer> pl:player){
            System.out.print("card is:");
            for(Integer temp:pl){
                System.out.print(Card_Map.get(temp)+" ");
            }
            System.out.println(" ");
       }
        //玩家手牌

    }
}
