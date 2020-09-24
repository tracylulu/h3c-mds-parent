package com.h3c.mds.flowable.controller;

import com.h3c.mds.flowable.entity.BasisMaterial;
import com.h3c.mds.flowable.entity.FileLog;
import com.h3c.mds.flowable.service.BasisMaterialService;
import com.h3c.mds.flowable.service.FileLogService;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.common.IPUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/flowable/basisMaterial")
public class BasisMaterialController {

    private static final Logger logger = LoggerFactory.getLogger(BasisMaterialController.class);

    @Value("${file.path}")
    private  String filePath ;

    private String PATH;
    private String IMAGE_PATH;

    @Autowired
    private BasisMaterialService basisMaterialService;
    @Autowired
    private FileLogService fileLogService;

    @PostConstruct
    public void intiPath(){
        String seperator = File.separator;
        PATH =  filePath+"uploadFile"+seperator+"flowable"+seperator;
        IMAGE_PATH =  filePath+"uploadImage"+seperator+"flowable"+seperator;
    }

    @RequestMapping(value = "/save" ,produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult save(BasisMaterial basisMaterial){
        try {
            if(StringUtils.isNotBlank(basisMaterial.getContent())){
                if(StringUtils.isBlank(basisMaterial.getId())){
                    basisMaterialService.create(basisMaterial);
                }else{
                    BasisMaterial material = basisMaterialService.getById(basisMaterial.getId());
                    if(material == null){
                        basisMaterialService.create(basisMaterial);
                    }else{
                        basisMaterialService.update(basisMaterial);
                    }

                }
                return ResponseResult.success((Object) basisMaterial.getId());
            }else{
                if(StringUtils.isNotBlank(basisMaterial.getId())){
                    basisMaterialService.deleteById(basisMaterial.getId());
                }
                return ResponseResult.success((Object) "");
            }

        }catch (Exception e){
            logger.error("保存失败", e);
            return ResponseResult.fail("保存失败");
        }
    }

    @RequestMapping("/getById/{id}")
    @ResponseBody
    public ResponseResult getById(@PathVariable String id){
        try {
            BasisMaterial basisMaterial = basisMaterialService.getById(id);
            return ResponseResult.success(basisMaterial);
        }catch (Exception e){
            logger.error("根据id获取失败", e);
            return ResponseResult.fail("根据id获取失败");
        }
    }

    /**
     * ueditor文件上传方法
     * @param upfile
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/uploadfile",method= RequestMethod.POST,produces = "text/html;charset=utf-8")
    @ResponseBody
    public Map<String,Object> uploadFile(@RequestParam(value="upfile",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) {


        try {
            if(file.isEmpty()){
                return new HashMap<String, Object>(){{
                    put("state","ERROR");
                }};
            }
            String fileName = file.getOriginalFilename();
            if(fileName.indexOf("\\")>-1){
                fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
            }
            String fileId = UUID.randomUUID().toString();
            String extName = fileName.substring(fileName.lastIndexOf(".") );
            System.out.println(PATH+ fileId+extName);
            File dest = new File(PATH+ fileId+extName);
            if(!dest.exists()){
                dest.getParentFile().mkdirs();
                dest.createNewFile();
            }
            file.transferTo(dest);
            Map<String,Object> fileInfo = new HashMap<>();
            fileInfo.put("fileName", fileName);
            fileInfo.put("fileId", fileId+extName);
            createLog(fileId, fileName, extName, new Long(file.getSize()).intValue(), IPUtils.getIpAddr(request), "1");
            String finalFileName = fileName;
            return new HashMap<String,Object>(){{
                put("state", "SUCCESS");
                put("title", file.getOriginalFilename());
                put("url", "/flowable/basisMaterial/downloadFile/"+fileId+extName+"/"+ finalFileName);
                put("original", file.getOriginalFilename());
            }};
        }catch (Exception e){
            logger.error("文件上传失败", e);
            return new HashMap<String, Object>(){{
                put("state","ERROR");
            }};
        }
    }

    /**
     * ueditor文件上传方法
     * @param upfile
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/uploadimage",method= RequestMethod.POST,produces = "text/html;charset=utf-8")
    @ResponseBody
    public Map<String,Object> uploadImage(@RequestParam(value="upfile",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) {


        try {
            if(file.isEmpty()){
                return new HashMap<String, Object>(){{
                    put("state","ERROR");
                }};
            }
            String fileName = file.getOriginalFilename();
            if(fileName.indexOf("\\")>-1){
                fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
            }
            String fileId = UUID.randomUUID().toString();
            String extName = fileName.substring(fileName.lastIndexOf(".") );
            System.out.println(IMAGE_PATH+ fileId+extName);
            File dest = new File(IMAGE_PATH+ fileId+extName);
            if(!dest.exists()){
                dest.getParentFile().mkdirs();
                dest.createNewFile();
            }
            file.transferTo(dest);
            Map<String,Object> fileInfo = new HashMap<>();
            fileInfo.put("fileName", fileName);
            fileInfo.put("fileId", fileId+extName);
            createLog(fileId, fileName, extName, new Long(file.getSize()).intValue(), IPUtils.getIpAddr(request), "1");
            String finalFileName = fileName;
            return new HashMap<String,Object>(){{
                put("state", "SUCCESS");
                put("title", file.getOriginalFilename());
                put("url", "/flowable/basisMaterial/downloadImage/"+fileId+extName+"/"+ finalFileName);
                put("original", file.getOriginalFilename());
            }};
        }catch (Exception e){
            logger.error("文件上传失败", e);
            return new HashMap<String, Object>(){{
                put("state","ERROR");
            }};
        }
    }

    @RequestMapping("/downloadFile/{fileId}/{fileName}")
    public void downloadFile(HttpServletRequest request,HttpServletResponse response,@PathVariable String fileId,@PathVariable String fileName) throws UnsupportedEncodingException {
        fileName= URLDecoder.decode(fileName,"utf-8");

        String agent = request.getHeader("User-Agent");
        if(agent.contains("Edge")){
            //处理空格转为加号的问题
            fileName= URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
        }else if(agent.contains("Chrome")){
            fileName= new String(fileName.getBytes(), "iso8859-1");
        }else if(agent.contains("Firefox")){
            fileName=new String(fileName.getBytes(), "iso8859-1");
        }else if(agent.contains("MSIE") || agent.contains("Trident")){
            //在IE8以后，微软使用了Trident来作为IE浏览器的标志，兼容老的版本
            //处理空格转为加号的问题
            fileName= URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
        }else{
            //其余浏览器
            fileName= URLEncoder.encode(fileName,"UTF-8");
        }

        File file = new File(PATH+fileId);
        if(file.exists()){
            //response.setContentType("application/force-download");
            response.addHeader("Content-Disposition", "attachment;fileName=" +fileName );  //URLEncoder.encode(fileName,"UTF-8")
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                createLog(fileId,new String(fileName.getBytes("iso8859-1"),"UTF-8") , fileName.substring(fileName.lastIndexOf(".")), new Long(file.length()).intValue(), IPUtils.getIpAddr(request), "2");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @RequestMapping("/downloadImage/{fileId}/{fileName}")
    public void downloadImage(HttpServletRequest request,HttpServletResponse response,@PathVariable String fileId,@PathVariable String fileName) throws UnsupportedEncodingException {
        fileName= URLDecoder.decode(fileName,"utf-8");

        String agent = request.getHeader("User-Agent");
        if(agent.contains("Edge")){
            //处理空格转为加号的问题
            fileName= URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
        }else if(agent.contains("Chrome")){
            fileName= new String(fileName.getBytes(), "iso8859-1");
        }else if(agent.contains("Firefox")){
            fileName=new String(fileName.getBytes(), "iso8859-1");
        }else if(agent.contains("MSIE") || agent.contains("Trident")){
            //在IE8以后，微软使用了Trident来作为IE浏览器的标志，兼容老的版本
            //处理空格转为加号的问题
            fileName= URLEncoder.encode(fileName,"UTF-8").replaceAll("\\+","%20");
        }else{
            //其余浏览器
            fileName= URLEncoder.encode(fileName,"UTF-8");
        }

        File file = new File(IMAGE_PATH+fileId);
        if(file.exists()){
            //response.setContentType("application/force-download");
            response.addHeader("Content-Disposition", "attachment;fileName=" +fileName );  //URLEncoder.encode(fileName,"UTF-8")
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                createLog(fileId,new String(fileName.getBytes("iso8859-1"),"UTF-8") , fileName.substring(fileName.lastIndexOf(".")), new Long(file.length()).intValue(), IPUtils.getIpAddr(request), "2");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void createLog(String fileId,String fileName,String extName,Integer fileSize,String userIp,String operateType){
        FileLog fileLog = new FileLog();
        fileLog.setUserName(UserUtils.getCurrentUserId());
        fileLog.setUserDesc(UserUtils.getCurrentUserId());
        fileLog.setFileId(fileId);
        fileLog.setFileName(fileName);
        fileLog.setFileType(extName);
        fileLog.setFileSize(fileSize);
        fileLog.setUserIp(userIp);
        fileLog.setOperateType(operateType);
        fileLogService.create(fileLog);
    }
}
