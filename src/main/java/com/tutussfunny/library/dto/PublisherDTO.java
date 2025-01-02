package com.tutussfunny.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PublisherDTO {

    @JsonProperty("publisherid")
    private int publisherid;
    @JsonProperty("name")
    private String name;

    public PublisherDTO(int publisherid, String name) {
        this.publisherid = publisherid;
        this.name = name;
    }
}
