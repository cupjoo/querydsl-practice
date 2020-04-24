package study.querydslpractice.repository;

import study.querydslpractice.dto.MemberSearchCondition;
import study.querydslpractice.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
}
