package bilbil.项目.project1;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Description 将不同的功能封装为方法，就是可以直接通过调用方法使用他的功能，而无需考虑具体的功能实现细节额。
 * @Time : 2022/11/17 23:26
 * @Author: 曹志阳
 * @Classname CMUtility
 * @software :IntelliJ IDEA
 */
public class CMUtility {
    private static Scanner sc=new Scanner(System.in);

    /**
     * 读取界面输入指令
     * @return 界面输入指令
     */
    public static char readMenu(){
        char c;
        while(true){
            String str=readKeyBoard ( 1,false );
            c=str.charAt(0);
            if ( c!='1'&& c!='2'&& c!='3'&& c!='4'&& c!='5' ){
                System.out.println ("选择错误，请重新选择：" );
            }
            else {
                break;
            }

        }
        return c;
    }

    /**
     * 读取性别
     * @return 返回输入值
     */
    public static char readChar(){
        while(true){
            String str=readKeyBoard ( 1,false );//true表示可以为空
            if ( str.equals ( "男" ) )
                return str.charAt ( 0 );
            else if(str.equals("女"))
                return str.charAt ( 0 );
            else System.out.print ("性别输入错误，请从新输入:" );
        }
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值。
     * @param defaultChar
     * @return
     */
    public static char readChar(char defaultChar){
        while(true){
            String str=readKeyBoard ( 1,true );//true表示可以为空
            if ( str.equals ( "男" ) )
                return (str.length ()==0)?defaultChar:str.charAt ( 0 );
            else if(str.equals("女"))
                return (str.length ()==0)?defaultChar:str.charAt ( 0 );
            else System.out.print ("性别输入错误，请从新输入:" );
        }

    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。年龄
     */
    public static int readInt(){
        int n;
        while(true){
            String str=readKeyBoard ( 2,false);
            try {
                n=Integer.parseInt ( str );  //判断类型
                break;
            } catch (NumberFormatException e) {
                System.out.print ("数字输入错误，请从新输入:" );
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值。
     */
    public static int readInt(int defaultValue){
        int n;
        while (true){
            String str=readKeyBoard ( 2,true );
            if(str.equals (  "")){
                return defaultValue;
            }
            try {
                n=Integer.parseInt ( str );
                break;
            } catch (NumberFormatException e) {
                System.out.print ("数字输入错误，请从新输入:" );
            }
        }
        return n;
    }


    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }

    /**
     *从键盘读取一一个长度不超过limit的字符串，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值。
     */
    public static String readString(int limit,String defaultValue){
        String str=readKeyBoard (limit,true);
        return str.equals ( "" )?defaultValue:str;
    }

    public static String readPhone(int limit){
       while(true){
           String str=readKeyBoard (limit,false);
           if(str.length()!=limit){
               System.out.print ("输入号码错误，请从新输入:" );
           }
           else{
               return str;
           }
       }

    }
    public static String readPhone(int limit,String defaultValue){
        while(true){
            String str=readKeyBoard (limit,true);
            if(str.length()!=limit){
                System.out.print ("输入号码错误，请从新输入:" );
            }
            else{
                return str.equals ( "" )?defaultValue:str;
            }

        }
    }



    /**
     *用于确认选择的输入。该方法从键盘读取“Y'或'N',并将其作为方法的返回值。
     */
    public static char readCR(){
        char c;
        while(true){
            String str=readKeyBoard (1,false).toUpperCase ();//自动转化为大写
            c=str.charAt ( 0 );
            if ( c=='Y'||c=='N' ){
                break;
            }
            else{
                System.out.print ("选择错误，请从新输入:" );
            }
        }
        return c;
    }


    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";

        while(sc.hasNextLine ()){
            line=sc.nextLine ();
            if ( line.length ()==0 ){
                if ( blankReturn ){
                    return line;
                }
                else{
                    continue;
                }
            }
            if ( line.length ()<1||line.length ()>limit ){
                System.out.print ("请输入长度(大于"+limit+")\t错误：请重新输入:" );
                continue;
            }
            break;
        }
        return line;
    }
}
