package Konular;

public class Konu_increment_decrement {
    public static void main(String[] args) {

        int x = 5;
        int y = x++;        // POST INCREMENT => increment by 1, but show the new value next time
        int z = ++x;        // PRE INCREMENT => increment by 1 and show it know
        System.out.println("x is " + x);        // 6
        System.out.println("y is " + y);        // 5  (ama x 6 oldu)
        System.out.println("z is " + z);        // 7

        int a = 10;
        int sum = a++ + ++a;
        System.out.println(sum);            /// 11 + 11 = 22
        System.out.println(a);              /// 12
        a =10;
        System.out.println("a = 10");
        System.out.println("a++ = " +a++);
        System.out.println("a = "+a);
        System.out.println("++a = " +(++a));

        System.out.println("--a = " +(--a));		// decrement
        System.out.println("a-- = " +(a--));
        System.out.println("a = "+a);

        int c = a++ + ++a;							// 11 + 11 = 22
        System.out.println(c);

        int d = a++ + --a +a-- + a;					//12 + 11 + 12 + 12 = 47
        System.out.println(d);


    }
}
