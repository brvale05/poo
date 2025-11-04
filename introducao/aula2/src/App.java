public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Endereco end = new Endereco("rua", "vitoria", "espirito santo", "29100230");

        System.out.println("Logradouro: " + end.getLogradouro());
        System.out.println("Cidade: " + end.getCidade());
        System.out.println("Estado: " + end.getEstado());
        System.out.println("CEP: " + end.getCep());
    }
}
