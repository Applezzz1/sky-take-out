package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品Id查询套餐id
     * @param dishIds
     * @return
     */
    //select setmeal_id from setmeal dish where dish_id in (...)
    List<Long> getSetmealIdsByDishIds(@Param("dishIds") List<Long> dishIds);
}
