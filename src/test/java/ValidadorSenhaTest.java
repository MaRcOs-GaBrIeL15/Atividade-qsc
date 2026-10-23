


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.ValidadorSenha;

public class ValidadorSenhaTest {

    @Test
    void senhaComSeteCaracteresEhInvalida() {
        assertFalse(ValidadorSenha.validar("Abcdef1"));
    }

    @Test
    void senhaComOitoCaracteresEhValida() {
        assertTrue(ValidadorSenha.validar("abcdef23"));
    }

    @Test
    void senhaSemMaiusculaEhInvalida() {
        assertFalse(ValidadorSenha.validar("abcdef23"));
    }

    @Test
    void senhaComMaiusculaEhValida() {
        assertTrue(ValidadorSenha.validar("Abcdef23"));
    }

    @Test
    void senhaComNumeroEhValida() {
        assertTrue(ValidadorSenha.validar("Abcdef34"));
    }

    @Test
    void senhaSemNumeroEhInvalida() {
        assertFalse(ValidadorSenha.validar("Abcdefgh"));
    }

    @Test
    void senhaSemMinusculaEhInvalida() {
        assertFalse(ValidadorSenha.validar("ABCDEF23"));
    }

    @Test
    void senhaComMinusculaEhValida() {
        assertTrue(ValidadorSenha.validar("ABCDEf23"));
    }

}
