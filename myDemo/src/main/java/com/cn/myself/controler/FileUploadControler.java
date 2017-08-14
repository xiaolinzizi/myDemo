package com.cn.myself.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by xiaolin.zhang on 2017/2/19.
 * 文件上传操作
 */

@Controller
@RequestMapping(value="fileupload")
public class FileUploadControler {

    @RequestMapping(value="add",method = RequestMethod.POST)
    public String addFileUpload(@RequestParam(value = "image",required = false)
                                            MultipartFile  images, HttpServletRequest request, ModelMap map){
        String path=request.getSession().getServletContext().getRealPath("upload");
        String filename=images.getOriginalFilename();
        System.out.println(path);
        File file=new File(path,filename);
        if (!file.exists()) {
            file.mkdirs();
        }
        // idea try-catch 快捷键 CTRL+ALT+T
        try {
            images.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        map.addAttribute("fileurl",request.getContextPath()+"upload"+filename);
        return "fileupresult";

    }

    @RequestMapping(value="index")
    public String index(){
        return "fileupload";
    }


    /**
     * idea main 函数快捷键 psvm
     * for 快捷键  fori
     *Sysout  快捷键 sout
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * Created by xiaolin.zhang on 2017/2/10.
     */
    @RequestMapping(value="testcontroler")
    @Controller
    public static class TestControler {

        @RequestMapping(value = "views")
        public String views(){
            System.out.print("test");

            return "test";
        }

    }
}
