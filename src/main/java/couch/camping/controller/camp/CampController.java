package couch.camping.controller.camp;

import couch.camping.controller.camp.dto.request.CampSaveRequestDto;
import couch.camping.controller.camp.dto.request.CampListSaveRequestDto;
import couch.camping.domain.camp.entity.Camp;
import couch.camping.domain.camp.service.CampService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/camps")
public class CampController {

    private final CampService campService;
    private final ModelMapper modelMapper;

    @PostMapping("")
    public String save(@RequestBody CampListSaveRequestDto campListSaveRequestDto) {

        for (CampSaveRequestDto campSaveRequestDto : campListSaveRequestDto.getItem()) {
            Camp map = modelMapper.map(campSaveRequestDto, Camp.class);
            campService.save(map);
        }
        return "ok";
    }
}