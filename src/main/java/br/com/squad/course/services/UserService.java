package br.com.squad.course.services;

import br.com.squad.course.entities.User;
import br.com.squad.course.repositories.UserRepository;
import br.com.squad.course.services.exceptions.DatabaseException;
import br.com.squad.course.services.exceptions.ResourceNotfoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotfoundException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotfoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }

    }

    public User update(Long id,User obj){
       try {
           User entity = repository.getReferenceById(id);
           updateData(entity, obj);
           return repository.save(entity);
       }catch (EntityNotFoundException e){
           throw new ResourceNotfoundException(id);
       }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }



}
