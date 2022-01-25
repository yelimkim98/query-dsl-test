package yerim.springtest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yerim.springtest.domain.Member;

@Repository
public interface TestRepository extends JpaRepository<Member, Long> {

  @Query("select distinct m from Member m "
      + "left join fetch m.memberCategories memberCategory "
      + "left join fetch memberCategory.category")
  List<Member> findAll();
}
