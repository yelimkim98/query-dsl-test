package yerim.springtest.repository;

import com.querydsl.jpa.JPQLQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import yerim.springtest.domain.Member;
import yerim.springtest.domain.QCategory;
import yerim.springtest.domain.QMember;
import yerim.springtest.domain.QMemberCategory;

@Repository
@RequiredArgsConstructor
public class TestQueryDslRepositoryImpl implements TestQueryDslRepository{

  private final JPQLQueryFactory queryFactory;

  @Override
  public List<Member> findAll() {
    QMember member = QMember.member;
    QMemberCategory memberCategory = QMemberCategory.memberCategory;
    QCategory category = QCategory.category;

    return queryFactory.selectFrom(member).distinct()
        .leftJoin(member.memberCategories, memberCategory)
        .fetchJoin()
        .leftJoin(memberCategory.category, category)
        .fetchJoin()
        .fetch();
  }
}
