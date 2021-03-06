package com.example.contact.ex.contactres;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.DeleteMapping;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.PutMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;
        import java.util.Optional;
@RestController

public class BankController {
    @Autowired
    BankRepo bankrepo;


    @GetMapping("/home")
    public List<Bank> display()
    {
        return bankrepo.findAll();
    }

    @PostMapping("/home")
    public void create(@RequestBody Bank bank)
    { // System.out.print(bank.phoneno);
        bankrepo.save(bank);
    }

    @DeleteMapping("/home/{account}")
    public void del(@PathVariable(value="account") Long bankaccount)
    {
        bankrepo.deleteById(bankaccount);
    }
    @PutMapping("/home/{account}")
    public ResponseEntity<Bank> updateBank(@PathVariable(value = "account") Long bankaccount, @RequestBody Bank bank)
    {         Bank bank1 = bankrepo.findById(bankaccount).get();
        bank1.setAccount(bank.getAccount());
        bank1.setName(bank.getName());
        bank1.setAge(bank.getAge());
        bank1.setPhoneno(bank.getPhoneno());

        final Bank updatedBank = bankrepo.save(bank1);
        return ResponseEntity.ok(updatedBank);


    }




}

