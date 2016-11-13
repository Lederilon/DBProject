package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author KostyaHrishenko
 */
public class Profile {

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public enum Sex{
        M("M"),F("F");
        private String name;
        Sex(String  name) {
        this. name = name;
        }

        public String getName() {
            return  name;
        }
    };
    private final int id;
    private String login;
    private String password;
    private Date registrationTime;
    private String name;
    private Sex sex;
    private ProfileCategory category;
    private String email;
    public Profile(int id,String login, String password, Date registrationTime, String name, Sex sex, String eMail,ProfileCategory category) {
        this.login = login;
        this.password = password;
        this.registrationTime = registrationTime;
        this.name = name;
        this.sex = sex;
        this.email = eMail;
        this.category = category;
        this.id = id;
    }
    public ProfileCategory getCategory() {
        return category;
    }
    public void setCategory(ProfileCategory category) {
        this.category = category;
    }

}
