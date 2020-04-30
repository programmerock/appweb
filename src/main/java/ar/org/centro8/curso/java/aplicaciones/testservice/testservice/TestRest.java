package ar.org.centro8.curso.java.aplicaciones.testservice.testservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("info")
public class TestRest {
    @GET
    public String info(){
        return "Web Service Rest!";
    }
}
