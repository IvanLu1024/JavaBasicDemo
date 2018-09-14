package string;

public class StringDemo {

    public static void main(String[] args) {
        //
        String s=new String("abc");
        String ss=new String("abc");

        String a=s.intern();
        String b=ss.intern();
        String S=new String(s);

        System.out.println();

        System.out.println(s.hashCode()+"--"+ss.hashCode());
        System.out.println(a==b);



    }
}
