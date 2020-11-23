package edu.upc.dsa.services;

import edu.upc.dsa.MuestraToLab;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/muestras")
@Path("/muestras")
public class MuestraService {
    private MuestraManager tm;

    public MuestraService() {
        this.tm = MuestraToLab.getInstance();

        }


    }

    @GET
    @ApiOperation(value = "get all muestras", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = muestra.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getmuestra() {

        List<muestra> tracks = this.tm.findAll();

        GenericEntity<List<muestra>> entity = new GenericEntity<List<muestra>>(tracks) {};
        return Response.status(201).entity(entity).build()  ;

    }

    @GET
    @ApiOperation(value = "get a Tmuestra", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = muestra.class),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{idmuestra}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getmuestra(@PathParam("idmuestra") String idmuestra) {
        muestra m = this.tm.getmuestra(idmuestra);
        if (m == null) return Response.status(404).build();
        else  return Response.status(201).entity(t).build();
    }

    @DELETE
    @ApiOperation(value = "delete a muestra", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Muestra not found")
    })
    @Path("/{idmuestra}")
    public Response deletemuestra(@PathParam("idmuestra") String idmuestra) {
        muestra m = this.tm.getmuestra(idmuestra);
        if (m == null) return Response.status(404).build();
        else this.tm.deletemuestra(idmuestra);
        return Response.status(201).build();
    }

    @PUT
    @ApiOperation(value = "update a muestra", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/")
    public Response updatemuestra(muestra mues) {

        muestra m = this.tm.updatemuestra(mues);

        if (m == null) return Response.status(404).build();

        return Response.status(201).build();
    }



    @POST
    @ApiOperation(value = "create a new muestra", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=muestra.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newmuestra(muestra mues) {

        if (muestra.getIdmuestra()==null || muestra.getIdclinic()==null || muestra.getId()==null || muestra.getIdlab()==null || muestra.getFecha()==null)  return Response.status(500).entity(muestra).build();
        this.tm.addmuestra(muestra);
        return Response.status(201).entity(track).build();

}
