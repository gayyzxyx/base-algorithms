package base.algorithms.transform;
import base.algorithms.transform.HighAccurateCompuate;
/**
 * Created with IntelliJ IDEA.
 * User: gayyzxyx
 * Date: 13-5-19
 * Time: 上午3:24
 * To change this template use File | Settings | File Templates.
 */
public class HighAccurateCompuateTest {
    public static void main(String []args){
        String stringa="999999";
        String stringb = "999999";
        int []a = new int[stringa.length()];
        int []b = new int[stringb.length()];
        for(int i=0;i<stringa.length();i++){
            a[i] = stringa.charAt(i)-48;

        }
        for(int j=0;j<stringb.length();j++){
            b[j] = stringb.charAt(j)-48;
        }

        System.out.print(HighAccurateCompuate.add(a,b));
    }
}
