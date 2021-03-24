package com.milan.kovacik.contacts.contacts.service

import com.milan.kovacik.contacts.contacts.dto.Contact
import com.milan.kovacik.contacts.contacts.repository.ContactRepository
import org.springframework.stereotype.Service

@Service
class ContactService(
    private val contactRepository: ContactRepository
) {

    fun save(contact: Contact) = contactRepository.save(contact)
    fun get(id: Long) = contactRepository.findById(id).orElseThrow { IllegalArgumentException("Invalid Id") }
    fun delete(id: Long) = contactRepository.deleteById(id)
    fun getAll() = contactRepository.findAll().toList()

    fun update(contact: Contact, id: Long): Contact {
        if(!contactRepository.existsById(id)) {
            throw IllegalArgumentException("Invalid Id")
        }
        contact.id = id
        return save(contact)
    }

}