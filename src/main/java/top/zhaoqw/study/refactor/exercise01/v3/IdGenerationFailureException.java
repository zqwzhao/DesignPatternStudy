package top.zhaoqw.study.refactor.exercise01.v3;

import java.net.UnknownHostException;

/**
 * @author: zhaoqw
 * @date: 2022/1/12 10:46
 */
public class IdGenerationFailureException extends RuntimeException{
    public IdGenerationFailureException(String s, UnknownHostException e) {
    }
}
