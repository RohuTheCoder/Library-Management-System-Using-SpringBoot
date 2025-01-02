package com.tutussfunny.library.controller;

import com.tutussfunny.library.dto.*;
import com.tutussfunny.library.service.AuthorService;
import com.tutussfunny.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping(path = "/save")
    public String savePublisher(@RequestBody PublisherSaveDTO publisherSaveDTO)
    {
        String publisherName = publisherService.addPublisher(publisherSaveDTO);
        return "Added Successfully";
    }

    @GetMapping(path = "/getAllPublisher")
    public List<PublisherDTO> getAllPublisher()
    {
        List<PublisherDTO> allPublishers = publisherService.getAllPublisher();
        return allPublishers;
    }

    @PutMapping(path = "/update")
    public String updatePublisher(@RequestBody PublisherUpdateDTO publisherUpdateDTO)
    {
        String publishername = publisherService.updatePublisher(publisherUpdateDTO);
        return publishername;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deletePublisher(@PathVariable(value = "id") int id)
    {
        String publishername = publisherService.deletePublisher(id);
        return "deleted Successfully";
    }
}