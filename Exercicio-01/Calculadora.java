    public class Calculadora {
        public static Float adicao(Float num1, Float num2) {
            return num1 + num2;
        }
    
        public static Float subtracao(Float num1, Float num2) {
            return num1 - num2;
        }
    
        public static Float multiplicacao(Float num1, Float num2) {
            return num1 * num2;
        }
    
        public static Float divisao(Float num1, Float num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                throw new IllegalArgumentException("Erro! Divisão por zero não é permitida.");
            }
        }
    }
    

