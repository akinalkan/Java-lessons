package day17_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen string'i asagidaki gibi yazdiran bir program yazdirin
        input="Deniz"
        D
        D e
        D e n
        D e n i
        D e n i z



         */
        String input = "ANKARA";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j) + " ");
            }
            System.out.println("");
        }

        }
    }
