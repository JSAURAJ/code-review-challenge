package com.idealista.infrastructure.api;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.idealista.domain.Ad;

@Mapper
public interface AdsMapper {

    String expressionPicturesMap = "java(prop.getPictures().stream().map(p -> p.getUrl()).collect(java.util.stream.Collectors.toList()))";
    
    @Mapping(target = "pictureUrls", expression=expressionPicturesMap)
    public IrrelevantAd toQualityResponse(Ad prop);
    @InheritInverseConfiguration
    @Mapping(target = "pictures", ignore = true)
    public Ad toDomain(IrrelevantAd prop);

    @Mapping(target = "pictureUrls", expression=expressionPicturesMap)
    public QualityAd toIrrelevantResponse(Ad prop);
    @InheritInverseConfiguration    
    @Mapping(target = "pictures", ignore = true)
    @Mapping(target = "score", ignore = true)
    @Mapping(target = "irrelevantSince", ignore = true)
    public Ad toDomain(QualityAd prop);
}
