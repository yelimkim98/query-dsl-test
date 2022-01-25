package yerim.springtest.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberResponse {

  private Long id;
  private String name;
  private List<String> categories = new ArrayList<>();

  public MemberResponse(Long id, String name, List<String> categories) {
    this.id = id;
    this.name = name;
    this.categories = categories;
  }
}
