package org.example.controller;

import org.example.exception.CustomException;
import org.example.response.Result;
import org.example.response.ResultEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/upload")
public class FileUploadController {
    @Value("${file.upload.path.leave}")
    private String leaveFileUploadPath;

    @Value("${file.upload.path.expense}")
    private String expenseFileUploadPath;

    @PostMapping("/leave")
    public Object uploadLeaveFile(MultipartFile file) {
        return leaveFileUploadPath;
    }

    @PostMapping("/avatar")
    public Object upload(@RequestParam("avatar") MultipartFile file) {
        File diskFile = new File("D:/desktop/upload/view.png");
        try {
            file.transferTo(diskFile);
            return Result.success();
        } catch (IOException e) {
            throw new CustomException(ResultEnum.FILE_UPLOAD_ERROR);
        }
    }

    /**
     * 接收多个文件
     * @param files
     * @return
     */
    @PostMapping("/files")
    public Object upload(MultipartFile[] files) {
        for (MultipartFile file : files) {
            String filename = uniqueFilename(file.getOriginalFilename());
            File diskFile = new File("D:/desktop/upload/" + filename);
            try {
                file.transferTo(diskFile);
            } catch (IOException e) {
                throw new CustomException(ResultEnum.FILE_UPLOAD_ERROR);
            }
        }
        return Result.success();
    }

    private String uniqueFilename(String originalFilename) {
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 生成新的文件名
        return UUID.randomUUID().toString().replace("-", "").toUpperCase() + ext;
    }
}
