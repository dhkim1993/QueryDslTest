package study.querydsl.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by kimdonghyun on 20/01/2020.
 */

@Entity
@Getter
@Setter
public class Hello {

    @Id
    @GeneratedValue
    private Long id;


}
