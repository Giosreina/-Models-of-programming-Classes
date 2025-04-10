package Adapter;
// Interfaz objetivo que define el comportamiento esperado
interface IntTarget {
    int getIntValue();
}

// Clase adaptada - la clase existente que necesitamos adaptar
class StringSource {
    private String stringValue;
    
    public StringSource(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public String getStringValue() {
        return stringValue;
    }
}

// Adaptador que convierte String a int sin usar parseInt
class StringToIntAdapter implements IntTarget {
    private StringSource stringSource;
    
    public StringToIntAdapter(StringSource stringSource) {
        this.stringSource = stringSource;
    }
    
    @Override
    public int getIntValue() {
        String str = stringSource.getStringValue();
        
        // Verificar si la cadena está vacía
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("String vacío o nulo");
        }
        
        // Verificar si hay un signo negativo
        boolean isNegative = false;
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        } else if (str.charAt(0) == '+') {
            startIndex = 1;
        }
        
        // Convertir manualmente la cadena a un entero
        int result = 0;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Verificar que el carácter sea un dígito
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Carácter no numérico: " + c);
            }
            
            // Calcular el valor del dígito y agregarlo al resultado
            int digit = c - '0';
            
            // Verificar si hay desbordamiento
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                throw new NumberFormatException("Desbordamiento de entero");
            }
            
            result = result * 10 + digit;
        }
        
        return isNegative ? -result : result;
    }
}

// Cliente que utiliza la adaptación
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        StringSource source = new StringSource("12345");
        IntTarget adapter = new StringToIntAdapter(source);
        
        int value = adapter.getIntValue();
        System.out.println("El valor entero es: " + value);
        
        // Ejemplo con número negativo
        StringSource negativeSource = new StringSource("-789");
        IntTarget negativeAdapter = new StringToIntAdapter(negativeSource);
        
        int negativeValue = negativeAdapter.getIntValue();
        System.out.println("El valor entero negativo es: " + negativeValue);
    }
}