package com.javeriana.proyecto.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_type")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AccountType extends AbstractEntity
{
    public AccountType(Long pId, String pName)
    {
        super(pId, pName);
    }

    public AccountType()
    {
        super();
    }
}
