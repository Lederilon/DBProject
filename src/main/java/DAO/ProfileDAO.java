package DAO;

import domain.Profile;
import domain.ProfileCategory;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @author KostyaHrishenko
 */
public interface ProfileDAO {
    /**
     *
     * @param login
     * @param password
     * @param registrationTime
     * @param name
     * @param sex
     * @param eMail
     * @param category
     * @return
     */
    public Profile createProfile(String login, String password, Date registrationTime, String name, Profile.Sex sex, String eMail, ProfileCategory category) throws SQLException;

    /**
     *
     * @param id
     * @return
     */

    public Profile getById(int id) throws SQLException;

    /**
     *
     * @param id
     */
    public void deleteById(int id);

    /**
     *
     * @param profile
     */
    public void updateProfile(Profile profile);

    /**
     *
     * @return
     */
    public List<Profile> getAll();




}
