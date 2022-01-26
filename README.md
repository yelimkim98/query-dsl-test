# QueryDSL 연습한 내용 정리
### 1. 여러개의 테이블들에 대한 fetch join
   - JPQL
     ```java
     @Query("select distinct m from Member m "
         + "left join fetch m.memberCategories memberCategory "
         + "left join fetch memberCategory.category")
     List<Member> findAll();
     ```
   - QueryDSL
     ```java
     public List<Member> findAll() {
        return jpqlQueryFactory.selectFrom(member).distinct()
            .leftJoin(member.memberCategories, memberCategory)
            .fetchJoin()
            .leftJoin(memberCategory.category, category)
            .fetchJoin()
            .fetch();
     }
     ```
