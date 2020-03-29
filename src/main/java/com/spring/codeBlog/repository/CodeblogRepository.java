package com.spring.codeBlog.repository;

        import com.spring.codeBlog.model.Post;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface CodeblogRepository extends JpaRepository<Post,Long> {

}
