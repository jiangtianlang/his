package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Sp05DiseaseCode;
import com.zhongshan.entity.Uh05StandardHighStudent;
import com.zhongshan.entity.Uh05StandardNutritionStudent;
import com.zhongshan.entity.Uh05StandardWeightStudent;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "字典",tags = "(保健档案管理子系统)字典API接口")
public class DictionaryController {
    //疾病体症代码字典数据
    @RequestMapping(value = "insertDiseaseBodyCode",method = RequestMethod.GET)
    @ApiOperation(value = "疾病体症代码录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode){
        return R.ok();
    }
    @RequestMapping(value = "updateDiseaseBodyCode",method = RequestMethod.GET)
    @ApiOperation(value = "疾病体症代码修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode){
        return R.ok();
    }
    @RequestMapping(value = "deleteDiseaseBodyCode",method = RequestMethod.GET)
    @ApiOperation(value = "疾病体症代码删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode){
        return R.ok();
    }
    @RequestMapping(value = "queryDiseaseBodyCode",method = RequestMethod.GET)
    @ApiOperation(value = "疾病体症代码查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryDiseaseBodyCode(Sp05DiseaseCode sp05DiseaseCode){
        return R.ok();
    }
    //身高标准资料字典数据
    @RequestMapping(value = "insertStandardHigh",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertStandardHigh(Uh05StandardHighStudent uh05StandardHighStudent){
        return R.ok();
    }
    @RequestMapping(value = "updateStandardHigh",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateStandardHigh(Uh05StandardHighStudent uh05StandardHighStudent){
        return R.ok();
    }
    @RequestMapping(value = "deleteStandardHigh",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteStandardHigh(Uh05StandardHighStudent uh05StandardHighStudent){
        return R.ok();
    }
    @RequestMapping(value = "queryStandardHigh",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryStandardHigh(Uh05StandardHighStudent uh05StandardHighStudent){
        return R.ok();
    }
    //体重标准资料字典数据
    @RequestMapping(value = "insertStandardWeight",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertStandardWeight(Uh05StandardWeightStudent uh05StandardWeightStudent){
        return R.ok();
    }
    @RequestMapping(value = "updateStandardWeight",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateStandardWeight(Uh05StandardWeightStudent uh05StandardWeightStudent){
        return R.ok();
    }
    @RequestMapping(value = "deleteStandardWeight",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteStandardWeight(Uh05StandardWeightStudent uh05StandardWeightStudent){
        return R.ok();
    }
    @RequestMapping(value = "queryStandardWeight",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryStandardWeight(Uh05StandardWeightStudent uh05StandardWeightStudent){
        return R.ok();
    }
    //营养标准资料字典数据
    @RequestMapping(value = "insertStandardNutrition",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent){
        return R.ok();
    }
    @RequestMapping(value = "updateStandardNutrition",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent){
        return R.ok();
    }
    @RequestMapping(value = "deleteStandardNutrition",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent){
        return R.ok();
    }
    @RequestMapping(value = "queryStandardNutrition",method = RequestMethod.GET)
    @ApiOperation(value = "身高标准资料查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent){
        return R.ok();
    }
}
