package com.Backend.Zidane.Store.App.Controllers;

import java.util.List;

import com.Backend.Zidane.Store.App.Model.Collection;
import com.Backend.Zidane.Store.App.Repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collections")
public class CollectionsController {

    @Autowired
    CollectionRepository collectionRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Collection> getAllCollections() {
        List<Collection> collections = collectionRepository.findAll();
        return collections;
    }
}
