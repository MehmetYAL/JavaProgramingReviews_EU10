package week10_11_12_2022;

public class WrapperIntro {
    public static void main(String[] args) {
        String number1="100";
        String number2="200";
        String result=number1+number2;
        System.out.println(result);//100200

        int num=Integer.parseInt(number1);
        int num1=Integer.parseInt(number2);
        System.out.println(num+num1);//300  stringi interege cevirip topladi


        int i1=12;
        Integer integer1=i1;// autoboxing primitive==== to object()wrapperclass
        Integer integer2=12;
        int i2=integer2;//unboxing object====> to primitive


    }
}
/*
what is the different beetween parsInt () and ValueOf
parseInt returns prpimitive data type
valueOf returns and object

*** what is autoboxing and unboxing
autoboxing: primitive====>to object(wrapper class)
unboxing  : object(wrapper) ===>to primitive

 */