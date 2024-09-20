package boot.PP_3_1_1SpringBoot.dao;



import boot.PP_3_1_1SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);
}
