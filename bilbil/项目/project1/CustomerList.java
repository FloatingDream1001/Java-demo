package bilbil.项目.project1;

/**
 * @ codeing=utf-8
 * @Description 为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历的方法，供CustomerView调用
 * @Time : 2022/11/17 23:18
 * @Author: 曹志阳
 * @Classname CustomerList
 * @software :IntelliJ IDEA
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total;//记录已保存客户对象的数量

    /**
     * 初始化数组大小的构造器
     *
     * @param totalCustomer:用来指定数组长度
     */
    public CustomerList ( int totalCustomer ) {
        customers = new Customer[ totalCustomer ];
    }

    /**
     * 将指定客户添加到数组里
     *
     * @param customer
     * @return true:添加成果 false:添加失败
     */
    public boolean addCustomer ( Customer customer ) {
        if ( total >= customers.length ) {
            return false;
        }
        customers[ total++ ] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     *
     * @param index
     * @param customer
     * @return true:修改成功 false:修改失败
     */
    public boolean replaceCustomer ( int index, Customer customer ) {
        if ( index < 0 || index >= total ) {
            return false;
        }
        customers[ index ] = customer;
        return true;

    }

    /**
     * 删除指定位置上的元素
     *
     * @param index
     * @return true:删除成果  false:删除失败
     */
    public boolean removeCustomer ( int index ) {
        if ( index < 0 || index >= total ) {
            return false;
        }
        for ( int i = index ; i < total - 1 ; i++ ) {
            customers[ i ] = customers[ i + 1 ];
        }
        customers[ --total ] = null;
        return true;
    }

    /**
     * 获取所有客户信息
     *
     * @return true展示成果 false展示失败，数组为空
     */
    public Customer[] getAllCustomer ( ) {
        Customer[] custs = new Customer[ total ];
        for ( int i = 0 ; i < total ; i++ ) {
            custs[ i ] = customers[ i ];
        }
        return custs;
    }

    /**
     * 获取指定索引上的元素
     *
     * @param index
     * @return 返回指定位置上元素，或者null
     */
    public Customer getCustomer ( int index ) {
        if ( index < 0 || index >= total ) {
            return null;
        }
        return customers[ index ];
    }

    /**
     * 获取存储客户的数量
     * @return
     */
    public int getTotal ( ) {
        return total;
    }
}
