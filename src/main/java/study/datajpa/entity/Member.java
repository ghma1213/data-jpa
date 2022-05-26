package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    // entity는 기본 생성자가 필요하다.
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}
