package zerobase.weather.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JdbcMemoRepositoryTest {

    @Autowired
    JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertMemoTest() {
        //given - 어떤 데이터가 있을때
        Memo newMemo = new Memo(2, "insertMemoTest");

        //when - 어떤 동작을 하게되면
        jdbcMemoRepository.save(newMemo);

        //then - 어떤 결과가 나와야한다
        Optional<Memo> result = jdbcMemoRepository.findById(2);
        Assertions.assertEquals(result.get().getText(), "insertMemoTest");
    }

    @Test
    void findAllMemoTest() {
        //given - 어떤 데이터가 있을때
        List<Memo> memoList = jdbcMemoRepository.findAll();
        System.out.println("memoList: " + memoList);
        //when - 어떤 동작을 하게되면
        //then - 어떤 결과가 나와야한다
        assertNotNull(memoList);
    }

}