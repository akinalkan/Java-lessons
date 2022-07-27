package day31_timeFormatter_varargs;

public class C06_StringBuilder {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("kafama gore ooooo");//1. cesit
        System.out.println(sb.toString().toUpperCase());

        StringBuilder sb1=new StringBuilder();//----------->>2.cesit
        sb1.append("kafama gore");
        System.out.println(sb1.reverse());

        StringBuilder sb2=new StringBuilder(5);//---->>3.cesit
        sb2.append("kafa");
        sb2.append("ma gore");
        sb2.append(" takiliyorum.");
        System.out.println(sb2);

















    }
}
