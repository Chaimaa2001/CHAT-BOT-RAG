package com.example.chatbot_finale.services;

import com.example.chatbot_finale.entities.Person;
import com.example.chatbot_finale.repository.PersonRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import org.springframework.stereotype.Service;


@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person,Long, PersonRepository> {

}
