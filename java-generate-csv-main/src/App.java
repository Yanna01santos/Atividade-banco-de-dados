public class App {
    public static void main(String[] args) throws Exception {
        Cadastrar cadastrar = new Cadastrar();
        String url = "Files/nomes.csv";

        cadastrar.CadastrarNomes("Igor", "Soares", url);
        cadastrar.CadastrarNomes("Gabriely", "Vitóris", url);
        cadastrar.CadastrarNomes("Yanna", "Aparecida", url);
        cadastrar.CadastrarNomes("Anderson", "Profesor", url);
        cadastrar.CadastrarNomes("Neymar", "Junior", url);
        cadastrar.CadastrarNomes("Lionel", "Messi", url);
        System.out.println("Arquivo foi gerado com sucesso!");
    }
}
