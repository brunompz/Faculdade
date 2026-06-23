public class Main {

    public static void main(String[] args) {
        String[][] entradas = {
                {"10", "5"},
                {"10", "0"},
                {"10", "2.5"},
                {"10", "abc"}
        };

        for (int i = 0; i < entradas.length; i++) {
            System.out.println("Entradas: " + entradas[i][0] + " e " + entradas[i][1]);

            try {
                int num1 = Integer.parseInt(entradas[i][0]);
                int num2 = Integer.parseInt(entradas[i][1]);

                int resultado = num1 / num2;
                System.out.println("Resultado com INT: " + resultado);

            } catch (NumberFormatException e) {
                try {
                    double num1 = Double.parseDouble(entradas[i][0]);
                    double num2 = Double.parseDouble(entradas[i][1]);
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero (Double).");
                    } else {
                        System.out.println("Resultado com DOUBLE: " + (num1 / num2));
                    }
                } catch (NumberFormatException e1) {
                    System.out.println("Erro: Problema na conversão de string para inteiro. ");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Erro: Tentativa de divisão por zero.");
            }

            System.out.println("------------------------------------------");
        }
    }
}
