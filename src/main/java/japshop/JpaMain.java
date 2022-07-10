package japshop;

import japshop.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager(); // 아주 쉽게 얘기하면 데이터베이스 커넥션임

        EntityTransaction tx = em.getTransaction();
        tx.begin();


        try {

            Book book = new Book();

            book.setAuthor("김영한");
            book.setName("JPA");

            em.persist(book);

            //커밋해줘야 디비 반영
            tx.commit();


        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close(); //꼭 닫아야함
        }

        emf.close();
    }
}
