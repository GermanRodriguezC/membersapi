package com.jidoka.membersapi.controller;

import com.jidoka.membersapi.dto.MemberRequestDTO;
import com.jidoka.membersapi.dto.MemberResponseDTO;
import com.jidoka.membersapi.service.IMemberService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@AllArgsConstructor
public class MembersController {

    private final IMemberService memberService;

    @PostMapping
    public ResponseEntity<MemberResponseDTO> createMember(@Valid @RequestBody MemberRequestDTO memberRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.memberService.createMember(memberRequestDTO));
    }
}
