package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

//    @Value("#{target.username + ' ' + target.age}") // open projection (Member 엔티티를 가져와서 그 중 원하는 필드값만 조회함)
    String getUsername();
}
