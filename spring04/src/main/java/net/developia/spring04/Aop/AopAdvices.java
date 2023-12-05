package net.developia.spring04.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AopAdvices {

	@Before("execution(* net.developia.spring04.controller.SampleController.getSample*(..))")
	public void ad_before() {
		log.info("�ڡڡڡڡڡڡڡڡڡڡ�");
		log.info("before advice");
		log.info("�ڡڡڡڡڡڡڡڡڡڡ�");
	}

	@After("execution(* net.developia.spring04.controller.SampleController.getSample*(..))")
	public void ad_after() {
		log.info("�ڡڡڡڡڡڡڡڡڡڡ�");
		log.info("��   after advice   ��");
		log.info("�ڡڡڡڡڡڡڡڡڡڡ�");
	}

	@Around("execution(* net.developia.*.*.UserController.login(..))")
	public Object ad_around(ProceedingJoinPoint joinPoint) {
		log.info("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		log.info("��   around (before) advice ��");
		log.info("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");

		Object obj = null;

		try {
			log.info("�ð������� �����մϴ�");
			long start = System.currentTimeMillis();
			obj = joinPoint.proceed();
			long end = System.currentTimeMillis();
			log.info("�ð������� �����մϴ�");
			log.info("�ҿ�ð� : " + ((double) end - start) / 1000 + "��");

		} catch (Throwable e) {
			e.printStackTrace();
		}

		log.info("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		log.info("��   around (after)  advice ��");
		log.info("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		return obj;
	}

	/*
	@Before("execution(* net.developia.*.*.UserController.login(..))")
	public void ad_login(JoinPoint joinPoint) {
		log.info("�ڡڡڡڡڡڡڡڡڡڡڡ�");
		log.info("��   login intercept  ��");
		log.info("�ڡڡڡڡڡڡڡڡڡڡڡ�");

		Object[] args = joinPoint.getArgs();
		for (Object obj : args) {
			// log.info(obj.toString());
			if (obj instanceof UserDTO) {
				UserDTO userDTO = (UserDTO) obj;
				log.info(userDTO.getUsr_id() + "���� �α���");
			}
		}
	} 
	*/
}
