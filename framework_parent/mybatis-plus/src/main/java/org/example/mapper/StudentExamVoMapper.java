package org.example.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.apache.ibatis.annotations.Param;
import org.example.vo.StudentExamVo;


import java.util.List;

/**
 * @author 16339
 */
public interface StudentExamVoMapper {
    List<StudentExamVo> selectList(Long rowNum, Long offset, @Param("ew") Wrapper wrapper);

    long selectCount(@Param("ew") Wrapper wrapper);
}
