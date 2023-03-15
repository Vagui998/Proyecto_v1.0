package com.javeriana.proyecto.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends AbstractEntity 
{
    @Setter
    @Getter
    @Column(name = "pass")
    private String pass;

    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "acc_type_id")
    private AccountType accountType;

    public User(Long pId, String pName, String pPass, AccountType pAccountType)
    {
        super(pId, pName);
        this.pass = pPass;
        this.accountType = pAccountType;
    }

    public User()
    {
        
    }
}
