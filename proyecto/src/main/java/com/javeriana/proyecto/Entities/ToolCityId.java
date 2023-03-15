package com.javeriana.proyecto.Entities;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public int hashCode() 
    {
        return Objects.hash(toolId, cityId);
    }

    @Override
    public boolean equals(Object obj)
     {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ToolCityId other = (ToolCityId) obj;
        return Objects.equals(toolId, other.toolId) &&
                Objects.equals(cityId, other.cityId);
    }

}