package couch.camping.domain.postimage.entity;

import couch.camping.domain.base.BaseEntity;
import couch.camping.domain.post.entity.Post;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class PostImage extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "Post_image")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    private String imgUrl;

    public PostImage(Post post, String imgUrl) {
        this.post = post;
        this.imgUrl = imgUrl;
    }
}