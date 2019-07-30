package com.example.demo.exception;

import com.example.demo.entity.ResultMsg;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	Map<String, Object> model = new HashMap<String, Object>();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        StringWriter trace=new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        log.error("错误日志"+trace.toString());
        return mav;
    }

    /**
     * VO属性校验错误拦截
     * @param error
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultMsg handleValidException(MethodArgumentNotValidException error) {
        List<FieldError> errors = error.getBindingResult().getFieldErrors();
        List<ResultMsg> errorInfos = new ArrayList<ResultMsg>();
        for (FieldError err : errors) {
            errorInfos.add(new ResultMsg(err.getField(), err.getDefaultMessage()));
        }
        return new ResultMsg(ResultMsg.CODE_ERROR,errorInfos.get(0));
    }


    /**
     * Exception for @Valid
     * @param error bind error
     * @return responseVo
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public List<ResultMsg> handleBindException(BindException error) {
        StringWriter trace=new StringWriter();
        error.printStackTrace(new PrintWriter(trace));
        log.error("错误日志"+trace.toString());
        List<FieldError> errors = error.getFieldErrors();
        List<ResultMsg> messages = new ArrayList<ResultMsg>();
        for (FieldError err : errors) {
            messages.add(new ResultMsg(err.getField(), err.getDefaultMessage()));
        }
        return messages;
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResultMsg handleBusinessException(BusinessException error) {
        StringWriter trace=new StringWriter();
        error.printStackTrace(new PrintWriter(trace));
        log.error("错误日志"+trace.toString());
        return new ResultMsg(error.getErrCode(), error.getMessage(),null);
    }


    @ExceptionHandler(MyBatisSystemException.class)
    @ResponseBody
    public ResultMsg handleMyBatisSystemException(MyBatisSystemException error) {
        StringWriter trace=new StringWriter();
        error.printStackTrace(new PrintWriter(trace));
        log.error("错误日志"+trace.toString());
        return new ResultMsg(ResultMsg.CODE_ERROR, error.getMessage());
    }
}

