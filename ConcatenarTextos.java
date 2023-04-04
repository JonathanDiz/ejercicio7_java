public class ConcatenarTextos {

    public static void main(String[] args){
        String[] textos = {"Hola", "cómo", "estás?"};

        String resultado = "";
        for (int i =0; i < textos.length; i++){
            resultado += textos[i] + " ";
        }

        System.out.println(resultado);
    }
}