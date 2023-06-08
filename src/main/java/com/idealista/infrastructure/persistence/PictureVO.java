package com.idealista.infrastructure.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PictureVO {

    private Integer id;
    private String url;
    private String quality;

}
