package kh.mclass.semim.board.model.service;

import static kh.mclass.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

import kh.mclass.semim.board.model.dao.BoardDao;
import kh.mclass.semim.board.model.dto.BoardDto;

public class BoardService {
	private BoardDao dao = new BoardDao();
	//select list - all
	public List<BoardDto> selectAllList() {
		List<BoardDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectAllList(conn);
		
		close(conn);
		return result;
	}
	//select one
	public BoardDto selectOne(Integer boardId) {
		BoardDto result =null;
		Connection conn = getSemiConnection(true);	
		result = dao.selectOne(conn,boardId);
		
		close(conn);
		return result;
	}
	//insert
	public int insert(BoardDto dto) {
		int result = 0;
		//INSERT INTO MEMBER VALUES('kh1','pwd1','kh1@a.com');
		Connection conn = getSemiConnection(true);
		result = dao.insert(conn,dto);
		close(conn);
		return result;
	}
	//update
	public int update ( BoardDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);	
		result = dao.update(conn,dto);
		
		close(conn);
		return result;
	}
	//delete
	public int delete (Integer boardId) {
		int result = 0;
		Connection conn = getSemiConnection(true);	
		result = dao.delete(conn,boardId);
		
		close(conn);
		return result;
	}
}