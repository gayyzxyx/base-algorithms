package base.algorithms.transform;

/**
 * Created with IntelliJ IDEA.
 * User: yaoxin
 * Date: 13-3-1
 * Time: 下午1:00
 * To change this template use File | Settings | File Templates.
 */
public final class DataTransform {

    /**
     * 十进制转换成二进制
     * @param input 输入参数
     * @return
     */
    public static String decimalToBinary(int input){
        return toString(input,1);
    }

    /**
     * 十进制转换成八进制
     * @param input 输入参数
     * @return
     */
    public static String decimalToOctal(int input){
        return toString(input,3);
    }
    /**
     * 十进制转换成十六进制
     * @param input 输入参数
     * @return
     */
    public static String decimalToHex(int input){
        return toString(input,4);
    }

    /**
     * 通过位移实现
     * @param i  输入参数
     * @param shift 位移参数
     * @return
     */
    public static String toString(int i,int shift){
        char []buf = new char[32];
        int charPos = 32;
        int radix = 1<<shift;
        int mask = radix-1;
        do{
            buf[--charPos] = intToChar(i & mask);
            i = i >> shift;
        }while(i != 0);
        return stringTrim(buf,32-charPos);
    }
    public static char intToChar(int input){
        char output = ' ';
        switch (input){
            case 0: output='0';break;
            case 1: output= '1';break;
            case 2: output= '2';break;
            case 3: output= '3';break;
            case 4: output= '4';break;
            case 5: output= '5';break;
            case 6: output= '6';break;
            case 7: output= '7';break;
            case 8: output= '8';break;
            case 9: output= '9';break;
            case 10: output= 'a';break;
            case 11: output= 'b';break;
            case 12: output= 'c';break;
            case 13: output= 'd';break;
            case 14: output= 'e';break;
            case 15: output= 'f';break;
        }
        return output;
    }
    /**
     * 去除数组前段0
     * @param buf
     * @param count
     * @return
     */
    public static String stringTrim(char []buf,int count){
        String output=new String();
        int len = 32;
        while(count> 0){
            output=output+String.valueOf(buf[32-count]);
            count--;
        }
        return output.trim();
    }
}
