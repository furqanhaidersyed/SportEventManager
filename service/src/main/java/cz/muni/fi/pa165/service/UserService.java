package cz.muni.fi.pa165.service;

import cz.fi.muni.pa165.entity.User;
import cz.fi.muni.pa165.enums.Gendre;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Martin Smid
 */
@Service
public interface UserService extends BaseService<User> {

    /**
     * Finds user with the given email.
     *
     * @param email email to find
     * @return found user with the email
     */
    User findByEmail(String email);

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
     * @param user user to check for administrator role
     * @return true iff user is administrator
     */
    boolean isAdmin(User user);

    /**
     * Registers a new user with the given unencrypted password and email address.
     *
     * @param user     user to register
     * @param password unencrypted password
     * @param email    email address
     */
    void registerUser(User user, String password, String email);

    /**
     * Authenticates the user. It checks that the password hash in the records.
     *
     * @param user     user to authenticate
     * @param password password
     * @return true iff the password hash is in the records
     */
    boolean authenticate(User user, String password);
}
