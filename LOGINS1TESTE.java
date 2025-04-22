package AprendendoTestes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LOGINS1TESTE {

        LoginService service = new LoginService();

        @Test
        public void testLoginCorreto() {
            assertTrue(service.login("admin", "1234"));
        }

        @Test
        public void testSenhaNaoFornecida() {
            assertFalse(service.login("admin", null));
            assertFalse(service.login("admin", ""));
        }

        @Test
        public void testLoginErrado() {
            assertFalse(service.login("admin", "senhaErrada"));
            assertFalse(service.login("userErrado", "1234"));
        }
    }