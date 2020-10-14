package io.tacsio.controllers

import io.tacsio.controllers.dtos.OrphanageForm
import io.tacsio.controllers.dtos.OrphanageView
import io.tacsio.models.Orphanage
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm
import java.util.stream.Collectors
import javax.transaction.Transactional
import javax.validation.Valid
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status.CREATED
import javax.ws.rs.core.Response.Status.NOT_FOUND

@Path("/orphanages")
@Produces(MediaType.APPLICATION_JSON)
class OrphanagesController {

    @GET
    fun index(): Response {
        val orphanages = Orphanage.findAll().stream()
                .map { OrphanageView(it) }
                .collect(Collectors.toList())

        return Response.ok(orphanages).build()
    }

    @POST
    @Transactional
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    fun create(@MultipartForm @Valid form: OrphanageForm): Response {
        val orphanage = form.toModel()

        return Response.status(CREATED).entity(OrphanageView(orphanage)).build()
    }

    @GET
    @Path("/{id}")
    fun show(@PathParam("id") id: Long): Response {
        val orphanage = Orphanage.findById(id)
                ?: return Response.status(NOT_FOUND).build()

        return Response.ok(OrphanageView(orphanage)).build()
    }
}