package study.querydsl.dto;

import lombok.Data;

/**
 * Created by kimdonghyun on 22/01/2020.
 */

@Data
public class UserDto {

    private String name;
    private int age;

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
