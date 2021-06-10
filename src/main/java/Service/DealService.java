
package Service;

import Domain.Deal;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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
    
    public static List<Deal> findByAgent(String agent){
        List<Deal> targetList = new ArrayList<>();
        for(Deal deal : dealList){
            if(deal.getAgent().equals(agent) 
                    ) {
                targetList.add(deal);
                break;
            }
        }
        return targetList;
    }
    
    public static List<Deal> findByDate(String date){
        List<Deal> targetList = new ArrayList<>();
        for(Deal deal : dealList){
            if(deal.getDate().equals(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US))) 
                    ) {
                targetList.add(deal);
                break;
            }
        }
        return targetList;
    }
    
    public static Deal findByAgentAndDate(String agent, String date){
        Deal targetDeal = null;
        for(Deal deal : dealList){
            if(deal.getAgent().equals(agent) &&
                    deal.getDate().equals(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US))) 
                    ) {
                targetDeal = deal;
            }
        }
        return targetDeal;
    }
    
    public static List<Deal> findByAgentAndPeriod(String agent, String startDate, String endDate){
        List<Deal> targetList = new ArrayList<>();
        for(Deal deal : dealList){
            if(deal.getAgent().equals(agent) &&
                    deal.getDate().isAfter(LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US))) &&
                    deal.getDate().isBefore(LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US)))
                    ) {
                targetList.add(deal);
            }
        }
        return targetList;
    }
}
