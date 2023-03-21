package bilbil.项目.project1;

import java.util.Scanner;

/**
 * @ codeing=utf-8
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @Time : 2022/11/17 23:18
 * @Author: 曹志阳
 * @Classname CustomerView
 * @software :IntelliJ IDEA
 */
public class CustomerView {
    private CustomerList cl = new CustomerList ( 10 );

    public CustomerView(){
        Customer customer = new Customer("曹志阳",'男',20,"18209529383","2011526387@qq.com");
        cl.addCustomer ( customer );

    }

    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu ( ) {
        Scanner sc = new Scanner ( System.in );
        while (true) {
            System.out.println ( "\n-------------------客户信息管理软件-------------------" );
            System.out.println ( "                      1添加  客户" );
            System.out.println ( "                      2修改  客户" );
            System.out.println ( "                      3删除  客户" );
            System.out.println ( "                      4客户  列表" );
            System.out.println ( "                      5   退出" );
            System.out.print ( "           请选择(1-5):" );

            char menu = CMUtility.readMenu ( );
            switch (menu) {
                case '1':
                    addNewCustomer ( );
                    break;
                case '2':
                    modifyCustomer ( );
                    break;

                case '3':
                    deleteCustomer ( );
                    break;

                case '4':
                    listAllCustomers ( );
                    break;

                case '5':
                    System.out.print ( "确认是否退出(Y/N):" );
                    char isExit = CMUtility.readCR ( );
                    if ( isExit == 'Y' ) {
                        return;
                    }


            }
        }

    }

    /**
     * 添加客户操作
     */
    private void addNewCustomer ( ) {
        System.out.println ( "--------------------添加    客户---------------------" );
        System.out.print ("姓名:" );
        String name = CMUtility.readString ( 4 );
        System.out.print ("性别:" );
        char gender = CMUtility.readChar ();
        System.out.print ("年龄:" );
        int age=CMUtility.readInt ();
        System.out.print ("电话:" );
        String phone=CMUtility.readPhone ( 11 );
        System.out.print ("Email:" );
        String email=CMUtility.readString (25);

        //将上述数据封装到对象中
        Customer customer = new Customer ( name, gender, age, phone, email );
        boolean isSuccess = cl.addCustomer ( customer );
        if ( isSuccess){
            System.out.println ("----------------------添加    完成-----------------------" );
        }
        else{
            System.out.println ("-------------------客户目录已满，添加失败-------------------" );
        }
    }

    /**
     * 修改客户操作
     */
    private void modifyCustomer ( ) {
        System.out.println ( "----------------------修改    客户-----------------------" );
        Customer cust;
        int number;
        while(true){
            System.out.print ("请选择要修改的客户编号(-1退出)" );
            number=CMUtility.readInt();
            if(number==-1){
                return;
            }
            cust=cl.getCustomer ( number-1 );
            if(cust==null){
                System.out.println ("无法找到指定客户！" );
            }
            else{
                break;
            }

        }
        //修改客户信息
        System.out.print ( "姓名("+cust.getName ()+"):");
        String name=CMUtility.readString ( 4,cust.getName () );
        System.out.print ( "性别("+cust.getGender ()+"):");
        char gender=CMUtility.readChar ( cust.getGender ());
        System.out.print ( "年龄("+cust.getAge ()+"):");
        int age=CMUtility.readInt (cust.getAge ());
        System.out.print ( "电话号码("+cust.getPhone ()+"):");
        String phone=CMUtility.readPhone (11,cust.getPhone ());
        System.out.print ( "email("+cust.getEmail ()+"):");
        String email=CMUtility.readString(25,cust.getEmail ());

        Customer cust1=new Customer(name,gender,age,phone,email);

        if ( cl.replaceCustomer ( number-1,cust1 ) ) {
            System.out.println ("----------------------修改    完成-----------------------" );
        }
        else{
            System.out.println ("----------------------修改    失败-----------------------" );
        }

    }

    /**
     * 删除客户操作
     */
    private void deleteCustomer ( ) {
        System.out.println ( "----------------------删除    客户-----------------------" );
        Customer cust;
        int number;
        while(true){
            System.out.print ("请选择要修改的客户编号(-1退出)" );
            number=CMUtility.readInt();
            if(number==-1){
                return;
            }
            cust=cl.getCustomer ( number-1 );
            if(cust==null){
                System.out.println ("无法找到指定客户！" );
            }
            else{
                break;
            }

        }
        //找到指定客户
        System.out.print ( "确认是否删除(Y/N):" );
        char isDelete = CMUtility.readCR ( );
        if ( isDelete=='Y' ){
            boolean isSuccess=cl.removeCustomer ( number-1 );
            if(isSuccess){
                System.out.println ("----------------------删除    成功-----------------------" );
            }
            else{
                System.out.println ("----------------------删除    失败-----------------------" );
            }

        }

    }

    /**
     * 展示客户列表
     */
    private void listAllCustomers ( ) {
//        System.out.println ( "展示客户" );
        System.out.println ("-------------------客户 列表-------------------" );
        int total=cl.getTotal ();
        if ( total==0 ){
            System.out.println ("列表暂无客户数据" );
        }
        else {
            System.out.println ("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱" );
            Customer[] cust=cl.getAllCustomer ();
            for ( int i=0; i<cust.length; i++ ){
                System.out.printf ("%-4d\t%-4s\t%-4s\t%-4d\t%-13s\t%s",
                        (i+1),cust[i].getName (),cust[i].getGender (),
                        cust[i].getAge (),cust[i].getPhone (),cust[i].getEmail () );
                System.out.println ( );
            }
        }
        System.out.println ("-----------------客户列 表完成-------------------" );

    }

    public static void main ( String[] args ) {
        CustomerView Csv = new CustomerView ( );
        Csv.enterMainMenu ( );
    }

}
