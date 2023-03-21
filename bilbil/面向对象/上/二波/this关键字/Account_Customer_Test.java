package bilbil.面向对象.上.二波.this关键字;

/**
 * @ codeing=utf-8
 * @Time : 2022/11/11 21:58
 * @Author: 曹志阳
 * @Classname Account_Customer_Test
 * @software :IntelliJ IDEA
 */
public class Account_Customer_Test {
    public static void main ( String[] args ) {
        Customer cu=new Customer("Cao","zhiyang");
        Account ac=new Account(1000,2000,0.0123);
        cu.setAccount (ac);
        cu.getAccount ().deposit ( 100 );
        cu.getAccount ().withdraw ( 960 );
        cu.getAccount ().withdraw ( 2000 );
        System.out.printf ( "Customer[ %s, %s] has a account: id is %d annualInterestRate is %.3f%c ，balance is %.2f\n" ,cu.getFirstName (),cu.getLastName (),
                            cu.getAccount().getId (),cu.getAccount().getAnnualInterestRate ()*100,'%',cu.getAccount().getBalance ());

        Bank bank = new Bank();
        bank.addCustomer ( "Cao","zhiyang" );
        bank.getCustomer(0).setAccount ( new Account(2000) );
        double blance=bank.getCustomer(0).getAccount ().getBalance ( );
        System.out.println ("客户："+bank.getCustomer(0).getFirstName ()+"余额为："+blance );

        System.out.println ("------------------------------------" );
        bank.addCustomer ( "杨","万里" );
        System.out.println (bank.getNumberOfCustomers () );

    }
}
class Account{
    private int id;//账户
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account(double balance){
        this.balance = balance;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public void setBalance ( double balance ) {
        this.balance = balance;
    }

    public void setAnnualInterestRate ( double annualInterestRate ) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId ( ) {
        return id;
    }

    public double getBalance ( ) {
        return balance;
    }

    public double getAnnualInterestRate ( ) {
        return annualInterestRate;
    }

    public void withdraw(double amount){//取钱
        if(balance<amount){
            System.out.println ("余额不足取款失败" );
            return;
        }
        balance-=amount;
        System.out.println ("取款成功，余额还剩："+balance );
    }

    public void deposit(double amount){//存钱
        if ( amount>0 ){
            balance+=amount;
            System.out.println ("存款成功，目前余额为"+balance );
        }
    }
}

class Customer{//客户
    private String firstName;
    private String LastName;
    private Account account;

    public Customer(String firstName, String LastName){
        this.firstName=firstName;
        this.LastName=LastName;
    }

    public String getFirstName ( ) {
        return firstName;
    }

    public String getLastName ( ) {
        return LastName;
    }

    public void setAccount ( Account account ) {
        this.account = account;
    }

    public Account getAccount ( ) {
        return account;
    }
}

class Bank{
    private Customer[] custarr=new Customer[10];//存放客户的数组
    private int numberOfCustomers;

    public Bank(){

    }

    //添加客户
    public void addCustomer(String firstName,String LastName){
        Customer cust = new Customer(firstName,LastName);
        custarr[numberOfCustomers++]=cust;
    }

    //获取客户个数
    public int getNumberOfCustomers ( ) {
        return numberOfCustomers;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index) {
        if ( index>=0&&index<numberOfCustomers ){
            return custarr[index];
        }
        return null;
    }
}
