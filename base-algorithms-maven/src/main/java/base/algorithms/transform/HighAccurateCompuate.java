package base.algorithms.transform;

/**
 * Created with IntelliJ IDEA.
 * User: gayyzxyx
 * Date: 13-5-19
 * Time: 上午2:52
 * To change this template use File | Settings | File Templates.
 */
public final class HighAccurateCompuate {
    /**
     * 高精度加法
     * @param a
     * @param b
     * @return
     */
    public static String add(int[] a,int[] b){
        int lenA = a.length;
        int lenB = b.length;
        int ahead = 0;
        int mod = 0;
        if(lenA < lenB){
            int []temp = a;
            a = b;
            b = temp;
            lenA = a.length;
            lenB = b.length;
        }
        for(int i = lenA - 1; i > 0; i--){
            while(--lenB>=0&&i>0){
                int total = a[i] + b[lenB];
                if(total > 9){
                    ahead = total/10;
                    mod = total % 10;
                }else{
                    mod = total;
                }
                a[i-1] = a[i-1] + ahead;
                a[i] = mod;
                mod = 0;
                ahead = 0;
                i--;
            }
            if(lenB==0&&i==0){
                a[i] = a[i] + b[lenB];
            }
            if(a[i] > 9&&i>0){
                a[i-1] = a[i-1] + a[i] / 10;
                a[i] = a[i] % 10;
            }

        }
        return IntArrayToString(a);

    }
    public static String IntArrayToString(int[] a){
        String temp = new String();
        for(int i=0;i<a.length;i++){
            temp = temp + Integer.toString(a[i]);
        }
        return temp;
    }
}
