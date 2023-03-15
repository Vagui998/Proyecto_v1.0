package com.javeriana.proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.proyecto.Services.AccountPermissionService;
import com.javeriana.proyecto.Entities.AccountType;
import com.javeriana.proyecto.Entities.Permission;
import com.javeriana.proyecto.RelationEntities.AccountPermission;

@RestController
@RequestMapping("/userPermission")
public class AccountPermissionController
{
    @Autowired
    private AccountPermissionService service;

    @GetMapping(value = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<AccountPermission> getAll()
    {
        return service.getAll();
    }

    @GetMapping(value = "/getPermissions/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Permission> getPermissionsByAccount(@PathVariable(value = "id") Long pId)
    {
        return service.getPermissionsByAccount(pId);
    }

    @GetMapping(value = "/getAccountTypes/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<AccountType> getAccountTypesByPermission(@PathVariable(value = "id") Long pId)
    {
        return service.getAccountTypesByPermission(pId);
    }
}
