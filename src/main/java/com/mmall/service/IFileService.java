package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Steven.Lu on 2018/7/15.
 */
public interface IFileService {
    /**
     * 上传文件
     *
     * @param file
     * @param path
     * @return String
     * @author steven.Lu
     * @date 2018-11-28 09:40
     */
    String upload(MultipartFile file, String path);
}
