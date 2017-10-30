package cz.fi.muni.pa165.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Martin Šmíd
 */
@Entity
@Getter
@Setter
public class Sport extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String name;

    public Sport(Long id) {
        this.id = id;
    }

    public Sport() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Sport)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Sport sport = (Sport) o;

        if (id != null ? !id.equals(sport.id) : sport.id != null) {
            return false;
        }
        return name != null ? name.equals(sport.name) : sport.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}