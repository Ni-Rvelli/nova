package com.nova.system.excel.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description: excel功能控制类
 * @Author: nirui
 * @Date: 2020-05-27
 */
@RestController
public class ExcelController {


//    @PostMapping("/count")
//    public AjaxResult count(MultipartFile file) throws Exception {
//        ExcelUtil<ExcelCountDTO> util = new ExcelUtil<ExcelCountDTO>(ExcelCountDTO.class);
//        List<ExcelCountDTO> countList = util.importExcel(file.getInputStream());
//        return AjaxResult.success(countList);
//    }

    @GetMapping("/order")
    public String order()
    {
        System.out.println("我进来了 order controller 的 index 方法");
        return "order controller";
    }
}
