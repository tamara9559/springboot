package co.edu.cue.practicaSpring_.repositories.impl;

import co.edu.cue.practicaSpring_.domain.model.User;
import co.edu.cue.practicaSpring_.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> ListUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void removeUser(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }
}
