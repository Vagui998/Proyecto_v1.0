package com.javeriana.proyecto.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.javeriana.proyecto.Entities.User;
import com.javeriana.proyecto.Interfaces.ICrudService;

@Repository
interface UserRepository extends ICrudService.IEntityRepository<User>
{

}

@Service
public class UserCrudService implements ICrudService<User>
{
    @Autowired
    UserRepository repo;

    public List<User> getAll()
    {
        return (List<User>) repo.findAll();
    }

    public User getByID(Long pId)
    {
        return repo.findById(pId).orElse(null);
    }

    public void newEntry(User pEntity)
    {
        repo.save(pEntity);
    }

    public void updateEntry(User pEntity)
    {
        Optional<User> targetEntity = repo.findById(pEntity.getID());
        if(targetEntity.isPresent())
        {
            repo.save(pEntity);
        }
        else
        {
            System.out.println("The requested ID is not found");
        }
    }

    public void deleteEntry(Long pId)
    {
        Optional<User> targetEntity = repo.findById(pId);
        if(targetEntity.isPresent())
        {
            repo.delete(targetEntity.get());
        }
        else
        {
            System.out.println("The requested ID is not found");
        }
    }
}
