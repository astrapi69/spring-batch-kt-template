package de.alpharogroup.spring.batch.entity

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY
import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * TODO delete after cloning template project
 **/
@Entity
class Bros(@Id @GeneratedValue(strategy = IDENTITY)@JsonIgnore var id: Long = -1,
           @Column(name = "first_name") var firstName: String = "", @Column(name = "last_name") var lastName: String = "") {

}