package com.javeriana.proyecto.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@Entity
@Table(name = "tool_city")
public class ToolCity 
{
    @Getter
    @EmbeddedId
    private ToolCityId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("toolId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Getter
    @Setter
    private Tool tool;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("cityId")
    @Getter
    @Setter
    private City city;

    @Getter
    @Setter
    @Column(name = "cantidad")
    private Integer quantity;

    public ToolCity(ToolCityId pId, Tool pTool, City pCity, Integer pQuantity)
    {
        this.id = pId;
        this.tool = pTool;
        this.city = pCity;
        this.quantity = pQuantity;
    }

    public ToolCity()
    {

    }
}
