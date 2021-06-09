
package Service;

import Domain.Deal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DealService {
    
    private static List<Deal> dealList = new ArrayList(Arrays.asList( 
            new Deal(345, "Alex", LocalDate.of(2021, Month.JUNE, 1)),
            new Deal(346, "Alex", LocalDate.of(2021, Month.JUNE, 2)),
            new Deal(347, "Bob", LocalDate.of(2021, Month.JUNE, 2)),
            new Deal(348, "Alex", LocalDate.of(2021, Month.JUNE, 3)),
            new Deal(349, "Bob", LocalDate.of(2021, Month.JUNE, 5)),
            new Deal(350, "Alex", LocalDate.of(2021, Month.JUNE, 6))
    ));
    
    public static List<Deal> findAll(){
        return dealList;
    }
    
    public static Deal findByID(int id){
        Deal targetDeal = null;
        for(Deal deal : dealList){
            if(deal.getId() == id) {
                targetDeal = deal;
                break;
            }
        }
        return targetDeal;
    }
}
