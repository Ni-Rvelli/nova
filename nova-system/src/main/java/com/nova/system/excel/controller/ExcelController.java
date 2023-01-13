package com.nova.system.excel.controller;


import com.nova.common.core.domain.AjaxResult;
import com.nova.common.util.poi.ExcelUtil;
import com.nova.system.excel.dto.ExcelCountDTO;
import com.nova.system.excel.service.ExcelService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: excel功能控制类
 * @Author: nirui
 * @Date: 2020-05-27
 */
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Resource
    private ExcelService excelService;

    @PostMapping("/count")
    @ResponseBody
    public AjaxResult count(MultipartFile file) throws Exception {
        ExcelUtil<ExcelCountDTO> util = new ExcelUtil<ExcelCountDTO>(ExcelCountDTO.class);
        List<ExcelCountDTO> countList = util.importExcel(file.getInputStream());
        return AjaxResult.success(countList);
    }
}
