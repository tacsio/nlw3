package io.tacsio.controllers.dtos

import io.tacsio.models.Orphanage
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.ws.rs.FormParam

class OrphanageForm() {

    @NotBlank
    @FormParam("name")
    lateinit var name: String

    @NotNull
    @FormParam("latitude")
    lateinit var latitude: String

    @NotNull
    @FormParam("longitude")
    lateinit var longitude: String

    @NotEmpty
    @FormParam("about")
    lateinit var about: String

    @NotEmpty
    @FormParam("instructions")
    lateinit var instructions: String

    @NotEmpty
    @FormParam("opening_hours")
    lateinit var openingHours: String

    @NotNull
    @FormParam("open_on_weekends")
    lateinit var openOnWeekends: String

    fun toModel(): Orphanage = Orphanage(
            name,
            latitude.toDouble(),
            longitude.toDouble(),
            about,
            instructions,
            openingHours,
            openOnWeekends.toBoolean())
}
