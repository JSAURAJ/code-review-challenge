package com.idealista.application;

/*
 * TODO JJ Code Review: No es buena praxis acceder a la capa de infraestructura desde la capa de aplicacion. 
 * Devolvemos el objeto de dominio y mapeamos en la capa de infraestructura.
 */
import com.idealista.domain.Ad;

import java.util.List;

public interface AdsService {

    List<Ad> findIrrelevantAds();
    List<Ad> findQualityAds();
    void calculateScores();
}
