package com.milan.kovacik.contacts.contacts.controller

import com.milan.kovacik.contacts.contacts.dto.Contact
import com.milan.kovacik.contacts.contacts.service.ContactService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("contacts")
class ContactController(
    private val contactService: ContactService
) {

    @GetMapping
    fun getContactList(): ResponseEntity<List<Contact>> = ResponseEntity(contactService.getAll(), HttpStatus.OK)

    @PostMapping
    fun createContact(@RequestBody contact: Contact): ResponseEntity<Contact> =
            ResponseEntity(contactService.save(contact), HttpStatus.CREATED)

    @GetMapping("/{id}")
    fun getContact(@PathVariable("id") id: Long): ResponseEntity<Contact> {
        Thread.sleep(2000) // simulate delay
        return ResponseEntity(contactService.get(id), HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun updateContact(@RequestBody contact: Contact, @PathVariable("id") id: Long): ResponseEntity<Contact> =
            ResponseEntity(contactService.update(contact, id), HttpStatus.CREATED)

    @DeleteMapping("/{id}")
    fun leaveTeam(@PathVariable("id") id: Long): ResponseEntity<Boolean> {
        contactService.delete(id)
        return ResponseEntity.noContent().build()
    }
}