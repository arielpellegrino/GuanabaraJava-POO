package JavaDeveloperDio.src.aulas;

public class Aula10 {

    public static void main(String[] args){
        String primeiroNome = "Ariel";
        String segundoNome = "Pellegrino";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
