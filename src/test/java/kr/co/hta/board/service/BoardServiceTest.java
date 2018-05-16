package kr.co.hta.board.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.hta.board.vo.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/spring/test-root-context.xml")
@Transactional
public class BoardServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	public void testConfig() {
		assertThat(boardService, notNullValue());
	}
	
	@Test
	public void testGetAllBoards() {
		List<Board> boards = boardService.getAllBoards();
		
		assertThat(boards.size(), is(10));
	}
	
	@Test
	public void testGetBoardDetail() {
		Board board = boardService.getBoardDetail(303);
		
		assertThat(board, notNullValue());
	}
}
