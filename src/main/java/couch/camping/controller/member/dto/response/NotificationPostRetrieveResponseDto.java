package couch.camping.controller.member.dto.response;

import couch.camping.domain.notification.entity.Notification;
import io.swagger.annotations.ApiModel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ApiModel(description = "회원의 게시글 좋아요 알림 조회 응답 DTO")
public class NotificationPostRetrieveResponseDto extends MemberNotificationResponseDto {

    private Long postId;

    private String title;

    private String content;

    private String postType;

    public NotificationPostRetrieveResponseDto(Notification notification) {
        super(notification, "postLike");
        this.postId = notification.getPost().getId();
        this.title = notification.getPost().getTitle();;
        this.content = notification.getPost().getContent();
        this.postType = notification.getPost().getPostType();
    }
}
