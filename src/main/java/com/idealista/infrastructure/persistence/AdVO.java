package com.idealista.infrastructure.persistence;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class AdVO {

    private Integer id;
    private String typology;
    private String description;
    private List<Integer> pictures;
    private Integer houseSize;
    private Integer gardenSize;
    private Integer score;
    private Date irrelevantSince;

}
