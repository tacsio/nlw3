package io.tacsio.models

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import javax.persistence.*

@Entity
@Table(name = "images")
class Image : PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    lateinit var path: String
}