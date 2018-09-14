package object.clone;

/**
 * 浅拷贝：
 *      拷贝对象和原始对象的引用类型引用的是同一个对象
 */
public class ShallowCloneDemo implements Cloneable {

    private int[] arr;

    public ShallowCloneDemo() {
        arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
    }

    public void set(int index,int value){
        arr[index]=value;
    }

    @Override
    protected ShallowCloneDemo clone() throws CloneNotSupportedException {
        return (ShallowCloneDemo) super.clone();
    }

    public static void main(String[] args) {

        ShallowCloneDemo e1 = new ShallowCloneDemo();
        ShallowCloneDemo e2=null;
        try {
            e2=e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(2,222);
        System.out.println(e2.arr[2]);
        System.out.println(e1.arr[1]);
        e2.set(1,111);
        System.out.println(e1.arr[1]);

    }
}
