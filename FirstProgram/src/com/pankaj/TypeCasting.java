package com.pankaj;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat(); //here i will give the input as integer but it will automatically convert it
//        //into float type .... so this is automatic type conversion;
//        System.out.println(num);

//        int num2  = input.nextInt();//here you can not give the float value ...
//        System.out.println(num2);
//        //Rule for automatic type conversion.... the datatype should be compatable..

//            //Type casting
//            int num = (int)(193240.29380); //This is called Typecasting;
//            System.out.println(num);

            //Automatic type promotion in expressions
//            int a = 257;
//            byte b = (byte)(a); //The maximum range of byte variable is 1-256; So, this is adding 257 % 256 = 1
//            System.out.println(b);
//        byte b = 50;
////        b = b * 2; This statement will give an error;cuz.. during expression evaluation it automatically
////        convert it into a integer type;So we have to typecast it ... -> b = (byte)(b*2);
//        b = (byte)(b*2);
//        System.out.println(b);

//        int number  = 'A'; //This will give the ASCII value of A 65;
//        System.out.println(number);
//        System.out.println((char)(number+2));

    //Que: What is the rule for type promotion;
//          1- All the byte, char and short value will be promoted to integer type
//          2 -if any one of the operand is long then the whole promotion will be promoted to long;
//          3- if it is float then whole operation will be promoted to float; and same with double;

    }
}
