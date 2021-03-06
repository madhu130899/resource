package com.example.contact.ex.contactres;

    import org.springframework.stereotype.Repository;

        import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface BankRepo extends JpaRepository<Bank,Long> {





}
