package Domain;

import java.time.LocalDate;

public class Deal {
    
    private int id;
    private String agent;
    private LocalDate date;
    
    public Deal(int id, String agent, LocalDate date){
        this.id = id;
        this.agent = agent;
        this.date = date;
    }
    
    public int getId(){
        return id;
    }
    
    public String getAgent(){
        return agent;
    }
    
    public LocalDate getDate(){
        return date;
    }
//    
//    public void setId(){}
//
//    public void setAgent(){}
//
//    public void setDate(){}
}
