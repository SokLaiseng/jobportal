package jobportal.jobportal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users_type")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString


public class UsersType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;

    private String userTypeName;
    @OneToMany(targetEntity = Users.class, mappedBy = "userTypeId",cascade = CascadeType.ALL)
    private List<Users> users;


}