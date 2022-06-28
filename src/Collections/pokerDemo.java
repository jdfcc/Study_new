package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pokerDemo {
    public static void main(String[] args) {
        String color[]= new String[]{"♦", "♣", "♠", "❤"};
        String number[]=new String[13];
        for (int i=2;i<11;i++)
            number[i-1]= String.valueOf(i);
        number[10]="J";
        number[11]="Q";
        number[12]="k";
        number[0]="A";

        ArrayList<String> array=new ArrayList<>();
        for(String col:color)
            for(String num:number)
                array.add(col+num);

        array.add("Joker_x");
        array.add("Joker_Y");

        Collections.shuffle(array);


        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();

        ArrayList<ArrayList<String>> playerNum=new ArrayList<>();
        playerNum.add(p1);
        playerNum.add(p2);
        playerNum.add(p3);

        ArrayList<String> G=new ArrayList<>();
        for(int i=10;i<13;i++){
            G.add(array.get(i));
            array.remove(i);
        }

        int record=0;
        for(ArrayList<String> player:playerNum){
            for(int i=record;i<record+17;i++){
                player.add(array.get(i));
            }
            record=record+17;
        }


        System.out.println("The King card is:"+G);
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
        System.out.println("p3:"+p3);


    }
}
