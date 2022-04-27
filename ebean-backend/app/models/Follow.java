package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import org.springframework.context.annotation.Primary;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Follow extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long edge_id;

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
    public Long user_id;

    @Constraints.Required
    @ManyToMany(mappedBy = "User")
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

    public static List<Follow> listBySource(Long user) {
        return Follow.find
                .where()
                .eq("user_id", user)
                .findList();
    }

    public static List<Follow> listByTarget(Long other) {
        return Follow.find
                .where()
                .eq("other_id", other)
                .findList();
    }
}