package com.idealista.domain;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * TODO JJ Code Review: En todos los modelos podemos utilizar lombok.
 */
@Data
@AllArgsConstructor
public class Ad {

    private Integer id;
    private Typology typology;
    private String description;
    private List<Picture> pictures;
    private Integer houseSize;
    private Integer gardenSize;
    private Integer score;
    private Date irrelevantSince;

    public boolean isComplete() {
        return (Typology.GARAGE.equals(typology) && !pictures.isEmpty())
                || (Typology.FLAT.equals(typology) && !pictures.isEmpty() && description != null && !description.isEmpty() && houseSize != null)
                || (Typology.CHALET.equals(typology) && !pictures.isEmpty() && description != null && !description.isEmpty() && houseSize != null && gardenSize != null);
    }
}
