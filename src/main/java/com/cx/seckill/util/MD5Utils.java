package com.cx.seckill.util;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * <p>项目名称: seckill </p>
 * <p>文件名称: MD5Utils.java </p>
 * <p>描述: md5工具类 </p>
 * <p>创建时间: 2024-03-20 23:14:38 </p>
 * <p>公司信息: 公司 部</p>
 *
 * @author <a href="mailto:cx525606@163.com">辰晓</a>
 * @version v1.0
 */
public class MD5Utils {

    private static String salt = "34f9ij";

    private static String md5(String srt){
        return DigestUtils.md5Hex(srt);
    }

    public static String inputPassMd5(String srt){
        String saltsrt = salt.charAt(1)+salt.charAt(3)+srt+salt.charAt(0)+salt.charAt(5);
        return md5(saltsrt);
    }

    public static String backToDB(String inputMd5,String salt1){
        String inputMd5Salt = salt1.charAt(2)+salt1.charAt(3)+inputMd5+salt1.charAt(1)+salt.charAt(5);
        return md5(inputMd5Salt);
    }

    public static String inputToDb(String inputSrt,String salt){
        String md5Input = inputPassMd5(inputSrt);
        return backToDB(md5Input,salt);
    }

}

