package couch.camping.controller.comment.dto.response;


import couch.camping.domain.comment.entity.Comment;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "로그인 후 커뮤니티 단건조회 응답 DTO")
public class CommentRetrieveLoginResponseDto extends CommentRetrieveResponseDto{

    private boolean isChecked;

    public CommentRetrieveLoginResponseDto(Comment comment, boolean isChecked) {
        super(comment);
        this.isChecked = isChecked;
    }
}
