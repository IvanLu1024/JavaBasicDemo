package object;

import java.util.Arrays;

public class EqualExample {
    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null||getClass()!=obj.getClass())
            return false;
        EqualExample other= (EqualExample) obj;
        if (x!=other.x) return false;
        if (y!=other.y) return false;
        if (z!=other.z) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;


    }

}
