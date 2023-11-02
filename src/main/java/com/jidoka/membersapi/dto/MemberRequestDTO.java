package com.jidoka.membersapi.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberRequestDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String role;

    @NotEmpty
    private String phoneNumber;

}
