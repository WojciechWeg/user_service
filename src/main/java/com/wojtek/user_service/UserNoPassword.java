package com.wojtek.user_service;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserNoPassword {

    String login;

    String name;

    String surname;

}
