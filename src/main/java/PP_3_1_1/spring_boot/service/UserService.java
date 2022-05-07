package PP_3_1_1.spring_boot.service;

import PP_3_1_1.spring_boot.models.User;

import java.util.List;

public interface UserService {
    public User findById(Long id);

    public List<User> findAll();
    public void saveUser(User user);

    public void deleteById(Long id);
    public void updateUser(User user);
}
