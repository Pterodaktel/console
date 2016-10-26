package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Здрасти");

        // 1
        int q = 32, w = 5;
        Integer result = new Integer(q / w);
        System.out.println( "32 / 5 = " + result );
        result = q % w;
        System.out.println( "32 % 5 = " + result.toString() );

        // 2
        int base = 10;
        double n = q; //  double  - для работы задачи №3
        result = (int)q/base + q%base;
        System.out.println( "3 + 2=" + result );

        //3
        n = 3.25;
        result = (int)Math.round(n);
        System.out.println( "Round(3.25) = " + result );

        //4
        n = 235;
        Integer nInteger;
        nInteger = (int)n;
        String parse_str = new String( nInteger.toString() );
        Character str_digit;

        result = 0;

        for ( int i = 0; i < parse_str.length(); ++i ) {
            //System.out.println(parse_str.charAt(i));
            str_digit = parse_str.charAt(i);
            result += Character.getNumericValue(str_digit);
        }

        System.out.println( "2 + 3 + 5 = " + result );
    }
}
