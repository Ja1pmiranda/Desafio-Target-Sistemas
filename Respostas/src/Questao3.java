import java.util.ArrayList;
import java.util.List;

public class Questao3 {
    public static void main(String[] args) {
        // Exemplo de faturamento diário
        double[] faturamentoDiario = {1000, 1500, 0, 2000, 0, 3000, 500, 0, 2500, 0};

        calcularFaturamento(faturamentoDiario);
    }

    public static void calcularFaturamento(double[] faturamentoDiario) {
        List<Double> faturamentoValido = new ArrayList<>();
        
        // Filtrar dias com faturamento válido (maior que 0)
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                faturamentoValido.add(faturamento);
            }
        }

        // Calcular menor e maior faturamento
        double menorFaturamento = faturamentoValido.get(0);
        double maiorFaturamento = faturamentoValido.get(0);
        double somaFaturamento = 0;

        for (double faturamento : faturamentoValido) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
            somaFaturamento += faturamento;
        }

        // Calcular média anual
        double mediaAnual = somaFaturamento / faturamentoValido.size();

        // Contar dias acima da média
        int diasAcimaMedia = 0;
        for (double faturamento : faturamentoValido) {
            if (faturamento > mediaAnual) {
                diasAcimaMedia++;
            }
        }

        // Exibir resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}
