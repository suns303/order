package kr.re.kitri;

import kr.re.kitri.model.Order;
import kr.re.kitri.service.OrderService;

import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderMain {

    public static void main(String[] args) {

        //드라이버 로딩은 OrderService 생성자에 포함시키면 됨
        OrderService service = new OrderService();

        List<Order> list =service.getOrderList();

        if(list.size()>0){
            list.forEach(System.out::println);
        }else {
            System.out.println("데이터가 없습니다");
        }

    }
}
