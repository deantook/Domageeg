package ink.dean.doma.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.dean.doma.infrastructure.domain.Activity;
import ink.dean.doma.infrastructure.service.ActivityService;
import ink.dean.doma.infrastructure.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author dean
* @description 针对表【activity(活动配置)】的数据库操作Service实现
* @createDate 2023-02-20 18:17:53
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
    implements ActivityService{

}




