package com.milan.kovacik.contacts.contacts.repository

import com.milan.kovacik.contacts.contacts.dto.Contact
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository: CrudRepository<Contact, Long>