package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Follow extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long edge_id;

    @Constraints.Required
    public Long user_id;

    @Constraints.Required
    public Long other_id;

    public static Find<Long, Follow> find = new Find<Long, Follow>(){};

    public static Follow findByEdge(Long edge) {
        return Follow.find
                .where()
                .eq("edge_id", edge)
                .findUnique();
    }

    public static Follow findByUsers(Long user, Long other) {
        return Follow.find
                .where()
                .eq("user_id", user)
                .eq("other_id", other)
                .findUnique();
    }

    public static Follow[] listBySource(Long user) {
        return Follow.find
                .where()
                .eq("user_id", user);
    }

    public static Follow[] listByTarget(Long other) {
        resturn Follow.find
                .where()
                .eq("other_id", other);
    }
}