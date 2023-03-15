package com.javeriana.proyecto.RelationEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.javeriana.proyecto.Entities.AccountType;
import com.javeriana.proyecto.Entities.Permission;
import com.javeriana.proyecto.Interfaces.ICompoundId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@Entity
@Table(name = "account_permission")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AccountPermission extends AbstractRelationEntity
{
    @Getter
    @EmbeddedId
    private AccountPermissionId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("accountId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "account_type_id")
    @Getter
    @Setter
    private AccountType account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("permissionId")
    @JoinColumn(name = "permission_id")
    @Getter
    @Setter
    private Permission permission;

    public AccountPermission(AccountPermissionId pId, AccountType pAccount, Permission pPermission)
    {
        this.id = pId;
        this.account = pAccount;
        this.permission = pPermission;
    }

    public AccountPermission()
    {

    }

    @Override
    public void setId(ICompoundId pId) 
    {
        this.id = (AccountPermissionId) pId;
    }
}
