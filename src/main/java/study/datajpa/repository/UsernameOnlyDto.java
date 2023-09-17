package study.datajpa.repository;

// 구체 클래스를 활용하여 projection을 사용하는 방식
public class UsernameOnlyDto {

    private final String username;

    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
