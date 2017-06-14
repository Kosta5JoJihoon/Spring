package s0613;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import s0613.dao.BoardDAO;
import s0613.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
