package com.milan.kovacik.contacts.contacts.dto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Contact(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
        val name: String = "",
        val surename: String = "",
        val email: String = "",
        val phone: String = ""
)
