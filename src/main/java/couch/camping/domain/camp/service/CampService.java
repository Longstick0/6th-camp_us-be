package couch.camping.domain.camp.service;

import couch.camping.controller.camp.dto.response.CampSearchPagingResponseDto;
import couch.camping.controller.camp.dto.response.CampSearchResponseDto;
import couch.camping.domain.camp.entity.Camp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CampService {
    void save(Camp camp);
    Camp getCampDetail(Long campId);
    Page<CampSearchResponseDto> getCampList(Pageable pageable, float rate, String name, String sigunguNm, String tag);
}
