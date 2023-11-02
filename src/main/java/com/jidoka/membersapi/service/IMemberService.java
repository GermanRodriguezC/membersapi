package com.jidoka.membersapi.service;

import com.jidoka.membersapi.dto.MemberRequestDTO;
import com.jidoka.membersapi.dto.MemberResponseDTO;

public interface IMemberService {

    MemberResponseDTO createMember(MemberRequestDTO memberRequestDTO);
}
