package kr.re.kitri.model;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class Order {

    private String cust_id;
    private String username;
    private String address;
    private String email;
    private String order_date;
    private String pro_name;

    public Order() {
        return ;
    }


    @Override
    public String toString() {
        return "Order{" +
                "cust_id='" + cust_id + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", order_date='" + order_date + '\'' +
                ", pro_name='" + pro_name + '\'' +
                '}';
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public Order(String cust_id, String username, String address, String email, String order_date, String pro_name) {
        this.cust_id = cust_id;
        this.username = username;
        this.address = address;
        this.email = email;
        this.order_date = order_date;
        this.pro_name = pro_name;
    }
}
