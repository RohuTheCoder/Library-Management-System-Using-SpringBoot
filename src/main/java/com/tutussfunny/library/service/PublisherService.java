package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.PublisherDTO;
import com.tutussfunny.library.dto.PublisherSaveDTO;
import com.tutussfunny.library.dto.PublisherUpdateDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);

    List<PublisherDTO> getAllPublisher();

    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

    String deletePublisher(int id);
}
