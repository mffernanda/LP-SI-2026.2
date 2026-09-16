public class Operadores {

    public static void main(String[] args){
        int a = 18 - 3*5;
        int b = (a++) % 3;
        System.out.println(b);
        a = ++b / 2;
        System.out.println(a);
    }
}
