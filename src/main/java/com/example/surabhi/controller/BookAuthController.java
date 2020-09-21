package com.example.ashwani.controller;

import com.example.ashwani.request.SAuthorRequest;
import com.example.ashwani.request.SBookRequest;
import com.example.ashwani.service.AuthorCRUDService;
import com.example.ashwani.service.BOOKCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/author")

public class BookAuthController {
    @Autowired
    AuthorCRUDService authorCRUDService;

    @Autowired
    BOOKCRUDService bookcrudService;

    @RequestMapping(method = RequestMethod.POST)
        public void createAuth(@RequestBody SAuthorRequest sAuthorRequest) {
            authorCRUDService.saveAuthor(sAuthorRequest);
        }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
        public void deleteAuth(@PathVariable String id) {
            authorCRUDService.deleteAuther(id);
        }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public void updateAuth(@RequestBody SAuthorRequest sAuthorRequest) {
        authorCRUDService.updateAuther(sAuthorRequest);
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public void createBook(@RequestBody SBookRequest sBookRequest) {
        bookcrudService.saveBook(sBookRequest);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteBook(@PathVariable String id) {
        bookcrudService.deleteBook(id);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT, produces = "application/json")
    public void updateBook(@RequestBody SAuthorRequest sAuthorRequest) {
        bookcrudService.updateBook(sAuthorRequest);
    }

}
