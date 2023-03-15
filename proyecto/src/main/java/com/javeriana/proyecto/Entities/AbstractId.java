package com.javeriana.proyecto.Entities;

import java.io.Serializable;

import com.javeriana.proyecto.Interfaces.ICompoundId;

import jakarta.persistence.Embeddable;
@Embeddable
public abstract class AbstractId implements Serializable, ICompoundId
{
    public AbstractId()
    {

    }

}
