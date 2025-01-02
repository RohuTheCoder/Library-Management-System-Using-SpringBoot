package com.tutussfunny.library.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublisherSaveDTO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
