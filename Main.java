
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.List;


public class Main {
    // Usando Set para armazenar os pratos unicos pedidos
    private Set<String> pratosUnicos = new HashSet<>();
    // Usando List para armazenar a ordem dos pedidos
    private List<Pedido> pedidos = new ArrayList<>();
    // Usando Queue para simular a fila de pedidos
    private Queue<Pedido> filaPedidos = new LinkedList<>();
    // Usando Deque para simular as ações do chef (retirar da fila e preparar)
    private Deque<Pedido> acoesChef = new LinkedList<> ();
    public static void main(String[] args) {

        Main main = new Main();
        main.adicionarPedidos();
        main.processarPedidos();
        main.exibirInformacoes();
    }

    public void adicionarPedidos() {
        Pedido pedido1 = new Pedido(1, "Pizza 4-queijos");
        Pedido pedido2 = new Pedido(2, "Hamburger com batatas fritas");
        Pedido pedido3 = new Pedido(3, "Salada Caesar");
        pratosUnicos.add(pedido1.getPrato());
        pratosUnicos.add(pedido2.getPrato());
        pratosUnicos.add(pedido3.getPrato());
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        filaPedidos.add(pedido1);
        filaPedidos.add(pedido2);
        filaPedidos.add(pedido3);
    }

    public void processarPedidos() {
        acoesChef.offer(filaPedidos.poll());
        acoesChef.offer(filaPedidos.poll());
    }

    public void exibirInformacoes() {
        System.out.println("Pratos Únicos Pedidos: " + pratosUnicos);
        System.out.println("Ordem dos Pedidos " + pedidos);
        System.out.println("Fila de Pedidos " + filaPedidos);
        System.out.println("Ações do Chef: " + acoesChef);
    }

    }

