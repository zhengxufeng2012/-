package com.javen.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileUploadUtils {
     
	@RequestMapping("/fileupload.do")
	 public @ResponseBody  String upload(MultipartFile file, HttpServletRequest request) throws IOException {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
	        String res = sdf.format(new Date());

	        // uploads文件夹位置
	        String rootPath = request.getSession().getServletContext().getRealPath("resource/uploads/");
	      
	        System.out.println("fileload start+"+rootPath);
	        // 原始名称
	        String originalFileName = file.getOriginalFilename();
	        // 新文件名
	        String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));
	        // 创建年月文件夹
	        Calendar date = Calendar.getInstance();
	        File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH)+1));
	        /**
	         * 要是我想更換地址的話,把rootpath更換了就可了.
	         * 比如我喜歡變成是workspace下存放文件,那麼就是 "../../workspace" 然後加上文件名稱就可以了
	         * File newFile = new File("../../workspace" + File.separator + newFileName);
	         */
	        // 新文件
	        File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
	        // 判断目标文件所在目录是否存在
	        if( !newFile.getParentFile().exists()) {
	            // 如果目标文件所在的目录不存在，则创建父目录
	        	System.out.println("dizhiyou wenti ");
	            newFile.getParentFile().mkdirs();
	        }
	        System.out.println(newFile);
	        // 将内存中的数据写入磁盘
	        file.transferTo(newFile);
	        // 完整的url
	        String fileUrl = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH)+1) + "/" + newFileName;
	        return  fileUrl;
		
	}
}
