package readinglist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import readinglist.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
