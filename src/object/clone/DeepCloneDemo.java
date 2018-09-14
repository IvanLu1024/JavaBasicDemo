package object.clone;

/**
 * 深拷贝：
 *      拷贝对象和原始对象的引用类型引用不同的对象
 */
public class DeepCloneDemo implements Cloneable{

    private int[] arr;

    public DeepCloneDemo() {
       arr=new int[10];
       for (int i=0;i<arr.length;i++){
           arr[i]=i;
       }
    }

    public int get(int index){
        return arr[index];
    }

    public void set(int index, int value){
        arr[index]=value;
    }

    @Override
    protected DeepCloneDemo clone() throws CloneNotSupportedException {
        DeepCloneDemo result= (DeepCloneDemo) super.clone();
        result.arr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            result.arr[i]=arr[i];
        }
        return result;

    }

    public static void main(String[] args) {
        DeepCloneDemo e1 = new DeepCloneDemo();
        DeepCloneDemo e2=null;
        try {
            e2=e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(1,11);
        System.out.println(e2.get(1));


    }
}
