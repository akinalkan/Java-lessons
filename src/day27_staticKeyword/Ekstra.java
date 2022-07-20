package day27_staticKeyword;

public class Ekstra {

        static  int count=0;
        public void increment(){
            count++;
        }
        public static void main(String[] args) {
            Ekstra obj1=new Ekstra();
            Ekstra obj2=new Ekstra();
            obj1.increment();//---->count:0-->1 oldu
            System.out.println("obj1 : count is=" + obj1.count);//count=1
            obj2.increment();//---->count:1--->2 oldu
            System.out.println("obj1 : count is=" + obj1.count);//count=2
            System.out.println("obj2 : count is=" + obj2.count);//count=2
        }
    }


