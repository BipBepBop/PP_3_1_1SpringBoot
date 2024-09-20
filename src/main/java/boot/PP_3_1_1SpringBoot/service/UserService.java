package boot.PP_3_1_1SpringBoot.service;


import boot.PP_3_1_1SpringBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);
}
