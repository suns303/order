package kr.re.kitri.service;

import kr.re.kitri.model.Order;
import kr.re.kitri.util.OrderConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderService {


    //Driver loading
    public OrderService() {
        try {
            Class.forName(OrderConstants.DRIVER_POSTGRES);
            System.out.println("driver ok..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getOrderList() {

        String query = "select a.cust_id,a.username,a.address,a.email,b.order_date,b.pro_name\n" +
                "from customer a, orders b where a.cust_id = b.cust_id\n" +
                "order by cust_id";
        List<Order> list = new ArrayList<>();

        Connection conn = this.getConnection();
        if (conn != null) {
            try {
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();

                userlist(rs, list);

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    private void userlist(ResultSet rs, List<Order> list) throws SQLException {

        Order user;
        while (rs.next()) {
            user = new Order();
            user.setCust_id(rs.getString(1));
            user.setUsername(rs.getString(2));
            user.setAddress(rs.getString(3));
            user.setEmail(rs.getString(4));
            user.setOrder_date(rs.getString(5));
            user.setPro_name(rs.getString(6));

            list.add(user);
        }
    }
    private Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(
                    OrderConstants.DB_URL,
                    OrderConstants.USERNAME,
                    OrderConstants.PASSWORD
            );
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
