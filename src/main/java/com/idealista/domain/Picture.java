package com.idealista.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Picture {
    private Integer id;
    private String url;
    private Quality quality;
}
