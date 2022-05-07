package com.zhongshan.service;

import com.zhongshan.entity.Uh05StandardNutritionStudent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_standard_nutrition_student】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05StandardNutritionStudentService extends IService<Uh05StandardNutritionStudent> {

    R insertStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent);

    R updateStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent);

    void queryStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent);
}
