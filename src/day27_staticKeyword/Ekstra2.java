package day27_staticKeyword;

public class Ekstra2 {
    int x;
    static int y;
    Ekstra2(int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new Ekstra2(2);
        Ekstra2 dnm=new Ekstra2(3);
        System.out.println(dnm.x +","+dnm.y);//3,5
    }
}

