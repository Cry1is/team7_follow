package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long user_id;

    @Constraints.Required
    public String user_name;

    @Constraints.Required
    public String user_password;

    @Constraints.Required
    public String display_name;

    @Constraints.Required
    public String display_avatar;

    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("user_name", name)
                .findUnique();
    }

    public static User findById(Long id) {
        return User.find
                .where()
                .eq("user_id", id)
                .findUnique();
    }

    public static List<User> list() {
        return User.find
                .where()
                .findList();
    }
}
