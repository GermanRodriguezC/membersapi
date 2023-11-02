package com.jidoka.membersapi.service.impl;

import com.jidoka.membersapi.domain.Member;
import com.jidoka.membersapi.dto.MemberRequestDTO;
import com.jidoka.membersapi.dto.MemberResponseDTO;
import com.jidoka.membersapi.repository.MemberRepository;
import com.jidoka.membersapi.service.IMemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MemberServiceImpl implements IMemberService {

    private final MemberRepository memberRepository;
    @Override
    public MemberResponseDTO createMember(MemberRequestDTO memberRequestDTO) {
        Member member = this.memberRepository.save(Member.builder()
                .name(memberRequestDTO.getName())
                .role(memberRequestDTO.getRole())
                .phoneNumber(memberRequestDTO.getPhoneNumber())
                .email(memberRequestDTO.getEmail())
                .build());

    return MemberResponseDTO.builder()
            .id(member.getId())
            .name(member.getName())
            .role(member.getRole())
            .phoneNumber(member.getPhoneNumber())
            .email(member.getEmail())
            .build();
    }
}
