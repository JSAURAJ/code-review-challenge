package com.idealista.infrastructure.api;

import java.util.List;
import java.util.stream.Collectors;

import com.idealista.application.AdsService;
import com.idealista.domain.Ad;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ads")
@RestController
public class AdsController {

    @Autowired
    private AdsService adsService;

    AdsMapper mapper = Mappers.getMapper( AdsMapper.class );

    @GetMapping("/")
    public ResponseEntity<List<IrrelevantAd>> qualityListing() {
        List<Ad> ads = adsService.findQualityAds();
        return ResponseEntity.ok(ads.stream().map(ad -> mapper.toQualityResponse(ad)).collect(Collectors.toList()));
    }

    @GetMapping("/irrelevant")
    public ResponseEntity<List<QualityAd>> irrelevantListing() {
        List<Ad> ads = adsService.findIrrelevantAds();
        return ResponseEntity.ok(ads.stream().map(ad -> mapper.toIrrelevantResponse(ad)).collect(Collectors.toList()));
    }

    // TODO JJ Code Review: Cualquier operacion que haga cambios debe ser un POST.
    @PostMapping("/score")
    public ResponseEntity<Void> calculateScore() {
        adsService.calculateScores();
        return ResponseEntity.accepted().build();
    }
}
