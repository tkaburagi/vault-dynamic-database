package run.kabuctl.demo.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import run.kabuctl.demo.demo.repo.UserJpaRepository;

@RestController
public class TestController {

    @Autowired
    VaultTemplate vaultTemplate;

    @Autowired
    UserJpaRepository userJpaRepository;

    @GetMapping(value = "/api/v1/get-all")
    Object getGenericData() throws Exception {
        return userJpaRepository.findAll();
    }
}
