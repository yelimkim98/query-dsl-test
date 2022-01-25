package yerim.springtest.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String name;

    @OneToMany(mappedBy = "member")
    private List<MemberCategory> memberCategories = new ArrayList<>();

    @Builder
    public Member(Long id, String name, List<MemberCategory> memberCategories) {
        this.id = id;
        this.name = name;
        this.memberCategories = memberCategories;
    }
}
