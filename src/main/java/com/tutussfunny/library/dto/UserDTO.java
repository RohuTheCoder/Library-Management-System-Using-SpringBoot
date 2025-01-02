package com.tutussfunny.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDTO {

    @JsonProperty("userid")
    private int userid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    public UserDTO(int userid, String name, String email) {
        this.userid = userid;
        this.name = name;
        this.email = email;
    }
}
