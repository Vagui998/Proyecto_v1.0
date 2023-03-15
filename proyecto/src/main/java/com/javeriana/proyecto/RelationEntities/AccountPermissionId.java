package com.javeriana.proyecto.RelationEntities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class AccountPermissionId extends AbstractId
{
    @Setter
    @Getter
    @Column(name = "account_type_id")
    private Long accountId;

    @Setter
    @Getter
    @Column(name = "permission_id")
    private Long permissionId;


    public AccountPermissionId(Long pAccountId, Long pPermissionId)
    {
        super();
        this.accountId = pAccountId;
        this.permissionId = pAccountId;
    }

    public AccountPermissionId()
    {
        super();
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(accountId, permissionId);
    }

    @Override
    public boolean equals(Object obj)
     {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AccountPermissionId other = (AccountPermissionId) obj;
        return Objects.equals(accountId, other.permissionId) &&
                Objects.equals(accountId, other.permissionId);
    }

    @Override
    public Long getId0() 
    {
        return this.accountId;
    }

    @Override
    public Long getId1() 
    {
        return this.permissionId;
    }
    
}
