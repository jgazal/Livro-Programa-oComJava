package ApendiceA;

import java.io.*;
/**
 * Esta classe demonstra comentários de documentação.
 * @author Herbert Schildt
 * @version 1.2
 */
public class SquareNum {
    /**
     * Este método retorna o quadrado de num.
     * Esta é uma descrição de várias linhas.
     * Você pode usar quantas linhas quiser.
     * @param num O valor do qual queremos o quadrado.
     * @return o quadrado de num como um double.
     */
    public double square(double num) {
        return num * num;
    }

/**
 * Este método pega um número com o usuário.
 * @return O valor da entrada como um double.
 * @exception IOException Em caso de erro de entrada.
 * @see IOException
 */
public double getNumber() throws IOException {
    // cria um BufferedReader usando System.in
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inData = new BufferedReader(isr);
    String str;
    str = inData.readLine();
    return (new Double(str)).doubleValue();
}
    /**
     * Este método demonstra square().
     * @param args Não utilizado.
     * @exception IOException Em caso de erro.
     * @see IOException
     */
    public static void main(String[] args)
            throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Squared value is " + val);
    }
}
