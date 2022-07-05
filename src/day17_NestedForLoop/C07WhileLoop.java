package day17_NestedForLoop;

public class C07WhileLoop {
    public static void main(String[] args) {
        /*
        20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim
         */
        int bas=20;
        int bit=50;

        for (int i =bas; i <=bit ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        int temp=bas;
        while(temp<=bit){
            if(temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}
