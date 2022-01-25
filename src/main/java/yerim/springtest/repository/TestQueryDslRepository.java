package yerim.springtest.repository;

import java.util.List;
import yerim.springtest.domain.Member;

public interface TestQueryDslRepository {

  List<Member> findAll();
}
