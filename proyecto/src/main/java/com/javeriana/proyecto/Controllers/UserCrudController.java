package com.javeriana.proyecto.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.proyecto.Entities.User;

@RestController
@RequestMapping("/users")
public class UserCrudController extends AbstractCrudController<User>
{
    public List<User> getAllUsers()
    {
        return getAll();
    }

    public User getUserById(Long pId)
    {
        return getByID(pId);
    }

    public void newTool(@RequestBody User pEntity)
    {
        newEntry(pEntity);
    }

    public void updateTool(@RequestBody User pEntity) 
    {
        updateEntry(pEntity);
    }

    public void deleteTool(Long pId)
    {
        deleteEntry(pId);
    } 
}
