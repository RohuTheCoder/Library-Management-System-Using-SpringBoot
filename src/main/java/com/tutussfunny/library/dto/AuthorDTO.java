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

public class AuthorDTO {

    @JsonProperty("authorid")
    private int authorid;
    @JsonProperty("name")
    private String name;

    public AuthorDTO(int authorid, String name) {
        this.authorid = authorid;
        this.name = name;
    }
}
