package com.javeriana.proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tool")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tool extends AbstractEntity
{
    @Setter
    @Getter
    @Column(name = "image_url")
    private String image_url;

    @Setter
    @Getter
    @Column(name = "description")
    private String description;

    public Tool(Long pId, String pName, String pImgUrl, String pDescription) 
    {
        super(pId, pName);
        this.image_url = pImgUrl;
        this.description = pDescription;
    }

    public Tool()
    {

    }
}
