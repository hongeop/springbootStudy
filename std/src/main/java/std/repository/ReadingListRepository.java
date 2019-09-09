package std.repository;

import java.io.Reader;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import std.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(Reader reader);
}
