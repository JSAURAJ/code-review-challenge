package com.idealista.domain;

import java.util.List;

public interface AdRepository {

    /*
     * TODO JJ Code Review: Los metodos basicos pueden ser de tipo generico
     * 
     */
    List<Ad> findAllAds();

    void save(Ad ad);

    /*
     * TODO JJ Code Review: Cambiar interfaz y exponer metodos que no contengan logica de negocio
     * 
     * Ejemplo:
     * findRelevantAdsByScore(min=0, max=100)
     * findRelevantAdsByMinScore(min=0)
     * findRelevantAdsByMaxScore(max=0)
     */
    List<Ad> findRelevantAds();

    List<Ad> findIrrelevantAds();
}
