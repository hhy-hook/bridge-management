package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.InspectionTask;
import com.zjut.bridge.pojo.vo.TaskVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspectionTaskDao {
    int deleteByPrimaryKey(Integer taskId);

    int insert(InspectionTask record);

    int insertSelective(InspectionTask record);

    InspectionTask selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(InspectionTask record);

    int updateByPrimaryKey(InspectionTask record);

    List<TaskVO> selectTasks();

    List<TaskVO> selectTasksByInspectorId(int inspectorId);

    int selectMaxPrimaryKey();
}