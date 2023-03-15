package com.javeriana.proyecto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.javeriana.proyecto.Entities.AccountType;
import com.javeriana.proyecto.Entities.Permission;
import com.javeriana.proyecto.RelationEntities.AccountPermission;
import com.javeriana.proyecto.RelationEntities.AccountPermissionId;

@Repository
interface AccountPermissionRepository extends CrudRepository<AccountPermission, AccountPermissionId>
{
    @Query("SELECT ap.permission FROM AccountPermission ap WHERE ap.account.id = :accountId")
    List<Permission> findPermissionsByAccountId(@Param("accountId") Long accountId);

    @Query("SELECT ap.account FROM AccountPermission ap WHERE ap.permission.id = :permissionId")
    List<AccountType> findAccountsByPermissionId(@Param("permissionId") Long permissionId);

}

@Service
public class AccountPermissionService 
{
    @Autowired
    AccountPermissionRepository repo;

    public List<AccountPermission> getAll()
    {
        return (List<AccountPermission>) repo.findAll();
    }

    public List<Permission> getPermissionsByAccount(Long pId)
    {
        return repo.findPermissionsByAccountId(pId);
    }

    public List<AccountType> getAccountTypesByPermission(Long pId)
    {
        return repo.findAccountsByPermissionId(pId);
    }
}
