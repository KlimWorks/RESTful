package Resources;

import Domain.Deal;
import Service.DealService;
import java.time.LocalDate;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Locale;


/**
 * The REST resource implementation class.
 */

@Path("deals")
public class DealResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        List<Deal> response = DealService.findAll();
        return Response.ok(response).build();
    }
    
    @GET
    @Path("/{id}")
    public Response getOneWithId(@PathParam("id") int id) {
        Deal deal = DealService.findByID(id);
        return Response.ok(deal).build();
}
    
    @GET
    @Path("/agents/{agent}")
    public Response getOneWithAgent(@PathParam("agent") String agent) {
        Deal deal = DealService.findByAgent(agent);
        return Response.ok(deal).build();
}
    
    @GET
    @Path("/dates/{date}")
    public Response getOneWithDate(@PathParam("date") String date) {
        Deal deal = DealService.findByDate(date);
        return Response.ok(deal).build();
}
    @GET
    @Path("/agents/{agent}/dates/{date}")
    public Response getAllWithAgentAndDate(@PathParam("agent") String agent,
                                           @PathParam("date") String date) {
        List<Deal> deals = DealService.findByAgentAndDate(agent, date);
        return Response.ok(deals).build();
}
    
    @GET
    @Path("/agents/{agent}/startdate/{startdate}/enddate/{enddate}")
    public Response getAllWithAgentAndPeriod(@PathParam("agent") String agent,
                                           @PathParam("startdate") String startdate,
                                           @PathParam("enddate") String enddate) {
        List<Deal> deals = DealService.findByAgentAndPeriod(agent, startdate, enddate);
        return Response.ok(deals).build();
}
}



