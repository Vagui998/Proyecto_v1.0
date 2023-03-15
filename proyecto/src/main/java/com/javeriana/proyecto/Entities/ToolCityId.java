package com.javeriana.proyecto.Entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class ToolCityId implements Serializable
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