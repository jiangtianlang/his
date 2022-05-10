package com.zhongshan.controller.security;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author jtl
 * @date 2022年05月10日 13:46:23
 */
@Controller
@Api(tags = "(系统管理)日志下载")
public class DownLog {
    @ApiOperation(value = "日志下载")
    @RequestMapping(value = "/test/downloadFile", method = { RequestMethod.GET })
    public ResponseEntity<byte[]> downloadFile(@RequestParam("fileName") String fileName) {
        try {
            File file = new File(fileName);
            byte[] body = null;
            InputStream is = new FileInputStream(file);
            body = new byte[is.available()];
            is.read(body);
            is.close();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attchement;filename=" + file.getName());
            HttpStatus statusCode = HttpStatus.OK;
            ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
