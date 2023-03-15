package com.javeriana.proyecto.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "permission")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Permission extends AbstractEntity
{
    public Permission(Long pId, String pName)
    {
        super(pId, pName);
    }

    public Permission()
    {
        super();
    }
}
