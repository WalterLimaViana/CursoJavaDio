public class Main {
    public static void main(String[] args){
        // Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(4,6);
        Calculadora.subtracao(7,9);
        Calculadora.divisao(92,8);
        Calculadora.multiplicacao(7,5);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);

        //Empréstimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(50,2);
        Emprestimo.calcular(100,3);
        Emprestimo.calcular(100,4);

        // Quadrilatero
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(2d,2d);
        Quadrilatero.area(7,5,8);
        Quadrilatero.area(5,7);

        // Retornos
        System.out.println("Exercicio Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3d,3d);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(5,7,3);
        System.out.println("Área do trapézio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5,7);
        System.out.println("Área do losango: " + areaLosango);

    }
}
