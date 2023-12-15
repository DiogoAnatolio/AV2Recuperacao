import br.com.questao1.FullStackException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();
        LinkedList<String> linkedList = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\12117434\\Downloads\\nomes.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                stack.push(line);
            }

            stack.status("Leitura do Arquivo", null);

            while (!stack.isEmpty()) {
                linkedList.addFirst(stack.pop()); // Adiciona na frente para manter a ordem inversa
            }

            System.out.println("Nomes na lista encadeada:");
            for (String name : linkedList) {
                System.out.println(name);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (FullStackException e) {
            throw new RuntimeException(e);
        }
    }
}

