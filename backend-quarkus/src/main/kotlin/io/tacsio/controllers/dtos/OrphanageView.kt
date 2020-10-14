package io.tacsio.controllers.dtos

import io.tacsio.models.Orphanage

data class OrphanageView(val orphanage: Orphanage) {
    val id = orphanage.id
    val name = orphanage.name
    val longitude = orphanage.longitude
    val latitude = orphanage.latitude
    val about = orphanage.about
    val instructions = orphanage.instructions
    val openingHours = orphanage.openingHours
    val openOnWeekends = orphanage.openOnWeekends
}