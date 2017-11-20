package cz.muni.fi.pa165.service;

import cz.fi.muni.pa165.entity.User;
import cz.fi.muni.pa165.enums.Gendre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends BaseService<User> {

    /**
     * Finds users with the given email.
     *
     * @param email email to find
     * @return collection of found users with the email
     */
    List<User> findByEmail(String email);

    /**
     * Finds users with the given gender.
     *
     * @param gender gender to find
     * @return collection of found users with the gender
     */
    List<User> findByGender(Gendre gender);

    /**
     * Checks if the user is administrator.
     *
     * @return true iff user is administrator
     */
    boolean isAdmin();

    /**
     * Registers a new user with the given unencrypted password.
     *
     * @param user        user to register
     * @param rawPassword unencrypted password
     */
    void registerUser(User user, String rawPassword);

    /**
     * Registers a new user with the given unencrypted password and email address.
     *
     * @param user        user to register
     * @param rawPassword unencrypted password
     * @param email       email address
     */
    void registerUser(User user, String rawPassword, String email);

    /**
     * Authenticates the user. It checks that the password hash in the records.
     *
     * @param user         user to authenticate
     * @param passwordHash password hash
     * @return true iff the password hash is in the records
     */
    boolean authenticate(User user, String passwordHash);
}
