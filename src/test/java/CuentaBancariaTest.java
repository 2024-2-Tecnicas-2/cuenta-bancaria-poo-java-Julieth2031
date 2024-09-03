
import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CuentaBancariaTest {
       // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    // @Prueba
    // public void miPrueba() {
    // doble valorEsperado = 10;
    // doble valorActual = Calculadora.calcular(7, 3, '+');
    // afirmarEquals(valorEsperado, valorActual);
    // }
    @Test
    public void testSaldoInicial() {
        // Crear una cuenta bancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("Maria", "00123456789", 200.0);
        
        // Verificar que el saldo inicial sea el esperado
        double valorEsperado = 200.0;
        double valorActual = cuenta.getSaldo();
        assertEquals(valorEsperado, valorActual, 0);
    }
     @Test
    public void testRetiroExitoso() {
        // Crear una cuenta bancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("Maria", "00123456789", 200.0);
        
        // Retirar dinero
        cuenta.retirar(50.0);
        
        // Verificar que el saldo sea el esperado después del retiro
        double valorEsperado = 150.0;
        double valorActual = cuenta.getSaldo();
        assertEquals(valorEsperado, valorActual, 0);
    }
}
