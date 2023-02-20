package ink.dean.doma.infrastructure.mapper;

import ink.dean.doma.infrastructure.domain.Activity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dean
* @description 针对表【activity(活动配置)】的数据库操作Mapper
* @createDate 2023-02-20 18:19:16
* @Entity ink.dean.doma.infrastructure.domain.Activity
*/
@Mapper
public interface ActivityMapper extends BaseMapper<Activity> {

}




