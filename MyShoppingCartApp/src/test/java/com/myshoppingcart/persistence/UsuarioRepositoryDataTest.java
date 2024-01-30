package com.myshoppingcart.persistence;

import com.myshoppingcart.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@EnableAutoConfiguration
class UsuarioRepositoryDataTest {

    @Autowired
    private IUsuarioRepositoryData repo;

    @Test
    void testBeans() {
        assertThat(repo, notNullValue());
    }

    @Test
    @Transactional
    void dadosUsuarios_cuandoExisteUsuarioEnDB_entoncesOK() throws Exception {
        boolean existe = repo.existsByEmailAndPassword("juana@e.com", "juanason_1");
        assertThat(existe, is(true));
    }
}
