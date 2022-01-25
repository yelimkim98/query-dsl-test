package yerim.springtest.controller;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yerim.springtest.dto.MemberResponse;
import yerim.springtest.repository.TestJpqlRepository;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestJpqlRepository testJpqlRepository;

  @GetMapping("/jpql-members")
  public List<MemberResponse> jpqlFindAll() {
    return testJpqlRepository.findAll().stream().map(
        member -> {
          List<String> categoryNames = member.getMemberCategories().stream()
              .map(memberCategory -> memberCategory.getCategory().getName())
              .collect(Collectors.toList());
          return new MemberResponse(member.getId(), member.getName(), categoryNames);
        }).collect(Collectors.toList());
  }

  @GetMapping("/querydsl-members")
  public List<MemberResponse> querydslFindAll() {
    return testJpqlRepository.findAll().stream().map(
        member -> {
          List<String> categoryNames = member.getMemberCategories().stream()
              .map(memberCategory -> memberCategory.getCategory().getName())
              .collect(Collectors.toList());
          return new MemberResponse(member.getId(), member.getName(), categoryNames);
        }).collect(Collectors.toList());
  }
}
