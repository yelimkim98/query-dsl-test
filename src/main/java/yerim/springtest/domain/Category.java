package yerim.springtest.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "category")
  private List<MemberCategory> memberCategories = new ArrayList<>();

  @Builder
  public Category(Long id, String name, List<MemberCategory> memberCategories) {
    this.id = id;
    this.name = name;
    this.memberCategories = memberCategories;
  }
}
