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
        /*
            A
            A N
            A N K
            A N K A
            A N K A R
            A N K A R A

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
