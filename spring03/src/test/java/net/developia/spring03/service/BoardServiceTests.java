package net.developia.spring03.service;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.log4j.Log4j;
import net.developia.spring03.domain.BoardVO;
import net.developia.spring03.domain.Criteria;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration("file:**/*-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testExist(){ // BoardService ��ü�� ����� ������ �������� Ȯ���ϴ� �۾�
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("���� �ۼ��ϴ� ��");
		board.setContent("���� �ۼ��ϴ� ����");
		board.setWriter("newbie");
		
		service.register(board);
		
		log.info("������ �Խù��� ��ȣ : " + board.getBno());
	}
	
	@Test
	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
		
		service.getList(new Criteria(2,10)).forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(23L));
	}
	
	@Test
	public void testDelete() {
		log.info("REMOVE RESULT : " + service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("���� �����մϴ�.");
		log.info("MODIFY RESULT : " + service.modify(board));
	}
}

