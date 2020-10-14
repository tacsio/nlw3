package io.tacsio.models

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import javax.persistence.*

@Entity
@Table(name = "orphanages")
class Orphanage() : PanacheEntityBase {
    companion object : PanacheCompanion<Orphanage, Long>

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    lateinit var name: String
    var longitude: Double? = null
    var latitude: Double? = null
    lateinit var about: String
    lateinit var instructions: String

    @Column(name = "opening_hours")
    lateinit var openingHours: String

    @Column(name = "open_on_weekends")
    var openOnWeekends: Boolean? = null

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "orphanage_id")
    var images: List<Image> = mutableListOf()

    constructor(name: String, latitude: Double, longitude: Double, about: String, instructions: String, openingHours: String, openOnWeekends: Boolean) : this() {
        this.name = name
        this.latitude = latitude
        this.longitude = longitude
        this.about = about
        this.instructions = instructions
        this.openingHours = openingHours
        this.openOnWeekends = openOnWeekends
    }

}