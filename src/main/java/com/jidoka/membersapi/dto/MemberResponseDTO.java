package com.jidoka.membersapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class MemberResponseDTO {

    Long id;

    String name;

    String email;

    String role;

    String phoneNumber;
}
