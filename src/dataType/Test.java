package dataType;

public class Test {

    public static void main(String[] args) {

        Integer x=2;
        int y=2;
        System.out.println(x==y);//true
        System.out.println("------------");

        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1==i2);//false
        System.out.println(i1.equals(i2));//true

        /**
         * new Integer(123) 每次都会新建一个对象；
         *
         * Integer.valueOf(123) 会使用缓存池中的对象，多次调用会取得同一个对象的引用
         * Integer缓存池的大小默认为-128-127
         */
        Integer i3 = Integer.valueOf(1011);
        Integer i4 = Integer.valueOf(1011);
        System.out.println(i3==i4);//true

        String s=null;
        System.out.println(s.equals(""));

    }
}
