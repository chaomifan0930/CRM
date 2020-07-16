package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgCheckTask;
import com.sc.service.BgCheckTaskService;

@Controller
@RequestMapping("/bgCheckTaskctrl")
public class BgCheckTaskController {

	@Autowired
	BgCheckTaskService bgCheckTaskService;
	
	//��ѯ
	@RequestMapping("/selectTask.do")
	public ModelAndView selectTask(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgCheckTask task){
		
		System.out.println("�����ѯ���������ҳ������");
		
		//Ϊ��������ѯ��׼��
		PageInfo<BgCheckTask> page = bgCheckTaskService.selectTask(pageNum, pageSize, task);
		
		mav.addObject("p", page);
		mav.setViewName("bg/bgchecktask-list"); //WEB-INF/bg/bgchecktask-list.jsp
		return mav;
	}
}
