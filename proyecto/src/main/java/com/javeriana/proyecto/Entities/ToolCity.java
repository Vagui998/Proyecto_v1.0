package com.javeriana.proyecto.Entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Embeddable
class ToolCityId implements Serializable
{

    @Setter
    @Getter
    @Column(name = "tool_id")
    private Long toolId;

    @Setter
    @Getter
    @Column(name = "city_id")
    private Long cityId;

}

@Entity
@Table(name = "tool_city")
public class ToolCity 
{
    @Getter
    @EmbeddedId
    private ToolCityId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("toolId")
    @Getter
    @Setter
    private Tool tool;

    @ManyToOne(fetch = FetchType.LAZY)
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
