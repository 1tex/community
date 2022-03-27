package com.nowcoder.community.dao.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository // Spring针对数据访问层的注解，Mapper是MyBatis专有的注解
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost, Integer> {
}
